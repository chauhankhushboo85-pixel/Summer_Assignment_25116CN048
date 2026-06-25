import java.util.*;

public class Q99 {
    public static void main(String[]args){

     Scanner scanner= new Scanner(System.in);
     System.out.println("enter how many names:");
     int number=scanner.nextInt();
     scanner.nextLine();
          System.out.println("enter the names:");
          String []n= new String[number]; 
         for(int i=0;i<number;i++){
         n[i]=scanner.nextLine();
        }
        Arrays.sort(n);
        System.out.println("the sorted names are:");
        for (int i = 0; i < number; i++) {
         System.out.println(n[i]);
            
        }


}}
