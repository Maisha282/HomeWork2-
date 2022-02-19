import java.util.Scanner;
public class TASK7 {

	public static void main(String[] args) {
		//Scanner  Class
				Scanner input = new Scanner(System.in);
				// getting user input
				System.out.print("Enter a Number you want: ");
				int n = input.nextInt();
				// checking prime numbers
				if(isPrime(n))
				{
					System.out.print(n+ " is a Prime Number.");				
				}
				else
				{
					System.out.print(n+ " is not a Prime Number.");
				}
				System.out.printf("\n");
				int start=300, end=500;
				while(start<end)// conditions for showing prime numbers between 300 to 500 
				{
					if(isPrime(start))
					{
						System.out.printf("\n%d\n",start);
					}			
						start++;
					
				}
				input.close();
	}
	public static boolean isPrime(int n)// using isPrime(int n) function for checking prime number 	
	{
		boolean status = true;
		int i;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0) {
			status= false;	
			break;
			}	
			
		}
		return status;
	}
	
	}


