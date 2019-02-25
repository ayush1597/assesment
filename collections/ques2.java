import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ques2 {
    public static void main(String[] args) {
        String string="";
        Scanner input=new Scanner(System.in);
        System.out.println("enter  a string");
        string=input.nextLine();
       unique_char(string);
    }
    private static void unique_char(String string) {
        Set<Character> unique_characters=new HashSet();
   for(int i=0;i<string.length();i++){
       unique_characters.add(string.charAt(i));}
     Iterator iterator=unique_characters.iterator();
       while(iterator.hasNext())
       {
       System.out.println(iterator.next());}
   }
}
