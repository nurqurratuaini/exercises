package ArrayOneDimensional;
import java.util.Scanner;
public class Exercise3 {
	
	public static void main(String[] args) {
		
		//write a program that create an array of 10 element size. Your program should prompt the users to input numbers in array
		//display the sum of all array element
		
		int[] numbers = new int[10];
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter numbers: ");
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextInt();	
		}
	    for (int i = 0; i < numbers.length; i++) {
	    	System.out.println(numbers[i]);
	    }
	    int sum = 0;
	    for (int i = 0; i < numbers.length; i++) {
	    	sum = sum + numbers[i];
	    }
	    System.out.println("The sum equals to: " + sum);
	}
	

}
