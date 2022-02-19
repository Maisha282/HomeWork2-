import java.util.Scanner;


public class TASK4 {

	public static void main(String[] args) {
		//Scanner class
		Scanner input = new Scanner(System.in);
		//getting user input
		System.out.print("Enter an integer you want: ");
		int number = input.nextInt();
		int status=1;
		 // Using for loop 
		for(int i=1; i<=number; i++)
		{
			if(number%i==0)// conditions for printing the divisors
			{
				if(status==1) //  conditions for printing the coma
				{
					System.out.printf("Divisors of %d are: %d",number,i);
					status=0;
				}else {
					{
						System.out.printf(",%d",i);
					}
				}
			}
		}
		input.close();

	}

}
