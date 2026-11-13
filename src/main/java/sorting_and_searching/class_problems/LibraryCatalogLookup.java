package sorting_and_searching.class_problems;

/**
 * Problem 1: Library Catalog Lookup.
 *
 * <p>The catalog is sorted by ISBN, so binary search finds a book by repeatedly halving the range.
 *
 * <p>Complexity: time O(log n) per lookup and additional space O(1).
 *
 * <p>Why it suits this catalog: queries vastly outnumber updates, so the one-time cost of keeping
 * the catalog sorted is paid back by every fast lookup. A linear scan would cost O(n) per query.
 */
public class LibraryCatalogLookup {

    private static final String NOT_FOUND = "Not Found";

    static class BookRecord {
        private final String isbn;
        private final String title;

        BookRecord(String isbn, String title) {
            this.isbn = isbn;
            this.title = title;
        }
    }

    static String findBook(BookRecord[] catalog, String targetIsbn) {
        int low = 0;
        int high = catalog.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = catalog[mid].isbn.compareTo(targetIsbn);
            if (comparison == 0) {
                return catalog[mid].title;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return NOT_FOUND;
    }

    public static void main(String[] args) {
        BookRecord[] catalog = {
                new BookRecord("0001112223", "Introduction to Algebra"),
                new BookRecord("0002223334", "Beginning Python"),
                new BookRecord("0003334445", "Classic Mythology"),
                new BookRecord("0004445556", "Data and Society"),
                new BookRecord("0005556667", "European History")
        };
        System.out.println(findBook(catalog, "0003334445"));   // Classic Mythology
        System.out.println(findBook(catalog, "0009998887"));   // Not Found
    }
}
