
public class Exercise3 {
	
	public static void main(String[] args) {
		
		//For Loop
		System.out.println("\nFor: ");
		int sum = 0;
		double average;
		int lowerbound = 1;
		int upperbound = 100;
		
		for(int number = lowerbound; number <= upperbound; ++ number) {
		sum = sum + number;
		
		}
		average = sum/100;
		
		System.out.println("The sum of 1 to 100 is: " + sum);
		System.out.println("The average is: " + average);
		System.out.println();
		
		
		//While Do Loop
		System.out.println("\nWhile Do: ");
		int sumA = 0; 
		double averageA;
		int lowerboundA = 1;
		int upperboundA = 100;
		while(lowerboundA <= upperboundA) {
			sumA = lowerboundA +sumA;
			lowerboundA = lowerboundA + 1;
		}
		
		averageA = sumA/100;
		
		System.out.println("The sum of 1 to 100 is: " + sumA);
		System.out.println("The average is: " + averageA);
		System.out.println();
		
		
		//Do While Loop
		System.out.println("\nDo While: ");
		int sumB = 0;
		double averageB;
		int lowerboundB = 1;
		int upperboundB = 100;
		
		do {
			sumB = lowerboundB + sumB;
			lowerboundB = lowerboundB + 1;
				
		}
		while (lowerboundB <= upperboundB);
		
		averageB = sumB/100;
		
		System.out.println("The sum of 1 to 100 is: " + sumB);
		System.out.println("The average is: " + averageB);
		System.out.println();
		
		
		
		
		
		
	}

}
