package Leatcode150.ArrayAndString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicatesNums {

    public int removeDuplicates(int[] nums) {
      int count =0;

      HashSet<Integer> hs = new HashSet<>();
      for(int num : nums)
      {
          hs.add(num);
      }
        Iterator<Integer> si = hs.stream().sorted().iterator();
      int m=0;
        while(si.hasNext())
        {
            nums[m]= si.next();
            m++;
        }
        System.out.println("Stream output");
        hs.stream().sorted().forEach(System.out::println);
        return hs.size();
    }
//google code
    public int removeDuplicates2(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap();
        ArrayList<Integer> parsed = new ArrayList<>();
        for (int num: nums){
            if (!map.containsKey(num)) {
                map.put(num,true);
                parsed.add(num);
            }
        }
        for (int i = 0; i < parsed.size(); i++) {
            nums[i] = parsed.get(i);
        }
        return parsed.size();
    }
}

