import java.util.Scanner;
public class Q45 {
 static int reverse(int a){
    int r;
        int rev=0;
        while(a>0){
            r=a%10;
            rev=rev*10+r;
            a=a/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        int result=reverse(number);
        if(result==number){
            System.out.println("palindrome no");
        }
        else{
            System.out.println("not a palindrome");
        }
    
}}

