//Sum all the numbers greater than 5 in the integer list.

import java.util.Arrays;
import java.util.List;

public class Ques10 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,10,1,20,6);
        System.out.println(list.stream().filter(e->e>5).mapToInt(e->e).sum());
    }


}
