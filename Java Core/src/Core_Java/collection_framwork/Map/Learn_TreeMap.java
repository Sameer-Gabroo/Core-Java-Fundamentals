package Core_Java.collection_framwork.Map;

import java.util.*;

public class Learn_TreeMap {

    static void main(String[] args) {

        // TreeMap is same as Hashmap just in this the keys are stored  in sorted form

        Map<String , Integer> Student = new TreeMap<>();

        //This is how we add the values in the hashmap
        Student.put("sameer",1105);
        Student.put("Asad",1106);
        Student.put("sadaf",1107);
        Student.put("Azhar",1108);
        Student.put("Aqib",1109);

        System.out.println(Student);

        // and if we try to add the duplicate key it will replace the value of existing key like

        Student.put("Aqib", 2323);

        System.out.println(Student);

        //we can also use putIfAbsent method

        Student.putIfAbsent("saqib",8987);

        System.out.println(Student);




    }
}
