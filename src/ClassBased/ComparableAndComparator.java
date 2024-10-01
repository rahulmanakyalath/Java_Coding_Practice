package ClassBased;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableAndComparator {//SORTING OF NUMBERS AND STRINGS USING COMPARATOR

    public void comparator() {

        Comparator<Integer> com = (num1 ,num2) -> num1%10 > num2%10 ? 1: -1;

        Comparator<Integer> com2 = (num1,num2)-> num1<num2?1 : -1;

        Comparator<String> stcom = new Comparator<String>(){


            @Override
            public int compare(String str1, String str2) {

                if(str1.length()>str2.length())
                return 1;
                else{
                    return -1;
                }
            }
        };


        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(23);
        nums.add(34);
        nums.add(41);
        nums.add(47);

        Collections.sort(nums,com2);
        System.out.println(nums);
        ArrayList<String> names = new ArrayList<String>();

        names.add("Rahul");
        names.add("Ram");
        names.add("Raju");
        names.add("Babu");

        Collections.sort(names,stcom);
        Collections.sort(names);
        System.out.println(names);
    }
}
