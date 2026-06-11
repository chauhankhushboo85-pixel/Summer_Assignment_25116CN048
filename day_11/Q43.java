import java.util.Scanner;
public class Q43 {
    static int prime(int a){
        if(a<=1){
            return 0;
        }
        else{
        for(int i=2;i<a;i++){
            if(a%i==0){
               return 0; 
            }
        }
    }
       return 1;
}
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int result=prime(x);
        
        if(result==1){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a prime number");
        }
}
}
