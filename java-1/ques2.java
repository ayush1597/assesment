import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String input_string=input.nextLine().toLowerCase();
        input_string = input_string.replaceAll("[$&+,:;=?@#|'<>.^*()%!-]", " ");
        String[] words=input_string.split(" ");

        int count_repeating_word = 1;

        for(int i=0; i<words.length; i++)
        {
            for(int j=i+1; j<words.length; j++)
            {
                if(words[i].equals(words[j]))
                {
                    count_repeating_word=count_repeating_word+1;
                    words[j]="0";
                }
            }
            if(words[i]!="0" && count_repeating_word>1 )
                System.out.println(words[i]+"--"+count_repeating_word);
            count_repeating_word=1;
        }
    }
}
