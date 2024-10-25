package Leatcode150.ArrayAndString;

public class ZigZag {

    public String convert(String s, int numRows) {
       String str = "";
       char[][] arr = new char[numRows][numRows/2];
       int len  = s.length();
       int n = 0;
       int sl = 0;
       for(int i=0;i<numRows;i++){
           for(int j=0;j<numRows/2;j++){
               arr[i][j] = s.charAt(sl);
           }


       }



       return str;
    }
// solution from Google
    class Solution {

        public String convert(String s, int numRows) {
            if(numRows==1 || numRows>=s.length()) {
                return s;
            }

            StringBuilder str = new StringBuilder();
            for(int i=0; i<numRows; i++) {
                int one= (numRows*2)-2;
                int two= i*2;
                for(int j=i; j<s.length(); j+=one) {
                    str.append(s.charAt(j));
                    if(two>0 && two<one && (j+one)-two<s.length()) {
                        str.append(s.charAt((j+one)-two));
                    }
                }
            }
            return str.toString();
        }
    }
}
