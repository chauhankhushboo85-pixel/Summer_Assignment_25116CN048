import java.util.Scanner;

public class Q95 {
     public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.println("enter the sentence:");
        String n= Scanner.nextLine();
        String[]word=n.split(" ");
        String longest=word[0];
        for(int i=0;i<word.length;i++){
           if(word[i].length()>longest.length()){
            longest=word[i];
           }
        }
        System.out.println("the longest word is:"+longest);
}}
