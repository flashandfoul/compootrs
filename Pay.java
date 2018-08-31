
/**
 * Calculates employee's total weekly pay
 *
 * Aidan Li
 * The only version you'll ever need
 */
import java.util.Scanner;
public class Pay
{public static void main(String [] args){
    Scanner reader=new Scanner(System.in);
    System.out.println("Input hourly wage");
    double wage=reader.nextDouble();
    System.out.println("Input regular hours worked");
    double reghours=reader.nextDouble();
    System.out.println("Input overtime hours worked");
    double exhours=reader.nextDouble();
    double total=wage*reghours+wage*1.5*exhours;
    System.out.println("Total pay is $"+total);
}
}
