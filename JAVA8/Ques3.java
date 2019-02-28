//Using (instance) Method reference create and apply add and subtract method and
// using (Static) Method reference create and apply multiplication method for the functional interface created.
interface ShowAddition{
int add(int a,int b);
}
interface ShowSubtraction{
    int subtract(int a,int b);
        }
 public class Ques3 {

int add(int a,int b){
    return a+b;
}
     static int subtract(int a,int b){
         return a+b;
     }

     public static void main(String[] args) {
         System.out.println("addition of two numbers using instance method reference");

         ShowAddition instancemethod=new Ques3()::add;
         System.out.println(instancemethod.add(1,2));
    System.out.println("subtraction of two numbers using static method reference");
    ShowSubtraction staticmethod=Ques3::subtract;
    System.out.println(staticmethod.subtract(6,3));
     }
 }
