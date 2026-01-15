package Core_Java.collection_framwork.ArrayClass;

import java.util.Arrays;

public class ArraySearch {
    static void main(String[] args) {

        //Arrays class is the in which we can search merge fine delete like we can manupulate the array
        // we have to import the Arrays class from util class
        int[] Arr = {56,45,1,2,36,45,88,456,21,35,85};

        Arrays.sort(Arr);
        System.out.println(Arrays.toString(Arr));

//  to find the index of the key we must have to sort the arry first
        int ind =Arrays.binarySearch(Arr,88);
        System.out.println(ind);

        // So basically Arrays class is used to play with the arrays


    }
}
