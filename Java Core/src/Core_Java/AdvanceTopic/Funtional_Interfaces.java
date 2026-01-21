package Core_Java.AdvanceTopic;

import java.util.function.Function;
import java.util.function.Predicate;

public class Funtional_Interfaces {

    // predicate is a funtional interface which return the boolean value true or false
    // this is the method which we have in predicate "boolean test(T t);"
    // this is just a simple funtional interface method which is generic to we also have to provide the type of variable
    Predicate <String>predicate = x -> x.isEmpty();


    static void main(String[] args) {
        Funtional_Interfaces funtionalInterfaces = new Funtional_Interfaces();
        System.out.println(funtionalInterfaces.predicate.test("")); // this will retun true
    }

    //we are learning this becasue this will help us to understand stream API


                            //Function

    // Funtion is a funtional interface means Funtion is a method in a interface which is fuctional
    // Funtion method looks like this "R apply(T t);" which take 2 inputs an return the result

    Function <Integer, Integer>function = t -> t*2;




}
