package HashMapBasics;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {


    public void hashmapTest(){

        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("Rahul",828122178);
        hm.put("Amma",907282938);
        hm.put("Achan",984770938);
        hm.put("Athira",907282938);
        hm.put("Aiswarya",907282938);
        hm.put("Rahul",920712178);
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.get("Rahul"));
        System.out.println(hm.containsKey("Rahul"));

        //iterate each entry of hashmap

        for(Map.Entry<String,Integer> entry:hm.entrySet()){

            if(entry.getValue()==907282938)
            {
                System.out.println("key for the given value :- "+entry.getKey());
            }
        }


    }
}
