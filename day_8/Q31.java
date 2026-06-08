import java.util.Scanner;
public class Q31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            char a =1;
            for (int j = 1; j <= i; j++) {
                int d= a+64;
                char ch = (char) d;
                System.out.print(ch + " ");
                a++;

            }
            System.out.println();
        }
    }
}