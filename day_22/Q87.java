import java.util.*;
public class Q87 {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.println("enter the string:");
        String n= Scanner.nextLine();
        
        for(int i=0;i<n.length();i++){
            char ch= n.charAt(i);
            int counted=0;
            int count=0;
            for(int k=0;k<i;k++){
             if(n.charAt(k)==ch){
                counted=1;
                break;
             }
            }
            if(counted==1){
                continue;
            }
            for(int j=0;j<n.length();j++){
                if(n.charAt(j)==ch){
                    count++;
                }
            }
            System.out.println(ch+"="+count);
        }
        
    }
    
}
