//Collect all the even numbers from an integer list.

import java.util.Arrays;
import java.util.List;

public class Ques9 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30,2,4,8,6,13,45,78);
        list.stream().filter(e->e%2==0).forEach(System.out::println);
    }
}
