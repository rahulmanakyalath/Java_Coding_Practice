package StringQuestions;

public class LongestPalindromeSubstring {


    public void checkPalindromeString(String str){
        StringBuffer st = new StringBuffer(str);
        if(str.equalsIgnoreCase(st.reverse().toString()))
            System.out.println("Its Palindrome");
        else
            System.out.println("Its  not  Palindrome");
    }
    public void substring(String str)
    {
       StringBuffer lsb = new StringBuffer();
       int length=0;
       for(int i=0;i<str.length();i++){
           for(int j=i+1;j<=str.length();j++)
           {
               if(str.substring(i,j).equalsIgnoreCase(new StringBuffer(str.substring(i,j)).reverse().toString())) {
                  if(length<str.substring(i,j).length())
                  {
                      length=str.substring(i,j).length();
                      lsb =new StringBuffer(str.substring(i,j));
                  }

               }
           }
       }
       System.out.println("Longest palindrome = "+lsb);
        System.out.println("Longest palindrome lenght = "+length);


    }

}
