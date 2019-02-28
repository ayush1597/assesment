//3) Concatination of 2 string                                                             Parameter (String , String ) Return (String)

import java.util.Comparator;

interface Concatenate{
    String con(String a,String b);
}
public class Ques1_part3 {

    public static void main(String[] args) {
        Concatenate concatenate=(a,b)-> {
            return a.concat(b);
        };
        System.out.println(concatenate.con("a","b"));

    }
}

