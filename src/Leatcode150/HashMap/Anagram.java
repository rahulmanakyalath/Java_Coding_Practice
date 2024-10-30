package Leatcode150.HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer>hp1 = new HashMap<>();
        HashMap<Character,Integer>hp2 = new HashMap<>();
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++){
            if(!hp1.containsKey(s.charAt(i)))
                hp1.put(s.charAt(i),1);
            else
                hp1.compute(s.charAt(i),(k,v)->v+1);
            if(!hp2.containsKey(t.charAt(i)))
                hp2.put(t.charAt(i),1);
            else
                hp2.compute(t.charAt(i),(k,v)->v+1);
        }
        if(hp1.equals(hp2))
            return true;
        return false;
    }

    public boolean isAnagram2(String s, String t) {
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
}
