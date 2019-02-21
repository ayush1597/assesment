public class ques3_part1 {
    public static void main(String[] args) {
        try {
         Class.forName("anyclass");
        }
        catch(ClassNotFoundException e) {
         e.printStackTrace();
        }
    }
}


