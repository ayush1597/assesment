import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class ques8 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yy");
        System.out.println(simpleDateFormat.format(date));


    }
}
