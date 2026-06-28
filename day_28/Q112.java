import java.util.Scanner;

public class Q112 {
    public static void main(String[]args){

     Scanner scanner= new Scanner(System.in);
     
     String[] contactName=new String[100];
     int[] contactNo=new int[100];
     int choices;
     int count=0;
     do { 
         System.out.println("CONTACT MANAGMENT SYSTEM");
         System.out.println("Please select from following options");
         System.out.println("1. Add a contact");
         System.out.println("2. see contact details");
         System.out.println("3. Call aperson");
         System.out.println("4. exit");
         choices =scanner.nextInt();
         switch(choices){
              case 1:
                
              scanner.nextLine();
              System.out.println("enter contact name:");
              contactName[count]=scanner.nextLine();
              
              System.out.println("Enter contact no:");
              contactNo[count]=scanner.nextInt();
               
               count++;
               System.out.println("CONTACT SAVED!!!");
               break;
             case 2:
                
                System.out.println("enter your contact name");
                scanner.nextLine();
                String m=scanner.nextLine();
                 boolean found=false;
                System.out.println("Contact details:");
                for(int i=0;i<count;i++){
                    if(contactName[i].equalsIgnoreCase(m)){
                        System.out.println("contact name="+contactName[i]);
            
                     System.out.println("contact no="+contactNo[i]);
                    }
                     found=true;
                     break;
                        }
                        if(!found){
                            System.out.println("not found");
                         }
                        break;
                        

                    case 3:
                        System.out.println("enter the contact name to be called");
                      scanner.nextLine();
                      String o=scanner.nextLine();
                       for(int i=0;i<count;i++){
                      if(contactName[i].equalsIgnoreCase(o)){
                        System.out.println("Calling.....");
                        break;
                     }
                     else{
                        System.out.println("Number not found");
                        break;
                     }
                    }
            }
        }while (choices!=4); 

    }
}
                

                
            
        
        
    


