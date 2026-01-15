package Core_Java.collection_framwork.Queue;

import java.util.*;

public class Queue_Linkedlist {

    static void main(String[] args) {


//        Why use LinkedList as a Queue?
//        A LinkedList is actually the perfect structure for a Queue.
//        Remember that a Queue is FIFO (First-In, First-Out). You stand in line, and the person at the front leaves first.
//        Adding to the back: LinkedList has a pointer to the "tail", so adding a new node is instant.
//        Removing from the front: LinkedList has a pointer to the "head", so removing the first node is instant (just update the link).
//        If you tried to do this with an ArrayList, it would be terrible. Removing the first item in an array means shifting every single other item forward one spot.
//        LinkedList doesn't have to shift anything—it just unhooks the first chain link.


        // It use the FIFO method like first come first out
        Queue<String> Nadra = new LinkedList<>() ;


        //we use offer method to add the values in the Queue method
        Nadra.offer("sameer");
        Nadra.offer("asad");
        Nadra.offer("kanza");
        Nadra.offer("haris");

        System.out.println(Nadra);

        // This poll is used to to remove the element which come first in this senario the first element was sameer so sameer will me removed first
        System.out.println(Nadra.poll());

        // this peek methis is used to see the next elemnt of the queue like how is next to poll
        System.out.println(Nadra.peek());






    }
}
