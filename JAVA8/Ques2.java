//Create a functional interface whose method takes 2 integers and return one integer.
interface TwoIntegers{
   int returnone(int a ,int b);
 }
 class Ques2 {
    public static void main(String[] args) {
        TwoIntegers twoIntegers = (a, b) -> a;
    }
}
