import java.util.Scanner;


public class TASK1 {

	public static void main(String[] args) {
	//Scanner  Class
		Scanner input = new Scanner(System.in);
		// getting user input
		System.out.print("Enter a Number you want: ");
		int number = input.nextInt();
		// Using Switch Case for this problem
		switch(number%2)
		{
		case 0:// if number%2 == 0 then it's an Even Number
			// displaying output
			System.out.println(number+ " is an Even Number.");
			break;
		case 1:// if number%2!=0 then it's an Odd Number
			// displaying output
			System.out.println(number+ " is an Odd Number.");
			break;
			default:
				System.out.println("Wrong Input!!!");
				
					}
		
		input.close();
		

	}

}
