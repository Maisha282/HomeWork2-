import java.util.Scanner;


public class TASK10 {

    
  public static void main(String[] Strings) {
        // taking inputs
        Scanner input = new Scanner(System.in);// Scanner class
        System.out.println("Enter the coefficients:");
            System.out.print("a: ");
            double a = input.nextDouble();
            System.out.print("b: ");
            double b = input.nextDouble();
            System.out.print("c: ");
            double c = input.nextDouble();

            double dis = b * b - 4.0 * a * c;// checking the discriminant

            if (dis > 0.0) 
            {
                double r1 = (-b + Math.pow(dis, 0.5))/(2.0 * a);// formula for positive sign
                double r2 = (-b - Math.pow(dis, 0.5))/(2.0 * a);// formula for negative sign
                System.out.printf("Root 1:%.2f\n",r1);// when discriminant is greater than 0
                System.out.printf("Root 2:%.2f",r2);//when discriminant is greater than 0
                }  
            else if (dis == 0.0)  
            {
                double r1 = -b / (2.0 * a);//when discriminant is equal to 0
                System.out.printf("Root 1:%.2f",r1);
            } 
            else 
            {
                System.out.println("The Quadratic equation has imaginary roots.");// when discriminant is less than 1
            }
        input.close();
    }
}