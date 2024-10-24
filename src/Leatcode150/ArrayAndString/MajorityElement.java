package Leatcode150.ArrayAndString;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) { //O(n)

        int num=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.compute(nums[i], (k, v) ->  (v == null) ? 1 : v+1);
        }
          num = Collections.max(hm.entrySet(), Map.Entry.comparingByValue()).getKey();
        return num;
    }
/*
    O(n log n).


 */
    //google method
        public int majorityElement2(int[] nums) {
            Arrays.sort(nums);// majority element will occupy the middle position of the array if sorted .
            int n = nums.length;
            return nums[n/2];
        }
}
