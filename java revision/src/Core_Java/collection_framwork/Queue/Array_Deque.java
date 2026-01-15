package Core_Java.collection_framwork.Queue;

import java.util.ArrayDeque;

public class Array_Deque {

    static void main(String[] args) {
        //Arraydeque is used to add the values from the front and the end of the list like we can add delete or check the element from both side front and back

        ArrayDeque<String> ShowRoom = new ArrayDeque<>();



        // this is how we add the element is the arraydeque on first and last
        ShowRoom.addFirst("Bugati");
        ShowRoom.addFirst("Toyota");
        ShowRoom.addLast("Civic");
        ShowRoom.addLast("grandy");

        System.out.println(ShowRoom);
     // we can also peek first and last in this
        System.out.println(ShowRoom.peekFirst());
        System.out.println(ShowRoom.peekLast());


        // we can also poll first and last in Arraydeque
        System.out.println(ShowRoom.pollFirst());
        System.out.println(ShowRoom.pollLast());

        System.out.println(ShowRoom);


    }

}
