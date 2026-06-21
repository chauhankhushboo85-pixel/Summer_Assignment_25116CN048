import java.util.Scanner;
public class Q83 {
     public static void main(String[] args){
          Scanner scanner= new Scanner(System.in);
          System.out.println("enter the string:");
          String n= scanner.nextLine();
          int vowel=0;
          int consonents=0;
          for(int i=0;i<n.length();i++){
              char ch= Character.toLowerCase(n.charAt(i));
              if(ch>='a'&& ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowel++;
                }
                else{
                    consonents++;
                }
              }
          }
          System.out.println("the value of vowels are:"+vowel);
          System.out.println("the value of consonents are:"+consonents);
     }
}
