import java.util.Scanner;
import java.util.Random;
public class TASK8 {

	public static void main(String[] args) {
		// taking input
		Random random = new Random();
		Scanner input = new Scanner(System.in);
        System.out.print("How many random numbers: ");
        int num1 = input.nextInt();
        for (int i = 0; i < num1; i++) {
            int num2 = random.nextInt(num1)+5;// (upperbound - lowerbound)+lowerbound
            //(20-5)+5

            System.out.print( num2+ " ");// displaying output
	}
		 input.close();
	}
}
