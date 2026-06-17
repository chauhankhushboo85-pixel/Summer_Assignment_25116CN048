import java.util.Scanner;
public class Q80 {

     public static void main(String[]args){
     Scanner scanner= new Scanner(System.in);
          
          System.out.println("enter the row and column of matrices");
          int n= scanner.nextInt();
          int m= scanner.nextInt();
          
         int arr[][]=new int[n][m];
         
        System.out.println("enter the elements in matrices:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
        arr[i][j]= scanner.nextInt();
            }}
     for(int i=0;i<m;i++){
        int sum_column=0;
        for(int j=0;j<n;j++){
           sum_column+=arr[j][i];

        }
         System.out.println("the sum of column is:"+ sum_column);
     }
     
    
    }       
}


