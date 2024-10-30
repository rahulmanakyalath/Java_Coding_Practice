package Leatcode150.HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length())
         return false;
        HashMap<Character,Character> cha = new HashMap<>();
        for(int i =0;i<s.length();i++) {
           if(!cha.containsKey(s.charAt(i)))
           {
               if(cha.containsValue(t.charAt(i)))
                   return false;
               cha.put(s.charAt(i),t.charAt(i));
           }
           else{
               if(!cha.get(s.charAt(i)).equals(t.charAt(i)))
                   return false;
           }
        }
   return true;
    }
}
/*
         if (shp.containsKey(s.charAt(i)))
                shp.compute(s.charAt(i), (k, v) -> v + 1);
            else
                shp.put(s.charAt(i), 1);
            if (thp.containsKey(t.charAt(i)))
                thp.compute(t.charAt(i), (k, v) -> v + 1);
            else
                thp.put(t.charAt(i), 1);
        }
        Object[] srr = shp.values().stream().sorted().toArray();
        Object[] trr = thp.values().stream().sorted().toArray();
           if(srr.length!=trr.length)
               return false;
        for(int i=0;i<srr.length;i++)
        {
            if(srr[i]!=trr[i])
                return false;
        }
return true;
 */