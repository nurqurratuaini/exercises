import java.util.Scanner;

public class Test1{


   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     
     int item, quantity1, quantity2, quantity3;
     double price1, price2, price3, totalprice, discount;
     
     System.out.println("Enter the number of items: ");
     item = in.nextInt();
     System.out.print("Enter price of first item:");
     price1 = in.nextDouble();
     System.out.print("Enter quantity of first item: ");
     quantity1 = in.nextInt();
     
     price1 = price1 * quantity1;
     
     System.out.print("Enter price of second item: ");
     price2 = in.nextDouble();
     System.out.print("Enter quantity of second item: ");
     quantity2 = in.nextInt();
     
     price2 = price2 * quantity2;
     
     System.out.print("Enter price of third item: ");
     price3 = in.nextDouble();
     System.out.println("Enter quantity of third item: ");
     quantity3 = in.nextInt();
     
     price3 = price3 * quantity3;
     
     totalprice= price1 + price2 + price3;
     System.out.println("Total price: " + totalprice);
     
     if (totalprice > 100) {
       discount =  totalprice* 0.2;
     
     } else 
         discount = totalprice * 0.1;
     double total = totalprice - discount ;
     System.out.println("Discount received: " + discount);
     System.out.println("Price to be paid : " + total);
     
     //Question2
     int hourworked;
     double sales, commission, dailywages;
     
     System.out.print("Enter sales: ");
     sales = in.nextDouble();
     System.out.print("Enter hours worked: ");
     hourworked = in.nextInt();
     
     if (sales >= 150 && sales <= 300) {
       commission = sales * 0.05;
       
     } else if (sales > 300 && sales <= 500) {
       commission = sales * 0.1;
     
     } else 
         commission = sales * 0.15;
     
     dailywages = (hourworked * 5) + commission;
     
     System.out.println("Commission: " + commission);
     System.out.println("Daily wages: " + dailywages);
     }
     
     
   
     

     
     
     
     
     
     
     
     
     
     

    

}
