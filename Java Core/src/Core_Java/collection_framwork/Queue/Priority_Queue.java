package Core_Java.collection_framwork.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {

    static void main(String[] args) {

        //This is the PriorityQueue in this we can give priority to the element by the small number or large number or even we can create the custom condition and same we can do with string values

        Queue<Integer> Emergency = new PriorityQueue<>();

        //To add remove to check the next in line we use the same Queue methods like poll peek and offer

        Emergency.offer(100);
        Emergency.offer(23);
        Emergency.offer(95);
        Emergency.offer(4);


        // by default it will print the small value first and the gose upward
        System.out.println(Emergency);

        //we can check the next inline my peek
         System.out.println(Emergency.peek());

         // we can delete the element with the poll method it will delete the first value
        System.out.println(Emergency.poll());

        System.out.println(Emergency);





    }
}
