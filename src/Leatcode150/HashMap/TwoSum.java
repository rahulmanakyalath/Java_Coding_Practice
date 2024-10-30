package Leatcode150.HashMap;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hp = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
           if(!hp.containsKey(target-nums[i]))
               hp.put(nums[i],i);
           else
               return new int[]{i,hp.get(target-nums[i])} ;
        }
        return null;
    }
}
