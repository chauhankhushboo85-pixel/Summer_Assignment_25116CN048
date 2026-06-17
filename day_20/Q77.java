import java.util.Scanner;
public class Q77{
public static void main(String[]args){
     Scanner scanner= new Scanner(System.in);
          System.out.println("enter the row and column of first matrices");
          int n= scanner.nextInt();
          int m=scanner.nextInt();
          System.out.println("enter the row and column of second matrices");
          int o= scanner.nextInt();
          int p=scanner.nextInt();
          if ( m!=o) {
              System.out.println("multiplication cannot be done"); 
          }
          int arr1[][]= new int[n][m];
        System.out.println("enter the elements in first matrices:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
        arr1[i][j]= scanner.nextInt();
        }}
        int arr2[][]= new int[o][p];
        System.out.println("enter the elements in second matrices:");
        for(int i=0;i<o;i++){
           for(int j=0;j<p;j++){
        arr2[i][j]= scanner.nextInt();
        }}
        int multi[][]= new int[n][p];
        System.out.println("the multiplication of matrice is:");
        for (int i=0;i<n;i++){
            for(int j=0;j<p;j++){
              for(int k=0;k<m;k++){
                multi[i][j]+=arr1[i][k]*arr2[k][j];
              }
            }
        }
        for (int  i=0;i<n;i++){
        for(int j=0;j<p;j++){
            System.err.print(multi[i][j]+" ");
        }
        System.out.println();
        }
    }}