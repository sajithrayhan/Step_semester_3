package linked_lists_and_stacks.class_problems;

import java.util.Locale;
import java.util.Scanner;

/**
 * Problem 5: Weekly Rainfall Analysis.
 *
 * <p>Seven readings are stored in a double[] array and everything is computed with loops. The index
 * of the largest reading is kept (not just its value) so the day number can be printed.
 *
 * <p>Complexity: time O(n) and space O(1) beyond the array, where n = 7 days.
 */
public class WeeklyRainfallAnalysis {

    private static final int DAYS = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] rainfall = new double[DAYS];
        for (int i = 0; i < DAYS; i++) {
            rainfall[i] = scanner.nextDouble();
        }

        StringBuilder readings = new StringBuilder("Rainfall (mm):");
        double total = 0;
        int wettestIndex = 0;
        int dryDays = 0;
        for (int i = 0; i < DAYS; i++) {
            readings.append(' ').append(rainfall[i]);
            total += rainfall[i];
            if (rainfall[i] > rainfall[wettestIndex]) {
                wettestIndex = i;
            }
            if (rainfall[i] == 0) {
                dryDays++;
            }
        }
        double average = total / DAYS;

        System.out.println(readings);
        System.out.println("Total Rainfall: " + total + " mm");
        System.out.println(String.format(Locale.US, "Average Rainfall: %.2f mm", average));
        System.out.println("Wettest Day: Day " + (wettestIndex + 1) + " (" + rainfall[wettestIndex] + " mm)");
        System.out.println("Total Dry Days: " + dryDays);
    }
}
