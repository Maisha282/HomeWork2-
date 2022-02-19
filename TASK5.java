import java.util.Scanner;
public class TASK5 {

	public static void main(String[] args) {
		//Scanner Class
		Scanner input = new Scanner(System.in);
		//getting user input
		System.out.print("Enter an integer you want: ");
		int number = input.nextInt();
		int Fact =1;
		// Using for loop
		for(int i=1; i<=number; i++)
		{
			Fact=Fact*i;
		}
		System.out.printf("Factorial of %d is: %d.",number,Fact);
		input.close();

	}

}
