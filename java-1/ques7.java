public class ques7 {


    static String firstname="ayush";
    static String lastname="sharma";
    static int age=22;
    //static block
     static {
        System.out.println("output from static block");
        System.out.println("firstname:"+firstname+"\nlastname:"+lastname+"\nage:"+age);
    }
    //static method
    static void show_info(){
        System.out.println("output from static method");
        System.out.println("firstname:"+firstname+"\nlastname:"+lastname+"\nage:"+age);
    }

    public static void main(String[] args) {
        ques7.show_info();
        //static variables which are called by using class name
        System.out.println("output from static variable");
        System.out.println("firstname:"+ques7.firstname+"\nlastname:"+ques7.lastname+"\nage:"+ques7.age);
    }
}




