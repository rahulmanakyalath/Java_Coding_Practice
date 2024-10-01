package JavaStreams;

import java.util.ArrayList;

public class StreamOperations {


    public void streamOp() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(24);
        numbers.add(38);
        numbers.add(1);
        numbers.add(7);
        numbers.add(90);

        //PRINT THE SUM OF SQUARES OF ALL THE ODD NUMBERS IN THE LIST ?

        Integer num = numbers.stream().filter(x ->x%2==1).map(x->x*x).reduce(0, (x,y)->x+y);//reduce(0, Integer::sum)use as  lambda expression.
        System.out.println("Sum of squares of all the odd numbers in the list ="+num);

        //PRINT ALL NUMBERS IN THE LIST USING forEach

        numbers.stream().sorted().forEach(x->System.out.println(x));//Lambda expression :- [System.out::println]



    }

}
