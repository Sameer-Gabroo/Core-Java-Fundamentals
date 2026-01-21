package Core_Java.AdvanceTopic.Generics.BoundedTypeParameters;


// Here we can bounf the Generic to use specifice data Type
//as we have extended the Number class this number class is the parent class of all number datatype like interger,float and double etc
//so we can not use Sting in this generics
public class Bouneded_Generics007 <T extends Number>{

    private T StudentRollNum;

    public T getStudentRollNum() {
        return StudentRollNum;
    }

    public void setStudentRollNum(T studentRollNum) {
        StudentRollNum = studentRollNum;
    }

}
class test{
    static void main(String[] args) {
        // here we have created the object but if we try to use string init it will through the erorr
        Bouneded_Generics007 test = new Bouneded_Generics007();
//        test.setStudentRollNum("1105");
        test.setStudentRollNum(1105);
        System.out.println(test.getStudentRollNum());

    }
}
