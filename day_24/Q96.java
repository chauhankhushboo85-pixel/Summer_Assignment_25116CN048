import java.util.Scanner;

public class Q96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the sentence:");
        String n = scanner.nextLine();
        String removed = "";
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (removed.indexOf(ch) == -1) {
                removed += ch;
            }
        }
        System.out.println(" string after removing duplicate:" + removed);
        scanner.close();
    }
}
