import java.util.Arrays;
import java.util.Scanner;
public class Q71 {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.println("enter first string:");
        String n1= Scanner.nextLine();
        System.out.println("enter second string:");
        String n2= Scanner.nextLine();
        char[]arr1=n1.toCharArray();
        char[]arr2=n2.toCharArray();
        Arrays.sort(arr1);
         Arrays.sort(arr2);
        boolean equal=false;
        if(Arrays.equals(arr1,arr2)){
            equal=true;
        }
        if (equal){
            System.out.println("the strings are anagram");
        }
        else{
            System.err.println("they are not anagram");
        }
    }
}
