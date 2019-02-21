//2. WAP to sorting string without using string Methods?.
import java.util.Scanner;
public class ques2 {
    public static void main(String[] args) {
        String string;
        Scanner input=new Scanner(System.in);
        System.out.println("enter a string");
        string=input.nextLine();
        System.out.println("original string:"+string);
        ques2 sort=new ques2();
        sort.stringsort(string);
    }
    private void stringsort(String string) {
        char temp;
        char[] str=string.toCharArray();
        for(int i=0;i<str.length;i++){
            for(int j=i+1;j<str.length;j++){
                if(str[i]>str[j]){
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        System.out.println("sorted string is:");
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]);
        }
    }
}