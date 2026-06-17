import java.util.Scanner;
public class Q79 {

    
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
     for(int i=0;i<n;i++){
        int sum_row=0;
        for(int j=0;j<m;j++){
           sum_row+=arr[i][j];

        }
         System.out.println("the sum of row is:"+ sum_row);
     }
     
    
    }       
}
