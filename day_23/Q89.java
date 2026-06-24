import java.util.Scanner;
public class Q69 {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.println("enter the string:");
        String n= Scanner.nextLine();
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            int count=0;
            for(int j=0;j<n.length();j++){
                if(n.charAt(j)==ch){
                    count++;
                }
            }
            if(count==1){
                System.out.println("the first non repeating character is:"+ch);
                return;
            } 
        }
        System.out.println("no non repeating character found");
    }
}
