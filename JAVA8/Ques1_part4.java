//      (4) Convert a string to uppercase and return .
interface uppercase{
    String con(String a);

}
public class Ques1_part4{
   public static void main(String[] args) {
        uppercase uppercase=(a)-> {
            return a.toUpperCase();
        };
        System.out.println(uppercase.con("accsc"));
    }
}






