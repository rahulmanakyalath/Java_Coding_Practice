package Leatcode150.HashMap;

import java.util.HashMap;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>mag = new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        {
            char ch = magazine.charAt(i);
            if(!mag.containsKey(ch)){
                mag.put(ch,1);
            }
            else{
                mag.compute(ch,(k,v)->v+1);
            }
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);

            if(mag.containsKey(ch) && mag.get(ch) > 0){
                mag.compute(ch,(k,v)->v-1);
            }
            else{
                return false;
            }
        }
      return true;
    }
}
/*
 HashMap<Integer,Character>mag = new HashMap<>();
        HashMap<Integer,Character>ran = new HashMap<>();
        for(int i=0;i<ransomNote.length();i++)
        {
          ran.put(i,ransomNote.charAt(i));
        }
        for(int i=0;i<magazine.length();i++)
        {
            mag.put(i,magazine.charAt(i));
        }
 */