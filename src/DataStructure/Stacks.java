package DataStructure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Stacks {

  public void stackImp(){

     Stack<String>stk = new Stack<>();
//     stk.add("ram");
//     stk.add("raju");
//     stk.add("babu");

     stk.push("23");
      stk.push("24");
      stk.push("25");

      System.out.println(stk);
     System.out.println(stk.pop());
  }
  public void stackWithDeque(){

      Deque<String> dstk = new ArrayDeque<>();//Deque is an interface so we need to create an object of a class which implement deque its ArrayDeque
//      dstk.add("Rahul");
//      dstk.add("Kumar");  //add will work as normal array operation.
//      dstk.add("Ms");

      dstk.push("Rahul");
      dstk.push("Kumar");
      dstk.push("Ms");

      dstk.pop();// remove last inserted element.
     System.out.println(dstk.peek());// print the last inserted element
      dstk.push("sunil");

      System.out.println(dstk);
  }
}
