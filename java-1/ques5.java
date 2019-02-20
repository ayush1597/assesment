import java.util.Scanner;

public class ques5 {


    public static void main(String args[])
    {
        int arr1[]=new int[5];
        int arr2[]=new int[5];
        System.out.println("Enter Element In array1:");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();

        }
        System.out.println("Enter Element In array2:");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        int l1=arr1.length;
        int l2=arr2.length;
        int i = 0, j = 0;
        while (i < l1 && j < l2)
        {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else
            {
                System.out.print(arr2[j++]+" ");
                i++;
            }
        }

    }
}




