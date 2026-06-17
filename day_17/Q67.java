import java.util.Scanner;
public class Q67 {
    public static void main(String[]args){
     Scanner scanner= new Scanner(System.in);
          System.out.println("enter the size of first array");
          int n= scanner.nextInt();
          int arr1[]= new int[n];
        System.out.println("enter the elements in first array:");
        for(int i=0;i<n;i++){
        arr1[i]= scanner.nextInt();
        }
         System.out.println("enter the size of second array");
          int m= scanner.nextInt();
          int arr2[]= new int[m];
        System.out.println("enter the elements in second array:");
        for(int i=0;i<m;i++){
        arr2[i]= scanner.nextInt();
        }
        System.out.println("intersection of array:");
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++){
                if(arr1[i]==arr2[j]){
                   System.out.print(arr1[i]+" ");
                   break;
                }
            }
            
            
        }}
    }

