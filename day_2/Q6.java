import java.util.Scanner;   
public class Q6 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        int r;
        int rev=0;
        for(int i=0;i<=number;i++){
            r=number%10;
            rev=rev*10+r;
            number=number/10;
        }
        System.out.println("Reverse of the number: " + rev);
    }
    
}
