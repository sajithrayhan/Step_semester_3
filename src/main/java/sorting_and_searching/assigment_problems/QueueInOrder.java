package sorting_and_searching.assigment_problems;

/**
 * Problem 4: Is the Queue in Order?
 *
 * <p>One pass from index 1 compares each token with the one before it. Equal neighbours are
 * allowed, so only a strictly smaller token breaks the order. An empty queue or a queue of one
 * student never enters the loop and is always in order.
 *
 * <p>Complexity: time O(n) and additional space O(1).
 */
public class QueueInOrder {

    private static final int IN_ORDER = -1;

    /** Returns the index of the first token smaller than the one before it, or -1. */
    static int firstBreak(int[] tokens) {
        for (int i = 1; i < tokens.length; i++) {
            if (tokens[i] < tokens[i - 1]) {
                return i;
            }
        }
        return IN_ORDER;
    }

    public static void main(String[] args) {
        System.out.println(firstBreak(new int[]{3, 5, 5, 8, 6, 9}));   // 4
        System.out.println(firstBreak(new int[]{1, 2, 2, 7}));         // -1
        System.out.println(firstBreak(new int[]{}));                   // own input: empty queue, -1
        System.out.println(firstBreak(new int[]{9, 4}));               // own input: break at index 1
    }
}
