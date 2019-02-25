import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ques1
{
    public static void main(String[] args) {
        float sum=0;

        List<Float> list=new ArrayList();
        Scanner input=new Scanner(System.in);
        System.out.println("enter elements in list");
        for(int i=0;i<5;i++) {
         list.add(input.nextFloat());
        }
        ListIterator listIterator=list.listIterator();
    while(listIterator.hasNext()){
    sum+=(float)listIterator.next();
    }
        System.out.println("sum is:"+sum);
    }
}
