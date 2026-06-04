import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count=0;
        int sum=0;
        int original_number=number;
        while(number>0)
     {
        number/=10;
        count++;
     }
        while(number>0){
            int digit = number%10;
            sum+=Math.pow(digit, count);
            number/=10;
        }
        if(sum==original_number){
            System.out.printf("%d is an Armstrong number",original_number);
        }
        else{
            System.out.printf("%d is not an Armstrong number",original_number);
        }
    }
}