package sorting_and_searching.assigment_problems;

import java.util.Arrays;

/**
 * Problem 5: The Dice Throw Tally (counting sort).
 *
 * <p>The count array has size 7 so that count[v] stores how many times value v was thrown. The
 * counts are printed, then each value v is written into the result count[v] times, from 1 to 6.
 * No two throws are ever compared with each other.
 *
 * <p>Complexity: time O(n + k) and space O(k) for the counts (plus the result), where k = 6.
 */
public class DiceThrowTally {

    private static final int FACES = 6;

    static int[] diceSort(int[] rolls) {
        int[] count = new int[FACES + 1];
        for (int roll : rolls) {
            count[roll]++;
        }

        StringBuilder counts = new StringBuilder("Counts:");
        for (int value = 1; value <= FACES; value++) {
            counts.append(' ').append(value).append(':').append(count[value]);
        }
        System.out.println(counts);

        int[] sorted = new int[rolls.length];
        int index = 0;
        for (int value = 1; value <= FACES; value++) {
            for (int times = 0; times < count[value]; times++) {
                sorted[index++] = value;
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        int[] sorted = diceSort(new int[]{4, 1, 6, 4, 2, 1, 4});
        System.out.println("Sorted: " + Arrays.toString(sorted));

        int[] ownSorted = diceSort(new int[]{6, 6, 3, 3, 3, 5});   // own input
        System.out.println("Sorted: " + Arrays.toString(ownSorted));
    }
}
