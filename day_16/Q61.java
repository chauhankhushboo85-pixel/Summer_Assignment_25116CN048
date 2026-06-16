import java.util.Scanner;
public class Q61 {
     public static void main(String[] args){
          Scanner scanner= new Scanner(System.in);
          System.out.println("enter the size of array");
          int n= scanner.nextInt();
          int arr[]= new int[n];
        System.out.println("enter the elements in array:");
        for(int i=0;i<n;i++){
        arr[i]= scanner.nextInt();
        }
        int actual_sum=0;
        int m=n+1;
       int  expected_sum=m*(m+1)/2;
       for (int i = 0; i < n; i++) {
           actual_sum+=arr[i];
           
       }
       int missing_number = expected_sum - actual_sum;
       System.out.println("the missing number is: "+missing_number);

    }
}