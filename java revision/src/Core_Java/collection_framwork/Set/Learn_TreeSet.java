package Core_Java.collection_framwork.Set;

import java.util.Set;
import java.util.TreeSet;

public class Learn_TreeSet {
    static void main(String[] args) {


        // treeset is same as hashset but in this when we add the values in tree set the value shored in sorted why

        Set<String> Teams = new TreeSet<>();

        // This is how we  add the values in the TreeSet
        Teams.add("Lahore");
        Teams.add("Karachi");
        Teams.add("Quetta");
        Teams.add("hyderabad");
        Teams.add("sialkot");

        System.out.println(Teams);
        // So now if we try to add the same value it will igonre that value and did not add that value in the array

        Teams.add("Karachi");

        System.out.println(Teams);


        // and we can also check find the value with contain method which will return true or false

        System.out.println(Teams.contains("Lahore"));


    }
}
