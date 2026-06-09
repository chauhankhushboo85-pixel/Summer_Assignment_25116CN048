import java.util.Scanner;
public class Q33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
         for (int i = 0; i < number; i++) {
            for(int j=0;j<number-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}