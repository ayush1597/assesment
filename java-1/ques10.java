public class ques10 {
    public static void main(String[] args) {
double double1=9999.9d,double2=9999.65d;
String string1="to",string2="the",string3="new";
        int int1=10,int2=11;
        float float1=96.4f,float2=99.5f;
        ques10 object=new ques10();
        object.add(int1,int2);
        object.add(double1,double2);
        object.multiply(int1,int2);
        object.multiply(float1,float2);
        object.concatenate(string1,string2);
        object.concatenate(string1,string2,string3);
    }

    private void concatenate(String string1, String string2, String string3) {

        System.out.println("concatenation of two string :"+string1.concat(string2).concat(string3));

    }
    private void concatenate(String string1, String string2) {
    System.out.println("concatenation of two string :"+string1.concat(string2));
    }
    private void multiply(float float1, float float2) {
        System.out.println("multiplication of two float numbers:"+(float1*float2));
    }

    private void multiply(int int1, int int2) {
        System.out.println("multiplication of two integer numbers:"+(int1*int2));

    }

    private void add(double double1, double double2) {
        System.out.println("addition of two double number:"+(double1+double2));

    }
    private void add(int int1, int int2) {
    System.out.println("addition of two integer number:"+(int1+int2));

    }
}
