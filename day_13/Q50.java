import java.util.Scanner;
public class Q50 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("enter the length of array");
         int n=scanner.nextInt();
         int arr[]= new int[n];
         int sum=0;
        System.out.println("enter the elements in array:");
        for(int i=0;i<n;i++){
        arr[i]= scanner.nextInt();
        }
        for (int i=0;i<n;i++){
            sum+=arr[i];
            
        }
        int average=sum/n;
        System.out.println("the sum of elements in array are:"+sum);
         System.out.println("the average of elements in array are:"+average);

    
}}
