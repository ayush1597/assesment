import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
int lowercase=0,uppercase=0,digits=0,special_characters=0;

        char current_Character;
        String string,specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        Scanner input= new Scanner(System.in);
        System.out.println("enter the string");
        string=input.nextLine();
       int string_length=string.length();
        for(int i=0;i<string.length();i++){
            current_Character=string.charAt(i);
        if(Character.isLowerCase(current_Character)){
            lowercase++;
        }
        else if(Character.isUpperCase(current_Character)){
            uppercase++;

          }
        else if (Character.isDigit(current_Character)){
         digits++;
          }

          else if (specialChars.contains(String.valueOf(current_Character))){
              special_characters++;
        }
            }
        System.out.println("NO. of lowercase:"+lowercase+" percentage:"+pecentage(lowercase,string_length)+"%");
        System.out.println("NO. of uppercase:"+uppercase+" Percentage:"+pecentage(uppercase,string_length)+"%");
        System.out.println("NO. of digits:"+digits+" Percentage"+pecentage(digits,string_length)+"%");
        System.out.println("NO. of special characters:"+special_characters+" Percentage:"+pecentage(special_characters,string_length)+"%");
    }
    private static float pecentage(int lowercase, int string_length) {
        return ((float)lowercase/(float)string_length)*100;
    }
}