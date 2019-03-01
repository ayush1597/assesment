//(2) Increment the number by 1 and return incremented value
interface  Increment{
    int increment(int a);
}
public class Ques1_part2 {

        public static void main(String[] args) {
            Increment increment = (a) -> {
                return ++a;
            };
            System.out.println(increment.increment(5));

        }
    }






