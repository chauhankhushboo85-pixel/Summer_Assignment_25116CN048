import java.util.Scanner;
public class Q92 {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.println("enter the string:");
        String n= Scanner.nextLine();
        int maxCount=0;
        char maxChar=' ';
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            int count=0;
            for(int j=0;j<n.length();j++){
               if(n.charAt(j)==ch){
                count++;
               }
            }
            if(maxCount<count){
                 maxCount=count;
                 maxChar=ch;
            }
        }
        System.out.println("the maximum occuring character is:"+maxChar); 
    }
}
