import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
String find;
         String string;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        string =sc.nextLine();
        System.out.println("enter the character for which you want to find the occurence");
        find=sc.next();
         if(string.contains(find)){
            int str_length=string.length();
            String c=string.replaceAll(find,"");
            int len=c.length();
            System.out.println(find+":has occured "+(str_length-len)+":times");
         }
    }
}
