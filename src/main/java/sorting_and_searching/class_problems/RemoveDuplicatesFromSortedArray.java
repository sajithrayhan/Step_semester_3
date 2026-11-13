package sorting_and_searching.class_problems;

import java.util.Arrays;

/**
 * Problem 10: Remove Duplicates From a Sorted Array In-Place.
 *
 * <p>Two pointers: one scans the array, the other marks where the next unique value belongs.
 * Whenever the scanned value differs from the last kept value, it is copied to the next slot.
 *
 * <p>Complexity: time O(n). Additional space O(1), because only two index variables are used and
 * the array is modified directly, with no second array. That is why it qualifies as in-place.
 */
public class RemoveDuplicatesFromSortedArray {

    /** Returns the number of unique values; they occupy nums[0..count-1]. */
    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int uniqueCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueCount - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int length = removeDuplicates(nums);
        System.out.println("length = " + length);
        System.out.println("nums[0.." + (length - 1) + "] = " + Arrays.toString(Arrays.copyOf(nums, length)));
    }
}
