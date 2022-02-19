import java. util.Scanner;

public class TASK2 
{

	public static void main(String[] args) 
	{
		//Scanner  Class
				Scanner input = new Scanner(System.in);
				// getting user input
				System.out.print("Enter a Number you want: ");
				int number = input.nextInt();
				// taking another variable to check whether it is prime or not
				int count = 0;
				// taking a for loop for checking non prime Number
				for (int i = 2; i<number; i++)
				{
					if(number%i==0)
						count++;
					break;// conditions for counting the non prime number
				}
				if(count==0)// condition for prime number
				{
					// displaying output
					System.out.println(number+ " is a prime Number.");
				} else
				{
					// displaying output
					System.out.println(number+ " is not a prime Number.");
				}
				input.close();
	}

}
