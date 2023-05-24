package blindseventyfive.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public final boolean status = true;

    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        boolean flag = false;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],0);
            }
            else{
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {

    }
}
