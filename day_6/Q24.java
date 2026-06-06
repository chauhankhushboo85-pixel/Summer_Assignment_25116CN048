import java.util.Scanner;
public class Q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power of the number: ");
        int power = scanner.nextInt();
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        System.out.println("Result: " + result);
    }
}