import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        int r;
        int sum=0;
        for(int i=0;i<=number;i++){
            r=number%10;
            sum=sum+r;
            number=number/10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
