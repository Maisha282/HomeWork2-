import java.util.Scanner;


public class TASK6 {

	public static void main(String[] args) {
		// getting user inputs
	Scanner input = new Scanner(System.in);
	System.out.print("Enter First Input: ");
	int first = input.nextInt();// for first input
	System.out.print("Enter Second Input: ");
	int second = input.nextInt();//for second input
	System.out.print("Choose the Operators: '+','-','/'or'*': ");
	String opr = input.next();
	int answer;
	// Using Switch Case
	switch(opr)
	{
	case "+" : 
		      answer= first + second;// Addition
		      System.out.print("Addition is: "+answer);
		      break;
	case "-" :	
		      answer=first - second;// Subtraction
		      System.out.print("Subtraction is: "+answer);
		      break;
	case "/" :	
		      answer= first / second; // Division
		      System.out.print("Division is: "+answer);
		      break;
	case "*" :	
		      answer= first * second;// Multiplication
		      System.out.print("Multiplication is: "+answer);
		      break;
	default:
		      System.out.print("Wrong Operators!!!!");
		      break;
		
	}
	input.close();
	}

}
