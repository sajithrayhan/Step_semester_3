package sorting_and_searching.class_problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Problem 5: Pair With Target Sum (Unsorted).
 *
 * <p>Three approaches are shown, each with a different time and space trade-off:
 * <ul>
 *   <li>Brute force (two nested loops): time O(n squared), space O(1).</li>
 *   <li>Hash set of complements: time O(n) on average, space O(n).</li>
 *   <li>Sort a copy and use two pointers: time O(n log n), space O(n) for the copy.</li>
 * </ul>
 */
public class PairWithTargetSum {

    static boolean hasPairWithSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean hasPairWithSum(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int number : nums) {
            if (seen.contains(target - number)) {
                return true;
            }
            seen.add(number);
        }
        return false;
    }

    static boolean hasPairWithSumTwoPointers(int[] nums, int target) {
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);
        int left = 0;
        int right = sorted.length - 1;
        while (left < right) {
            int sum = sorted[left] + sorted[right];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] first = {2, 7, 11, 15};
        int[] second = {3, 4, 6};
        System.out.println(hasPairWithSum(first, 9));                 // true
        System.out.println(hasPairWithSum(second, 20));               // false
        System.out.println(hasPairWithSumBruteForce(first, 9));       // true
        System.out.println(hasPairWithSumTwoPointers(second, 20));    // false
    }
}
