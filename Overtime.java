
/**
 *Same as the weekly pay program, but asks for each day
 *
 * Aidan Li
 * The real version
 */
    import java.util.Scanner;
public class Overtime{
public static void main(String [] args){
    Scanner reader=new Scanner(System.in);
    System.out.println("Input hourly wage");
    double wage=reader.nextDouble();
    System.out.println("Input regular hours worked on Monday");
    double reghours1=reader.nextDouble();
    System.out.println("Input overtime hours worked on Monday");
    double exhours1=reader.nextDouble();
    System.out.println("Input regular hours worked on Tuesday");
    double reghours2=reader.nextDouble();
    System.out.println("Input overtime hours worked on Tuesday");
    double exhours2=reader.nextDouble();
    System.out.println("Input regular hours worked on Wednesday");
    double reghours3=reader.nextDouble();
    System.out.println("Input overtime hours worked on Wednesday");
    double exhours3=reader.nextDouble();
    System.out.println("Input regular hours worked on Thursday");
    double reghours4=reader.nextDouble();
    System.out.println("Input overtime hours worked on Thursday");
    double exhours4=reader.nextDouble();
    System.out.println("Input regular hours worked on Friday");
    double reghours5=reader.nextDouble();
    System.out.println("Input overtime hours worked on Friday");
    double exhours5=reader.nextDouble();
    double total=wage*reghours1+wage*1.5*exhours1+
    wage*reghours2+wage*1.5*exhours2+
    wage*reghours3+wage*1.5*exhours3+
    wage*reghours4+wage*1.5*exhours4+
    wage*reghours5+wage*1.5*exhours5;
    System.out.println("Total pay is $"+total);
}}
