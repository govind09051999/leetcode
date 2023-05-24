package blindseventyfive.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

    public final boolean status = true;

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                res[0] = i;
                res[1] = map.get(target-nums[i]);
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("enter target");
        int target = sc.nextInt();

        TwoSum twoSum = new TwoSum();
        int [] res = twoSum.twoSum(nums,target);

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }

    }
}
