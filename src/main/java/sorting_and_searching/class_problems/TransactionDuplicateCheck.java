package sorting_and_searching.class_problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Problem 3: Transaction Duplicate Check.
 *
 * <p>Chosen solution: a HashSet. Each ID is inserted once; if add() reports that the ID is already
 * present, a duplicate exists. Complexity: time O(n) on average, additional space O(n).
 *
 * <p>Alternative with less memory: sort a copy of the IDs and compare neighbours. This needs only
 * the copy (or O(1) extra space if sorting in place) but takes O(n log n) time. A nested-loop check
 * uses O(1) extra space but O(n squared) time.
 *
 * <p>Trade-off: the HashSet spends memory to save time, which is the right choice for a
 * time-sensitive check over millions of transactions.
 */
public class TransactionDuplicateCheck {

    static boolean hasDuplicate(String[] transactionIds) {
        Set<String> seen = new HashSet<>();
        for (String id : transactionIds) {
            if (!seen.add(id)) {
                return true;
            }
        }
        return false;
    }

    /** Alternative approach: sort a copy, then compare adjacent IDs. */
    static boolean hasDuplicateBySorting(String[] transactionIds) {
        String[] copy = Arrays.copyOf(transactionIds, transactionIds.length);
        Arrays.sort(copy);
        for (int i = 1; i < copy.length; i++) {
            if (copy[i].equals(copy[i - 1])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] withDuplicate = {"TXN1001", "TXN1002", "TXN1003", "TXN1002", "TXN1004"};
        String[] allUnique = {"TXN2001", "TXN2002", "TXN2003"};
        System.out.println(hasDuplicate(withDuplicate));            // true
        System.out.println(hasDuplicate(allUnique));                // false
        System.out.println(hasDuplicateBySorting(withDuplicate));   // true
        System.out.println(hasDuplicateBySorting(allUnique));       // false
    }
}
