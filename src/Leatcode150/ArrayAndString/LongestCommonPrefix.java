package Leatcode150.ArrayAndString;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String str = "";
        String sub = "";
        if (strs.length > 0) {
            str = strs[0];
        }
        int flag;
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            flag = 0;
            for (String st : strs) {
                if (i < st.length())
                    if (ch == st.charAt(i))
                        flag++;
            }
            if (flag == strs.length) {
                sub = sub + ch;
            } else {
                return sub;
            }
        }
        return str;
    }

    //from google
    public String longestCommonPrefix2(String[] strs) {
        Arrays.sort(strs);// they Sort the array so just need to compare first and last strings
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int idx = 0;
        while (idx < s1.length() && idx < s2.length()) {
            if (s1.charAt(idx) == s2.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}
