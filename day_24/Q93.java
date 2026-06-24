import java.util.Scanner;
 public class Q93{
     public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.println("enter the first string:");
        String n= Scanner.nextLine();
        char[]arr =n.toCharArray();
        System.out.println("enter the second string:");
        String n1= Scanner.nextLine();
        char[]arr1 =n.toCharArray();
        if(n.length()==n1.length()){
            String temp=n+n1;
        
        if(temp.contains(n1)){
           System.out.println("it contains rotation");
        }
        else{
            System.out.println("it does not contain rotation");
        }
    }
    else{
        System.out.println("it does not contain rotation");
    }
 }}