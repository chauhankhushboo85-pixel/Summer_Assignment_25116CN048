import java.util.Scanner;
public class Q75 {
    public static void main(String[]args){
     Scanner scanner= new Scanner(System.in);
          System.out.println("enter the row of matrice");
          int n= scanner.nextInt();
          System.out.println("enter the column of matrice");
          int m= scanner.nextInt();
          int arr[][]= new int[n][m];
        System.out.println("enter the elements in matrice:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
        arr[i][j]= scanner.nextInt();
        }}
        System.out.println("the transpose matrice:");
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.print(arr[j][i]+" ");
        }
        System.out.println();
       }  

    }}  





