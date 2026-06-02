import java.util.Scanner;

public class Q8 {
     public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        int r;
        int rev=0;
        int original_number = number; 
        while(number>0){
            r=number%10;
            rev=rev*10+r;
            number=number/10;
        }
        if(rev==original_number){
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    
}
}
