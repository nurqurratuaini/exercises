import java.util.Scanner;
public class Assignment2 {
  
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    int quantity,price;
    
      System.out.println("Name: ");
      String name = in.next();
        
      System.out.println("Gender: ");
      String gender = in.next();
          
      System.out.println("Age: ");
      String age = in.next();
          
      System.out.println("HP: ");
      String hp = in.next();
          
      System.out.println("Home address: ");
      String homeaddress = in.next();
      
      System.out.println();
     
          
      for(int f=1; f <50; f++) {
          System.out.print("_");}
        System.out.println();
        System.out.println("Cookies: RM5.00 per box");
        System.out.println("Cakes : RM3.00 per slice");
        System.out.println("Puddings : RM10.00 per box ");
        System.out.println("Pastries : RM8.00 per set");
        
        for(int f=1; f <50; f++) {
        	System.out.print("_");}
            
        System.out.println();
        System.out.println();
        System.out.println("Which desserts that you want?");
        in.next();
        
        System.out.print("Enter the quantity of desserts: ");
        int quantity1 = in.nextInt();
       
        System.out.print("Enter the price of the desserts: RM");
        int price1 = in.nextInt();
     
        price1 = price1 * quantity1;
        System.out.println();
        
       
        System.out.println("Which desserts that you want?");
        in.next();
        
        
        System.out.print("Enter the quantity of desserts: ");
        int quantity2 = in.nextInt();
      

        System.out.print("Enter the price of the desserts: RM");
        int price2 = in.nextInt();
      
        price2 = price2 * quantity2;
        System.out.println();
        
        System.out.println();
        int total = (price1 + price2);
        
        
        int i=1, line4=0;
        while (i <50) {
        	i = line4++;
            System.out.print("*");}
        System.out.println();
        System.out.println("Total price: RM" + total);
        
       
          
        
        
        
          
        
  }
}