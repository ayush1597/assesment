//Create and access default and static method of an interface.
interface MethodImplementation{
    default String defaultshow(){
        return "default method implementation";
    }
    static String staticInterface(){
        return "static method implementation";
    }
}

public class Ques6 implements MethodImplementation{
    public static void main(String[] args) {
        Ques6 ques6=new Ques6();
        System.out.println("default method"+ques6.defaultshow());
        System.out.println("staticd method : "+MethodImplementation.staticInterface());

    }



}
