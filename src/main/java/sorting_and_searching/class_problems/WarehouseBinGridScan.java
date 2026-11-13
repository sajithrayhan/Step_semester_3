package sorting_and_searching.class_problems;

/**
 * Problem 2: Warehouse Bin Grid Scan.
 *
 * <p>Scans the grid row by row, left to right, keeping a running total and the first bin that
 * holds the largest count (a later bin replaces it only if it is strictly larger).
 *
 * <p>Complexity: time O(m * n), because every bin is visited once. Additional space O(1).
 */
public class WarehouseBinGridScan {

    /** Returns {total, maxRow, maxCol}. */
    static int[] warehouseSummary(int[][] grid) {
        int total = 0;
        int maxValue = Integer.MIN_VALUE;
        int maxRow = -1;
        int maxCol = -1;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                total += grid[row][col];
                if (grid[row][col] > maxValue) {
                    maxValue = grid[row][col];
                    maxRow = row;
                    maxCol = col;
                }
            }
        }
        return new int[]{total, maxRow, maxCol};
    }

    public static void main(String[] args) {
        int[][] grid = {
                {4, 9, 2},
                {7, 1, 6},
                {3, 12, 5}
        };
        int[] summary = warehouseSummary(grid);
        System.out.println("total = " + summary[0] + ", maxCoordinate = (" + summary[1] + ", " + summary[2] + ")");
    }
}
