package Leatcode150.HashMap;

import java.util.HashMap;
import java.util.Objects;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        HashMap<Character, String> wordMap = new HashMap<>();
        HashMap<String, Character> revwordMap = new HashMap<>();
        if (str.length == pattern.length()) {
            for (int i = 0; i < pattern.length(); i++) {
                if (!wordMap.containsKey(pattern.charAt(i)) && !revwordMap.containsKey(str[i])) {
                    wordMap.put(pattern.charAt(i), str[i]);
                    revwordMap.put(str[i], pattern.charAt(i));
                } else {
                    if (revwordMap.containsKey(str[i]))
                        if (pattern.charAt(i) != revwordMap.get(str[i]))
                            return false;
                    if (wordMap.containsKey(pattern.charAt(i)))
                        if (!str[i].equalsIgnoreCase(wordMap.get(pattern.charAt(i))))
                            return false;
                }
            }
        } else
            return false;
        return true;
    }

//wordMap.get(pattern.charAt(i))!=str[i]
//wordMap.get(pattern.charAt(i)).isEmpty()&&revwordMap.get(str[i]).equals(null)

    //google simple answer
    public boolean wordPattern2(String pattern, String s) {
        HashMap<Character, String> hm = new HashMap<>();
        String parts[] = s.split(" ");
        if (pattern.length() != parts.length)
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String st = parts[i];
            if (!hm.containsKey(c)) {
                if (hm.containsValue(st)) {
                    return false;
                }
                hm.put(c, st);
            } else if (!hm.get(c).equals(st)) {
                return false;
            }
        }
        return true;
    }

    //3rd method
    public boolean wordPattern3(String pattern, String s) {
        HashMap<Character, String> hashMap = new HashMap<>();

        int i = 0;

        boolean can = true;
        String[] arr = s.split(" ");

        if (arr.length != pattern.length())
            return false;

        for (char ch : pattern.toCharArray()) {
            if (hashMap.containsKey(ch)) {
                if (!Objects.equals(hashMap.get(ch), arr[i])) {
                    return false;
                }
            } else {
                // check that we can add this value or there is actually
                // one item has it
                if (hashMap.containsValue(arr[i])) {
                    return false;
                }
                hashMap.put(ch, arr[i]);
            }
            i++;
        }

        return can;

    }
}