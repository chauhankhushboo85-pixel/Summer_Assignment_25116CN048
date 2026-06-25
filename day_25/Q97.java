import java.util.Arrays;
import java.util.Scanner;
public class Q97 {
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
        int[]sorted_arr1=arr1.clone();
        Arrays.sort(sorted_arr1);
        int[]sorted_arr2=arr2.clone();
        Arrays.sort(sorted_arr2);
        int k=n+m;
        int[]merged=new int[k];
        System.arraycopy(sorted_arr1,0,merged,0,n);
        System.arraycopy(sorted_arr2,0,merged,n,m);
        System.out.println(Arrays.toString(merged));

}}
