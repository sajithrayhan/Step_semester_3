package sorting_and_searching.assigment_problems;

import java.util.Arrays;

/**
 * Problem 1: The Height Line-Up (bubble sort).
 *
 * <p>Each sweep compares neighbouring heights from left to right and swaps them when the left one is
 * taller. The whole line is printed after every sweep. A sweep with no swap means the line is
 * already in order, so it is printed and the sorting stops. At most n - 1 sweeps are needed.
 *
 * <p>Complexity: worst case O(n squared) time, best case O(n) (already sorted), space O(1).
 */
public class HeightLineUp {

    static void lineUp(int[] heights) {
        for (int pass = 1; pass < heights.length; pass++) {
            boolean swapped = false;
            for (int j = 0; j < heights.length - 1; j++) {
                if (heights[j] > heights[j + 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                    swapped = true;
                }
            }
            System.out.println("Pass " + pass + ": " + Arrays.toString(heights));
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        lineUp(new int[]{4, 2, 5, 1});
        System.out.println();
        lineUp(new int[]{1, 3, 2, 4});
        System.out.println();
        lineUp(new int[]{9, 7, 5, 3, 1});   // own input: a line in reverse order
    }
}
