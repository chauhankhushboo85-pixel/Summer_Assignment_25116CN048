import java.util.Scanner;

public class Q116 {
     public static void main(String[]args){
Scanner scanner= new Scanner(System.in);
int[] product_id=new int[100];
     String[] product_name =new String[100];
     int[] price =new int[100];
     int[] quantity =new int[100];
     System.out.println("Inventory managment system");
     int choices;
     int count=0;
      do{
        System.out.println("enter your choice:");
        System.out.println("1.Add a product");
        System.out.println("2.Display all the product");
        System.out.println("3. Search a product");
        System.out.println("4. Update a product");
        System.out.println("5. exit");
          choices= scanner.nextInt(); 
          switch(choices){
       case 1:
         System.out.println("Enter  product id:");
         product_id[count]=scanner.nextInt();
         scanner.nextLine();
         System.out.println("Enter product name:");
         product_name[count]=scanner.nextLine();
         System.out.println("Enter  price of product:");
         price[count]=scanner.nextInt();
         System.out.println("Enter  quantity of product:");
         quantity[count]=scanner.nextInt();
         count++;
         System.out.println("Added sucessfully!");
       
       break;
       case 2:
            System.out.println("\nProduct id\tProduct Name\tprice\tQuantity");
          for(int i=0;i<count;i++){
           System.out.println(product_id[i]+"\t"+product_name[i]+"\t"+price[i]+"\t"+quantity[i]);
          }
          break;
       case 3:
          System.out.println("Enter  product id of the product to be searched:");
          int u=scanner.nextInt();
          for(int i=0;i<count;i++){
          if(product_id[i]==u){
            System.out.println("product_id="+product_id[i]);
            
            System.out.println("name="+product_name[i]);
            System.out.println("salary="+price[i]);
            System.out.println("Quantity="+quantity[i]);
            break;
          }
          else{
            System.out.println("record not found");
            break;
          }
         }
         break;
       case 4:
          System.out.println("Enter  product id to update:");
          int t=scanner.nextInt();
          for(int i=0;i<count;i++){
            if(product_id[i]==t){
              
          System.out.println("Enter new product name:");
             scanner.nextLine();
          product_name[i]=scanner.nextLine();
          System.out.println("Enter new price:");
          price[i]=scanner.nextInt();
          System.out.println("Enter new quantity:");
          quantity[i]=scanner.nextInt();
          System.out.println("record updated sucessfully");
          break;
            }
          }
         
         }

      }while(choices!=5);

}}

