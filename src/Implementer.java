import ClassBased.ComparableAndComparator;
import DataStructure.Stacks;
import DateManipulation.DateAndTime;
import Leatcode150.ArrayAndString.RemoveDuplicatesNums;
import Leatcode150.ArrayAndString.Remove_Element;
import StringQuestions.FirstNonRepeatingCharacter;
import StringQuestions.ReverseWords;

public class Implementer {


    public void implementer(){

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
//        DateAndTime at = new DateAndTime();
//
//        System.out.println(at.SmokerStatus("2023-7"));

//        Stacks st = new Stacks();
//        st.stackImp();
//        st.stackWithDeque();

//        FirstNonRepeatingCharacter ft = new FirstNonRepeatingCharacter();
//
//       System.out.println(ft.nonRep("rahulkumarms"));
//        System.out.println(ft.nonRep2("rahulkumarms"));
//        System.out.println(ft.findFirstNonRepeatedCharacter("rahulkumarms"));

//        Remove_Element re = new Remove_Element();
//       System.out.println(re.removeElement(new int[]{1, 2, 2,4, 5, 6, 2},2));

        ReverseWords rv = new ReverseWords();
       System.out.println(rv.reverseWords3("     Rahul            is            coding   "));

        RemoveDuplicatesNums rm =new RemoveDuplicatesNums();

        rm.removeDuplicates(new int[]{1,1, 2,2, 3,3,3,4,2,3,4,5,6,7,7,7,8,8,5, 4, 5});
    }
}
