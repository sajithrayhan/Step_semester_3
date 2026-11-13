package sorting_and_searching.class_problems;

/**
 * Problem 9: Pair Sum in a Sorted Array.
 *
 * <p>Two pointers start at both ends. If the sum is too small the left pointer moves right, and if
 * it is too large the right pointer moves left, so no pair is checked twice.
 *
 * <p>Complexity: time O(n) and additional space O(1).
 *
 * <p>A solution that ignores the sorted property needs either two nested loops (O(n squared) time,
 * O(1) space) or a hash set (O(n) time but O(n) space). The two-pointer method matches the
 * hash set's speed without the extra memory.
 */
public class PairSumInSortedArray {

    /** Returns the matching pair, or null if there is none. */
    static int[] pairSumSorted(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{nums[left], nums[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }

    static String describe(int[] pair) {
        return pair == null ? "Not Found" : "(" + pair[0] + ", " + pair[1] + ")";
    }

    public static void main(String[] args) {
        System.out.println(describe(pairSumSorted(new int[]{-4, -1, 0, 3, 5, 9}, 4)));   // (-1, 5)
        System.out.println(describe(pairSumSorted(new int[]{1, 2, 3}, 100)));            // Not Found
    }
}
