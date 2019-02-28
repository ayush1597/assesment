//(1) First number is greater than second number or not
interface greaterthan{
    boolean compare(int a,int b);
}
public class Ques1_part1 {
    public static void main(String[] args) {
        greaterthan greaterthan=(a,b)->{
            boolean check=a>b ?true:false ;
        return check;
        };
        System.out.println("first number is greater: "+greaterthan.compare(4,5));
    }
}
