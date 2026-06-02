import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        int r;
        int product=1;
        for(int i=0;i<=number;i++){
            r=number%10;
            product=product*r;
            number=number/10;
        }
        System.out.println("Product of digits: " + product);
    }
    
}
