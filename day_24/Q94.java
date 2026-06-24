import java.util.Scanner;

public class Q94 {
     public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.println("enter the string:");
        String n= Scanner.nextLine();
        String compressed="";
        int count=1;
        for(int i=0;i<n.length()-1;i++){
          if(n.charAt(i)==n.charAt(i+1)){
          count++;
          }
        else{
                compressed=compressed+n.charAt(i)+count;
                count=1;
        }
        }
        compressed=compressed+n.charAt(n.length() - 1) + count;
        System.out.println("the compressed string is:"+compressed);

}}
