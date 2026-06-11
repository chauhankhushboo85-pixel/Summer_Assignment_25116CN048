import java.util.Scanner;
public class Q42 {
    static int max(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the first no: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Enter the second no: ");
        int y = scanner.nextInt();
        int maximum_number=max(x,y);
        System.out.println("the maximum number is:"+maximum_number);
    } 
}
