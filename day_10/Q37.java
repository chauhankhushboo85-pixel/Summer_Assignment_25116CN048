import java.util.Scanner;
public class Q37{

   public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        for(int i=0;i<=number;i++){
           for(int k=0;k<=number-i;k++){
            System.out.print(" ");
           }
           for(int j=0;j<=2*i-2;j++){
            System.out.print("*");
           }
            System.out.println();
        }
       
   }
}