import java.util.Scanner;
public class Q53 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter the size of the array:");
            int n=scanner.nextInt();
        int arr[]= new int[n];
        System.out.println("enter the elements in array:");
        for(int i=0;i<n;i++){
        arr[i]= scanner.nextInt();
        }
        System.out.println("Enter the number to be  found: ");
         int a=scanner.nextInt();
         int m=0;
        for(int i=0;i<n;i++){
            if(arr[i]==a){
               m =1;
               break;

            }
            
        }
        if(m==1){
            System.out.println("the element is present in the array");
        }
        else{
         System.out.println("not present in array");
        }
        
        
     }}