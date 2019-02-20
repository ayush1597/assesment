public class ques6 {
    public static void main(String[] args) {
    int[] array={1,2,5,2,5};
    int res=array[0];
    for(int i=1;i<array.length;i++){
        res= res ^ array[i];     //1^2^5^2^5
    }
    System.out.println("element that does not appear twice:"+ res);
    }
}



