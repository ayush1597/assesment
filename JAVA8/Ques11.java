//Find average of the number inside integer list after doubling it.


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Ques11 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30,2,4,8,6,13,45,78);
        System.out.println(list.stream().collect(Collectors.averagingInt(e->e*2)));
    }
}
