package sorting_and_searching.class_problems;

/**
 * Problem 7: Insert Position in a Sorted List.
 *
 * <p>Binary search finds the target, or the index where it would be inserted: when the loop ends,
 * low is the first index whose value is not smaller than the target.
 *
 * <p>Complexity: time O(log n) and additional space O(1). It scales to very large arrays and
 * frequent lookups because each step halves the remaining range.
 */
public class InsertPositionInSortedList {

    static int searchInsertPosition(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsertPosition(nums, 5));   // 2
        System.out.println(searchInsertPosition(nums, 2));   // 1
    }
}
