package Core_Java.Exception_Handling;

public class throws_keyword {

    //So basically throws exception is used to handle the expecptions for method if we know that method can throw the exeption we add the throw exception in range method so who ever will call it they should have to andle the exception other wise the code will show erorr


    public void range(int[] a) throws Exception{    //this is how we add thorws exception
        int b=a[8];
    }

    static void main(String[] args)  {

        int[] ab = {3,4,5,6,7};
        throws_keyword Arr = new throws_keyword();
        try {
            Arr.range(ab);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
