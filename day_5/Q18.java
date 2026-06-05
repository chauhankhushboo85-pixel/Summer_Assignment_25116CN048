import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int r;
        int sum=0;
        int original=n;
        while(n>0){
            r=n%10;
            int fact=1;
            for(int j=1;j<=r;j++){
                fact=fact*j;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==original){
            System.out.println("It  is a strong number.");
        }
            else{
                System.out.println("It is not a strong number.");
            }
    }
}