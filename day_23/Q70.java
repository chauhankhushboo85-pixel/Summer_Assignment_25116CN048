import java.util.Scanner;
public class Q70 {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.println("enter the string:");
        String n= Scanner.nextLine();
   char t=0; 
for(int i=0;i<n.length();i++){
  char ch=n.charAt(i);
  int count=0;
  for(int j=0;j<n.length();j++){
     if(ch==n.charAt(j)){
        count++;
     }
  }
  if(count>1){
    System.out.println("the first repeated character is:"+ch);
    return;
  }
}
System.out.println("no repeated character found");
}
}
