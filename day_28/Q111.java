import java.util.Scanner;

public class Q111 {
    public static void main(String[]args){

     Scanner scanner= new Scanner(System.in);
      int[] reservationId=new int[100];
     String[] reservationName =new String[100];
     String[] arrival=new String[100];
     String[] destination=new String[100];
     int[]  date=new int[100];
     int choices;
     int count=0;
     do { 
         System.out.println("Ticket booking  SYSTEM");
         System.out.println("Please select from following options");
         System.out.println("1. reservation of your train");
         System.out.println("2. see booking details");
         System.out.println("5. exit");
         choices =scanner.nextInt();
         switch(choices){
            case 1:
                
              
              System.out.println("enter resirvation id:");
              reservationId[count]=scanner.nextInt();
              scanner.nextLine();
              System.out.println("Enter your name:");
              reservationName[count]=scanner.nextLine();
               System.out.println("enter the arrival place:");
               arrival[count]=scanner.nextLine();
               System.out.println("enter the destination place:");
               destination[count]=scanner.nextLine();
               System.out.println("enter the date of depature:");
               date[count]=scanner.nextInt();
               count++;
               System.out.println("BOOKING CONFIRMED!!!");
               
               break;
            case 2:
                System.out.println("Your booking details:");
                System.out.println("enter your registration id");
                int m=scanner.nextInt();
                for(int i=0;i<count;i++){
                    if(reservationId[i]==m){
                        System.out.println("reservation id="+reservationId[i]);
            
                     System.out.println("name="+reservationName[i]);
                      System.out.println("arrival ="+arrival[i]);
                      System.out.println("departure ="+destination[i]);
                      System.out.println("date ="+date[i]);

                      break;
                     }
                     else{
                      System.out.println("record not found");
                    break;
                    } 
                }
                
         
                }
     }while (choices!=3); 
     
}}
