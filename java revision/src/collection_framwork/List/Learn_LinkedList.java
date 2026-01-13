package collection_framwork.List;
import java.util.*;

public class Learn_LinkedList {

    static void main(String[] args) {

//       ArrayList = A Solid Block
//       Think of an ArrayList like a long bench where everyone sits shoulder-to-shoulder.
//       Structure: It uses a dynamic array internally.
//       Access: Super fast. If you want the 5th person, you go straight to seat #5.
//       Problem: If you want to squeeze a new person into seat #2, everyone from seat #2 to the end has to stand up and scoot over one spot. That is slow.
//
//      LinkedList = A Chain
//       Think of a LinkedList like a treasure hunt or a chain of people holding hands.
//       Structure: It uses a "Doubly Linked List" (Nodes). Each element knows who is before it and who is after it
//       Access: Slow. If you want the 5th person, you have to start at #1, ask them where #2 is, ask #2 where #3 is... until you get to #5
//       Advantage: If you want to add someone at spot #2, you just break the hand-holding between #1 and #2 and insert the new person. No one else has to move.



       //This is how we create a object in LinkedList and make sure we have to import the pakage java.util.
       // Array List in used to crate the dynamic array list we can delete remove and change the value in this list just we don't have to declear the length of array it will adjust by itself

       List<Integer> num = new LinkedList<>();

       //this is hoe we add the value in the Arraylist my add method
       num.add(30);
       num.add(42);
       num.add(55);
       num.add(85);
       System.out.println(num);
       //this is hoe we add the value on the specific index of the ArrayList it will overload the add method
       num.add(1,50);
       System.out.println(num);

       // this is how we will get the value in the Arraylist
       System.out.println(num.get(2));

       // this is how we can add the values in the first and last
       num.addFirst(46);
       num.addLast(78);
       System.out.println(num);

       num.remove(1);
        System.out.println(num);

       // and there are many more methods we can use same like add.
   }


}
