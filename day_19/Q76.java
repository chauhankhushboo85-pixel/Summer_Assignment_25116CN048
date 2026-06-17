import java.util.Scanner;
public class Q76 {
    public static void main(String[]args){
     Scanner scanner= new Scanner(System.in);
          System.out.println("enter the row and column  of  square matrix");
          int n= scanner.nextInt();
        
          int arr[][]= new int[n][n];
        System.out.println("enter the elements in matrices:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
        arr[i][j]= scanner.nextInt();
        }}
       
        int sum=0;
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
            if(i==j){
             sum+=arr[i][j];
            }
           }
        }
        System.out.println("the sum of diagonal are:"+sum);
    }}



