import java.util.*;

public class ques3 {
    public static void main(String[] args) {
        String string = "hello my name is aayyuusshh";
        char[] chars = string.toCharArray();
        Map<Character, Integer> duplicate_characters = new HashMap<>();

        for (char c : chars) {
            if (duplicate_characters.containsKey(c)) {
                int counter = duplicate_characters.get(c);
                duplicate_characters.put(c, ++counter);
            } else {
                duplicate_characters.put(c, 1);
            }
        }
        for (char c : duplicate_characters.keySet()) {
            //excluding the white space
            if (duplicate_characters.get(c) > 1 && (!Character.isWhitespace(c))) {
                System.out.println("value:" + c + "\trepeats :" + duplicate_characters.get(c));
            }
        }
    }


}


