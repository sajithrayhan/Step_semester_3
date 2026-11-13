package sorting_and_searching.class_problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem 8: Spiral Order Traversal.
 *
 * <p>Four boundary pointers (top, bottom, left, right) mark the current ring. Each ring is read
 * clockwise, then the boundaries shrink inward.
 *
 * <p>Complexity: time O(m * n), because each element is added once. The output list needs O(m * n)
 * space; the traversal itself uses only O(1) additional space.
 */
public class SpiralOrderTraversal {

    static List<Integer> spiralOrder(int[][] grid) {
        List<Integer> result = new ArrayList<>();
        if (grid.length == 0) {
            return result;
        }
        int top = 0;
        int bottom = grid.length - 1;
        int left = 0;
        int right = grid[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int col = left; col <= right; col++) {
                result.add(grid[top][col]);
            }
            top++;
            for (int row = top; row <= bottom; row++) {
                result.add(grid[row][right]);
            }
            right--;
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    result.add(grid[bottom][col]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    result.add(grid[row][left]);
                }
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(spiralOrder(grid));   // [1, 2, 3, 6, 9, 8, 7, 4, 5]
    }
}
