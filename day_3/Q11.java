import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First no: ");
        int first_no = scanner.nextInt();
        System.out.println("Enter the second no: ");
        int second_no = scanner.nextInt();
            
       int gcd=0;
       for(int i=1;i<=first_no&&i<=second_no;i++){
            if(first_no%i==0 && second_no%i==0){
                gcd = i;
            }
        }
        System.out.printf("the GCD of %d and %d is %d",first_no,second_no,gcd);
    }
}