import java.util.Scanner;
public class Exercises {
	
	public static void main (String[] args) { 
		Scanner in = new Scanner(System.in);
		
		changeF4C();
		changeF6C();
		changeF7C();
		changeF10C();
		changeF12C();
		changeF13C();
		changeF31C();
		changeF33C();
		changeF44C();
		changeF49C();
	}
	
	static void changeF4C() {
		Scanner in = new Scanner(System.in);
		
		int w = -5 + 8 * 6;
		int x = (55 + 9) % 9;
		int y = 20 + (-3 * 5 / 8);
		int z = 5 + 15 / 3 * 2 - 8 % 3;
		System.out.print(w + "\n" + x + "\n" + y + "\n" + z);
	}
	
	static void changeF6C() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		int num1 = in.nextInt();
		System.out.print("Input second number: ");
		int num2 = in.nextInt();
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		System.out.println(num1 + "x" + num2 + "=" + (num1 * num2));
		System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
		System.out.println(num1 + "mod" + num2 + "=" +  (num1 % num2));
	}
	
	static void changeF7C() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		int num1 = in.nextInt();
		for (int i=0; i<10; i++) {
			System.out.println(num1 + "x" + (i+1) + "=" + (num1 * (i+1)));
		}
	}
	
	static void changeF10C() {
		Scanner in = new Scanner(System.in); 
			double pi = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
			System.out.println(pi); //
	}
	
	static void changeF12C() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		int num1 = in.nextInt();
		System.out.print("Input second number: ");
		int num2 = in.nextInt();
		System.out.print("Input third number: ");
		int num3 = in.nextInt();
		System.out.print("Input fourth number: ");
		int num4 = in.nextInt();
		System.out.print("Input fifth number: ");
		int num5 = in.nextInt();
		System.out.println("Average for five number is: " + (num1 + num2 + num3 + num4 + num5) / 5);
	}
	
	static void changeF13C() {
		Scanner in = new Scanner(System.in);
		
		final double width = 5.6;
		final double height = 8.5;
		
		double perimeter = 2*(height + width);
		double area = width * height;
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f\n", height,width,perimeter);
		System.out.printf("Area is %.1f * %.1f = %.2f\n", width,height,perimeter);
	}
	
	static void changeF31C() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("\nJava Version: "+System.getProperty("java.version"));
		System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
		System.out.println("Java Home: "+System.getProperty("java.home"));
		System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
		System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
		System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
	}
	
	static void changeF33C() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input an integer: ");
		long n = in.nextLong();
		System.out.println("The sum of the digits is: " + sumDigits(n));
	}
	
	static long sumDigits (long n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum ;
    }

	static void changeF44C() {
		Scanner in = new Scanner(System.in);
		
		int n;
		System.out.print("Input number: ");
		n = in.nextInt();
		System.out.printf("%d + %d%d + %d%d%d\n" , n, n, n, n, n, n);
	}
	
	static void changeF49C() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		int n = in.nextInt();
		       if (n % 2 == 0) {
		    	   System.out.println(1);
		    	   System.out.println(0);
		 }
    
    
	
}
}

public class Exercises {

}
