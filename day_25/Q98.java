import java.util.Scanner;

public class Q98 {
    public static void main(String[]args){
     Scanner scanner= new Scanner(System.in);
          System.out.println("enter the string:");
        String n = scanner.nextLine();
        System.out.println("the common characters are:");
        for(int i=0;i<n.length();i++){
            char ch= n.charAt(i);
            char duplicate_char=0;
            for(int j=0;j<i;j++){
             if(n.charAt(j)==ch){
                duplicate_char=ch;
             }   
            }
             System.out.println(duplicate_char);
        }
        
           

        
}}
