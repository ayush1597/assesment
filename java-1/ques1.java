import java.util.Scanner;

public class myp {

    public static void main(String[] args) {
    String main_string,sub_string,replace_string;
    Scanner input=new Scanner(System.in);
    System.out.println("enter the string");
    main_string=input.nextLine();
     System.out.println("enter the substring to replace");
     sub_string=input.nextLine();
     System.out.println("enter the string to replace with");
     replace_string=input.nextLine();
System.out.println(main_string.replace(sub_string,replace_string));


    }
}
