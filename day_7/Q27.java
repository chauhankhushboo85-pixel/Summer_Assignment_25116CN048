import java.util.Scanner;
public class Q27 {
        static int SumOfDigits(int n){
              int sum = 0;
            if (n == 0) {
                return 0;
            } else {
                for(int i = 0; i < n; i++){
                    int digit = n % 10;
                    sum += digit;
                    n=n/10;

                }
                return sum;
                
            }
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();
            int result = SumOfDigits(number);
            System.out.println("Sum of digits of " + number + " is: " + result);
        }
    
}
