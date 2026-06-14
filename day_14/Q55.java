import java.util.Scanner;
public class Q55 {
    public static void main(String[] args){
          Scanner scanner= new Scanner(System.in);
          System.out.println("enter the size of array");
          int n= scanner.nextInt();
          int arr[]= new int[n];
        System.out.println("enter the elements in array:");
        for(int i=0;i<n;i++){
        arr[i]= scanner.nextInt();
        }
                int largest =arr[0];
          for(int i=0;i<n;i++){
            if(arr[i]>largest){
          largest=arr[i];

        }
    }
         int second_largest=arr[0];
         for(int i=0;i<n;i++){
           if(arr[i]!=largest&&arr[i]>second_largest){
            second_largest=arr[i];
           }
         }
         System.out.println("the second largest number in array is:"+second_largest);
          
         }}
            
        
    
