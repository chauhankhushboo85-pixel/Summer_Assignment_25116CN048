import java.util.Scanner;
public class Q39 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int nsp= n-1;
        for(int i=1;i<=n;i++){
            int a =i-1;

            for(int k=1;k<=nsp;k++){
            System.out.print(" ");
           }
           nsp--;
           
           for(int j=1;j<=i;j++){
            System.out.print(j);
           }
           for(int l=1;l<=i-1;l++){
            System.out.print(l);
            a--;
           }
           

         System.out.println();
        }
       
    }
}

