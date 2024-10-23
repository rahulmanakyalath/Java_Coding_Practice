package StringQuestions;

public class ReverseWords {


    public String reverseWords(String s) {   //"rahul is   going to hit  "


        String newStr="";
        String[] st = s.trim().split(" ");//"\\s+
        for(int i=st.length-1;i>=0;i--)
        {
            if(!(st[i] =="")){
               newStr = newStr+st[i]+" ";
            }
        }

     return newStr.trim();
    }
// google method
    /*
    split("\\s+") will split the string into string of array with separator as space or multiple spaces.


     */
    public String reverseWords2(String s) {   //"rahul is   going to hit  "
        String newStr="";
        String[] st = s.trim().split("\\s+");//   "\\s+" it is the regex to spit the words with one or more spaces .
        for(int i=st.length-1;i>=0;i--)
        {
                newStr = newStr+st[i]+" ";
        }

        return newStr.trim();
    }
 /// using array to store and join method
    public String reverseWords3(String s) {
        String[] str=s.split("\\s+");
        int n=str.length;
        String[] arr=new String[n];
        int index=0;
        for(int i=n-1;i>=0;i--){
            arr[index++]=str[i];

        }
        String result = String.join(" ", arr).trim();
        return result;

    }
}
