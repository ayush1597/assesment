//Find the first even number in the integer list which is greater than 3.
import java.util.Arrays;
import java.util.List;
public class Ques12 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30,2,4,8,6,13,45,78);
System.out.println(list.stream().filter(e->e%2==0&&e>3).findFirst());
    }
}
