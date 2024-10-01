import ClassBased.ComparableAndComparator;
import ClassBased.Student;
import DateManipulation.DateAndTime;
import HashMapBasics.HashMapBasics;
import HashSet.HashsetBasics;
import JavaStreams.StreamOperations;
import StringQuestions.LongestPalindromeSubstring;
import StringQuestions.StringReverse;

import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ComparableAndComparator com = new ComparableAndComparator();

//        com.comparator();
//
//        ArrayList<Student>stdList = new ArrayList<>();
//        stdList.add(new Student(4,"Rahul"));
//        stdList.add(new Student(3,"Athira"));
//        stdList.add(new Student(1,"Sreehari"));
//        stdList.add(new Student(2,"Vidhya"));
//
//        Collections.sort(stdList);
//        System.out.println(stdList);
//
//        StreamOperations sp = new StreamOperations();
//        sp.streamOp();
//
//        StringReverse stm=new StringReverse();
//
//        stm.stringManupulations();
//        System.out.println(stm.reverse("Rahul"));

//        LongestPalindromeSubstring lp = new LongestPalindromeSubstring();
//
//        lp.checkPalindromeString("malayala");
//        lp.substring("englishs");

//        HashsetBasics hb = new HashsetBasics();
//
//        hb.hashsetBasics();

//        HashMapBasics hm = new HashMapBasics();
//
//        hm.hashmapTest();
        DateAndTime at = new DateAndTime();

        System.out.println(at.SmokerStatus("2023-7"));




    }
}