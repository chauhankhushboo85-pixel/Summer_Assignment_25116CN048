import java.util.Scanner;
public class Q44 {
    static int factorial(int a){
        if(a==1||a==0){
            return 1;
        }
        else{
            return a*factorial(a-1);
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int result=factorial(x);
       System.out.println("the factorial of number is:"+result);
    }  
}
