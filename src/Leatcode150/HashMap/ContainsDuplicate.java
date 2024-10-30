package Leatcode150.HashMap;

import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>maps = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!maps.containsKey(nums[i]))
                maps.put(nums[i],i);
            else{
                if(i-maps.get(nums[i])<= k)
                    return true;
                else
                    maps.put(nums[i],i);
            }
        }
        return false;
    }

}
