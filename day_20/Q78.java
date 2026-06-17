import java.util.Scanner;
public class Q78 {
    public static void main(String[]args){
     Scanner scanner= new Scanner(System.in);
          
          System.out.println("enter the row and column of matrices");
          int n= scanner.nextInt();
          
         int arr[][]=new int[n][n];
         
        System.out.println("enter the elements in matrices:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
        arr[i][j]= scanner.nextInt();
            }}
     
     int is_symmetric=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(arr[i][j]!=arr[j][i]){
             is_symmetric=1;
             break;
            }
        }
       }  
       if(is_symmetric!=1){
        System.out.println("this matrice is symmetric");
       }
       else{
        System.err.println("it is not symmetric");
       }

       }
}

