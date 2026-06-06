import java.util.Scanner;
public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binary = scanner.nextInt();
        int decimal = 0;
        int power = 0;
        while(binary>0){
            int digit =binary%10;
            decimal=decimal+digit*(int)Math.pow(2,power);
            power++;
            binary=binary/10;
        }
        System.out.println("Decimal representation: " + decimal);
    }
}