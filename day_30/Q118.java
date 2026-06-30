import java.util.Scanner;

public class Q118 {
    public static void main(String[]args){

     Scanner scanner= new Scanner(System.in);
     
     String[] available_books=new String[100];
     String[] issued_books=new String[100];
     int choices;
     int availableCount=0;
     int issuedCount =0;
     do { 
         System.out.println("LIBRARY MANAGMENT SYSTEM");
         System.out.println("Please select from following options");
         System.out.println("1. Add a book");
         System.out.println("2. Issue a book");
         System.out.println("3. Show available book");
         System.out.println("4. Show issued books");
         System.out.println("5. exit");
         choices =scanner.nextInt();
         switch(choices){
            case 1:
              System.out.println("Add the name of the book");
              scanner.nextLine();
              available_books[availableCount++]=scanner.nextLine();
              break;
            case 2:
              System.out.println("enter the book to issue");
              scanner.nextLine();
              String n=scanner.nextLine();
              boolean found=false;
              for(int i=0;i<availableCount;i++){
                if(available_books[i].equalsIgnoreCase(n)){
                  issued_books[issuedCount++]=available_books[i];
                  for(int j=0;j<availableCount-1;j++){
                    available_books[j]=available_books[j+1];
                  }
                  available_books[availableCount-1]=null;
                  System.out.println("issued sucessfully");
                   found=true;
                  break;
                }}
                if(!found){
                  System.out.println("not found");
                }
                break;
              
              case 3:
                System.out.println("available books are:");
                if(availableCount==0){
                  System.out.println("not available");
                }
                else{
                for (int i=0;i<availableCount;i++){
                  System.out.println(available_books[i]);
                }
                
              }
              break;
              case 4:
                System.out.println("issued book are:");
                if(issuedCount==0){
                  System.out.println("not available");
                }
                else{
                for (int i=0;i<issuedCount;i++){
                  System.out.println(issued_books[i]);
                }
              }
                break;
         }
     } while (choices!=5);
   }
}
