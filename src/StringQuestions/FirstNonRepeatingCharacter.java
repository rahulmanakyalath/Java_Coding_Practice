package StringQuestions;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*

 Implement a function to find the first non-repeated character in a string.




 */
public class FirstNonRepeatingCharacter {

    char st = 0;
    public char nonRep(String str) {
        StringBuffer sb = new StringBuffer(str);
        for(int i=0;i<str.length();i++){
            String str2 = str.substring(i+1);
            if(str2.lastIndexOf(sb.charAt(i))==-1)
            {
                st= sb.charAt(i);
               break;
            }
        }
        return st;
    }
    public char nonRep2(String str) {
        for(int i=0;i<str.length();i++) {

            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i)))
            {
                st=str.charAt(i);
                break;
            }
        }
        return st;
    }
    // From google
    public char findFirstNonRepeatedCharacter(String s) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            System.out.println(charCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '0'; // If no non-repeated character found
    }

}
