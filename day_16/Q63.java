import java.util.Scanner;
public class Q63 {
    public static void main(String[] args){
          Scanner scanner= new Scanner(System.in);
          System.out.println("enter the size of array");
          int n= scanner.nextInt();
          int arr[]= new int[n];
        System.out.println("enter the elements in array:");
        for(int i=0;i<n;i++){
        arr[i]= scanner.nextInt();
        }
        System.out.println("enter the sum of array");
          int sum= scanner.nextInt();
          int found=0;
          for (int  i= 0; i < n; i++) {
             for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("pair:"+arr[i]+" "+arr[j]);
                    found=1;
                }
             }
             
             }
             if(found!=1){
                System.out.println("pair not found"); 
          }
        }

    
}
