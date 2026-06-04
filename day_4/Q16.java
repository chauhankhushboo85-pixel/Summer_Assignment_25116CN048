import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending range: ");
        int end = scanner.nextInt();  
        
        System.out.printf("Armstrong numbers between %d and %d are: ", start, end);
        for (int i = start; i <= end; i++) {
             int count = 0;
            int sum = 0;
             int number = i;
            int original_number = i;
             while(number> 0) {
                number /= 10;
                count++;
            }
                number = i;
            while (number > 0) {
                int digit = number % 10;
                sum += Math.pow(digit, count);
                number /= 10;
            }
            if (sum == original_number) {
                System.out.printf("%d ", original_number);
            }
        }

        
    }
}