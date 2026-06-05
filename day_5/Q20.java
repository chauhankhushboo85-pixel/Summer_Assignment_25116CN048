import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int largest=1;
        for(int i=2;i<=n;i++){
            if(n%i==0){
               int count=0;
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count==2){
                    largest=i;
                }
            }
        }
        System.out.println("Largest prime factor of "+n+" is: "+largest);
    }
}