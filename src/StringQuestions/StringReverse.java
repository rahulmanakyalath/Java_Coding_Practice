package StringQuestions;

import java.util.ArrayList;

public class StringReverse {


    public void stringManupulations(){

        //PRINT THE SORTED LIST OF STRINGS USING STREAM

        ArrayList<String> str = new ArrayList<>();

        str.add("Rahul");
        str.add("Athira");
        str.add("Sreehari");

        str.stream().map(x->x.toUpperCase()).sorted().forEach(System.out::println);

        //Reversing a string

        //USING STRINGBUFFER
        StringBuffer sb = new StringBuffer("Biriyani is my favourite dish");

        ArrayList<String> lis = new ArrayList<>();

        lis.add(sb.toString());
        lis.add(sb.reverse().toString());

        lis.stream().forEach(System.out::println);

        //USING FOR LOOP

        String st = "Biriyani is my favourite dish";

        String rev="";
        for(int i=st.length()-1;i>=0;i--)
        {
           rev = rev+st.charAt(i);
        }
        System.out.println("reverse using for loop :- "+rev);

        //



    }
    public  String reverse(String s) {
        if (s.length() == 0) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
