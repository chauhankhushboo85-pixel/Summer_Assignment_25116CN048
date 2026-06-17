import java.util.Scanner;
public class Q73 {
    public static void main(String[]args){
     Scanner scanner= new Scanner(System.in);
          System.out.println("enter the row of matrices");
          int n= scanner.nextInt();
          System.out.println("enter the column of matrices");
          int m= scanner.nextInt();
          int arr1[][]= new int[n][m];
        System.out.println("enter the elements in first matrices:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
        arr1[i][j]= scanner.nextInt();
        }}
        int arr2[][]= new int[n][m];
        System.out.println("enter the elements in second matrices:");
        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
        arr2[i][j]= scanner.nextInt();
        }}
        int sum[][]=new int[n][m];
        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
             sum[i][j]=arr1[i][j]+arr2[i][j]; 
           }
        }
         System.out.println("the sum of both the matrices are:");
        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
            System.out.print(sum[i][j]+" ");   
           }
           System.out.println();
        }

    }}  

