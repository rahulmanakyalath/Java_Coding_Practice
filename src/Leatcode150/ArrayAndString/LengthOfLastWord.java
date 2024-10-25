package Leatcode150.ArrayAndString;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if(s.trim().lastIndexOf(" ")!=-1)
            return s.trim().length()-1-s.trim().lastIndexOf(" ");
        return s.trim().length();
    }
}
