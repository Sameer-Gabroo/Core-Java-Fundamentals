package Core_Java.collection_framwork.List;

import java.util.Stack;

public class Learn_stack {


    static void main(String[] args) {
        // this is how we create the Stack method
        Stack <String> animals = new Stack<>();

        // with this push we add the items in the stack
        animals.push("Cat");
        animals.push("Dog");
        animals.push("hourse");
        animals.push("goat");

       // with peek method we can check whcih  item is at the top of the stack
        System.out.println(animals.peek());

        // with this method we can delete the item which is on the top
        animals.pop();


        // so basically these the the three main method of stack pop , peek , push


    }

}
