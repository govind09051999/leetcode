package blindseventyfive.arrays;

import java.util.Scanner;

public class BestTimeToBuySellStocks {

    public final boolean status = true;

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int lsv = Integer.MAX_VALUE;
        int max = 0;
        int tempDiff = 0;

        for(int i=0;i<n;i++){
            if(prices[i]<lsv) lsv = prices[i];
            tempDiff = prices[i] - lsv;
            if(max<tempDiff) max = tempDiff;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        BestTimeToBuySellStocks bestTimeToBuySellStocks = new BestTimeToBuySellStocks();
        int res = bestTimeToBuySellStocks.maxProfit(nums);
        System.out.println(res);
    }
}
