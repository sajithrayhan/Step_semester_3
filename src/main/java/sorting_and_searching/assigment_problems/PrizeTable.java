package sorting_and_searching.assigment_problems;

import java.util.Arrays;

/**
 * Problem 2: The Prize Table (selection sort, descending).
 *
 * <p>For each position, the highest mark among the unplaced marks is found and swapped into that
 * position. A round whose highest mark is already in place makes no swap and is not counted.
 *
 * <p>Complexity: time O(n squared) for every input, at most n - 1 swaps, space O(1).
 */
public class PrizeTable {

    /** Sorts the marks in descending order and returns the number of swaps made. */
    static int prizeTable(int[] marks) {
        int swaps = 0;
        for (int i = 0; i < marks.length - 1; i++) {
            int largestIndex = i;
            for (int j = i + 1; j < marks.length; j++) {
                if (marks[j] > marks[largestIndex]) {
                    largestIndex = j;
                }
            }
            if (largestIndex != i) {
                int temp = marks[i];
                marks[i] = marks[largestIndex];
                marks[largestIndex] = temp;
                swaps++;
            }
        }
        return swaps;
    }

    static void print(int[] marks) {
        int swaps = prizeTable(marks);
        System.out.println(Arrays.toString(marks) + " swaps = " + swaps);
    }

    public static void main(String[] args) {
        print(new int[]{45, 90, 60, 75});   // [90, 75, 60, 45] swaps = 2
        print(new int[]{80, 70, 60});       // [80, 70, 60] swaps = 0
        print(new int[]{10, 40, 20, 30, 50});   // own input
    }
}
