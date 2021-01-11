import java.util.Scanner;
public class Assignment3 {
	
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
	    int quantity,price;
	    
	    printTitle();
	    printGender();
	    printMenu();
	}
	    
	    public static void printTitle() {
	    	Scanner in = new Scanner (System.in);
	    
	    String[] title = {"Mr","Mrs","Miss"};
	    System.out.println("Name: ");
	    String name = in.next();
	    System.out.println();
	    System.out.println("------------------");
	    System.out.println(title[0]);
	    System.out.println(title[1]);
	    System.out.println(title[2]);
	   }
	  
	    public static void printGender() {
	    	Scanner in = new Scanner (System.in);
	    
	    String[] gender = {"Male","Female"};
	    System.out.println();
	    System.out.println("-----------");
	    System.out.println(gender[0]);
	    System.out.println(gender[1]);
	        
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
	   }
	    
	    public static void printMenu() {
	    	Scanner in = new Scanner (System.in);
	    
	    System.out.println("Here is the list of menu of our desserts:");
	    String[] menu = {"Cookies","Cakes","Puddings","Pastries"};
	    System.out.println();
	    System.out.println("---------------");
	    System.out.println(menu[0]);
	    System.out.println(menu[1]);
	    System.out.println(menu[2]);
	    System.out.println(menu[3]);
	        
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
