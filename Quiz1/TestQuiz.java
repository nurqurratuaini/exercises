import java.util.*;
public class TestQuiz {
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your feet: ");
		int feet = in.nextInt();
		int inches = feet*12;
		System.out.print("Enter your inches: ");
		int inch = in.nextInt();
		
		System.out.println("Female weight is: "+(40+(5*feet))+"kg");
		System.out.println("Male weight is: "+(50+(6*feet))+"kg");
		       
		
		

		
	}

}
