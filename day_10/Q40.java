import java.util.Scanner;
public class Q40 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print((char)('A'+ j));
            }
            
            for(int l=i-2;l>=0;l--){
             System.out.print((char)('A' + l));
            }  
            System.out.println();
        }
        }
    }
    
    

