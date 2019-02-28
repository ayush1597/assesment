// Override the default method of the interface.
interface DefaultMethodOverride{
    default int add(int a,int b){
        return a+b;
    }

}
public class Ques7{
    int add(int a,int b){
        return a-b;
    }

    public static void main(String[] args) {
       Ques7 override=new Ques7();
    System.out.println("method override"+override.add(6,4));
    }


}
