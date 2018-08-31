
/**
 * Asks for name, year and phone and reads back
 *
 * Aidan Li
 * Version the best
 */
import java.util.Scanner;
public class Registry
{public static void main(String [] args){
    Scanner stringreader=new Scanner(System.in);
    Scanner intreader=new Scanner(System.in);
    System.out.println("Enter Last name");
    String name2=stringreader.nextLine();
    System.out.println("Enter First name");
    String name1=stringreader.nextLine();
    System.out.println("Enter class year(number)");
    int year=intreader.nextInt();
    System.out.println("Enter Campus Phone number");
    String phone=stringreader.nextLine();
    System.out.println(name2+","+name1);
    System.out.println("Year "+year);
    System.out.println("Phone: "+phone);
    
}}
