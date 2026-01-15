package Core_Java.collection_framwork.Set;

import java.util.HashSet;
import java.util.Set;

public class Learn_Hashset {
    static void main(String[] args) {


        // hashset store the values randomly the reason we use hashset is it dosen't allow duplicate values.

        Set<String> Teams = new HashSet<>();

        // This is how we  add the values in the Hashset
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
