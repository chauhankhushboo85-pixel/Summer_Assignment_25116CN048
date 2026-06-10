import java.util.Scanner;
public class Q38 {
     public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        for(int i=number;i>=0;i--){
           for(int k=number-i;k>=0;k--){
            System.out.print(" ");
           }
           for(int j=2*i-2;j>=0;j--){
            System.out.print("*");
           }
           System.out.println();
        }
    } 
}
