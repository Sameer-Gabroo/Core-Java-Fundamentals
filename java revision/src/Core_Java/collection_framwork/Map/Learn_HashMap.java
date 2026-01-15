package Core_Java.collection_framwork.Map;

import java.util.*;

public class Learn_HashMap {

    static void main(String[] args) {

        // In HashMap we can add the values in Key Values pair and as it is Hash it means the duplicate keys are not allowed

        Map<String , Integer> Student = new HashMap<>();

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
