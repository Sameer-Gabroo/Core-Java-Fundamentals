package Core_Java.collection_framwork.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Learn_LinkedHashset {
    static void main(String[] args) {


        // LinkedHashset is same as hashset but in this the values are stored in same pattern as we add becasue it is linked other than that its same


        Set<String> Teams = new LinkedHashSet<>();

        // This is how we  add the values in the LinkedHashset
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
