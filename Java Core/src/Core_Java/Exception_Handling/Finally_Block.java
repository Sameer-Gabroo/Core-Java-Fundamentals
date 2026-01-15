package Core_Java.Exception_Handling;

public class Finally_Block {

//    in this the finally block will run always weather is a exception or not it will alwasys run
//    and the only condition when finally block can not run is  if
//            1- there is exception inside the finally block
//            2- if the is system.exit which is used to stop the entire code


    static void main(String[] args) {
        int []Arr = {3,2,65,76,43};


        try {
            int a= Arr[8];
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Exception was handled ");
        }
    }
}
