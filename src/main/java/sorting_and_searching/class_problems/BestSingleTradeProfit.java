package sorting_and_searching.class_problems;

/**
 * Problem 6: Best Single Trade Profit.
 *
 * <p>Single pass: keep the lowest price seen so far and the best profit if sold today.
 * Complexity: time O(n), additional space O(1).
 *
 * <p>Checking every pair of days takes O(n squared) time. At scale (for example 10^5 days) that is
 * about 10^10 comparisons against 10^5 for the single pass, so the single pass is preferable.
 */
public class BestSingleTradeProfit {

    static int maxProfit(int[] prices) {
        int lowestPrice = Integer.MAX_VALUE;
        int bestProfit = 0;
        for (int price : prices) {
            lowestPrice = Math.min(lowestPrice, price);
            bestProfit = Math.max(bestProfit, price - lowestPrice);
        }
        return bestProfit;
    }

    /** Every pair of days: O(n squared), shown for comparison. */
    static int maxProfitBruteForce(int[] prices) {
        int bestProfit = 0;
        for (int buy = 0; buy < prices.length; buy++) {
            for (int sell = buy + 1; sell < prices.length; sell++) {
                bestProfit = Math.max(bestProfit, prices[sell] - prices[buy]);
            }
        }
        return bestProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));              // 5
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));                 // 0
        System.out.println(maxProfitBruteForce(new int[]{7, 1, 5, 3, 6, 4}));    // 5
    }
}
