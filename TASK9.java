import java.util.Scanner;

public class TASK9 {

    public static void main(String[] args) {
     // Taking input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);// represents a character at a specific position

        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) // condition for letter
        {

             System.out.println("It is a letter");

        } 
        else if(ch >= '0' && ch <= '9') // condition for digits
        {

             System.out.println("It is a digit");

        } 
        else // condition for symbols
        {

             System.out.println("It is a symbol");
        }
    input.close();
    }
}
