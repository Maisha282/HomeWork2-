
public class TASK3 {

	public static void main(String[] args) {
		// printing Multiplication Table for 1 to 5 using nested for loops
		
		int i,j;
		
		for( i=1; i<=5;i++)// This loop is for counting the multiplication till i want to print
		{
			for(j=1; j<=10; j++)// This loop is for counting the inner values that i want to multiply
			{
				System.out.println( i+ "X" +j+ "=" +(i*j));
			}
			System.out.println("..........");// for printing the exact output
		}
			

	}

}
