import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int first_no=0;
        int second_no=1;
        for(int i=0;i<number;i++){
            System.out.printf("%d ",first_no);
            int next_no = first_no + second_no;
            first_no = second_no;
            second_no = next_no;
        }

    }      
}