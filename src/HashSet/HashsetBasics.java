package HashSet;


import java.util.HashSet;
import java.util.Iterator;

public class HashsetBasics {


    public void hashsetBasics(){

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(10);
        set1.add(40);
        set1.add(50);
        set1.add(60);
        set1.add(10);
        set1.remove(50);

        Iterator<Integer> si = set1.iterator();
        while(si.hasNext())
        {
            System.out.println(si.next());
        }

        set1.stream().sorted().forEach(System.out::println);
        set1.stream().filter(s->s%2==0).map(s->s*2).sorted().forEach(System.out::println);


    }
}
