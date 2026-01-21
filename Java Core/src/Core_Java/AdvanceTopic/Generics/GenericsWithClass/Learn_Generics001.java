package Core_Java.AdvanceTopic.Generics.GenericsWithClass;

import java.util.ArrayList;
import java.util.List;

public class Learn_Generics001 {

    static void main(String[] args) {
 //for example we have linked list we simply create the list but added Sting , Integer and double
 // what will happen is it will store data but in the form of oject instead of string or integer data type becasue we cannot stor multiple data type in 1 array
 // but if we want to avoid this and ristrict it just to add string or integer type then we use Generics
// to check uncomment the object which we creaed with generic string and commet the without generic object it will through the erorr
// this is how we avoid the run time erorr while compile time we got the erorr

        List araylist = new ArrayList();
//        List <String>araylist = new ArrayList();
        araylist.add("sameer");
        araylist.add(123);
        araylist.add(123.2);

        System.out.println(araylist.get(0));
        System.out.println(araylist.get(1));
    }
}
