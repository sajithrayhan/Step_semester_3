package sorting_and_searching.assigment_problems;

import java.util.Arrays;

/**
 * Problem 3: The Library Book Shelf (insertion sort).
 *
 * <p>The new book is held in a variable, every bigger book to its left moves one place right, and
 * the new book drops into the gap. The shelf is printed after each book from the second onward.
 *
 * <p>Complexity: worst case O(n squared) time, best case O(n) (already sorted), space O(1).
 */
public class LibraryBookShelf {

    static void shelf(int[] books) {
        for (int i = 1; i < books.length; i++) {
            int newBook = books[i];
            int position = i - 1;
            while (position >= 0 && books[position] > newBook) {
                books[position + 1] = books[position];
                position--;
            }
            books[position + 1] = newBook;
            System.out.println("After placing " + newBook + ": " + Arrays.toString(books));
        }
    }

    public static void main(String[] args) {
        shelf(new int[]{30, 10, 40, 20});
        System.out.println();
        shelf(new int[]{5, 4, 3, 2, 1});   // own input: books in reverse order
    }
}
