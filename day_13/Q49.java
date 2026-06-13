import java.util.Scanner;
public class Q49 {
    
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("enter the length of array");
         int n=scanner.nextInt();
         int arr[]= new int[n];
        System.out.println("enter the elements in array:");
        for(int i=0;i<n;i++){
        arr[i]= scanner.nextInt();
        }
        System.out.println("elements in array are:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);

        }
    
}}
