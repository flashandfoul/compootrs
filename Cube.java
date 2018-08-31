
/**
 * finds surface area of a cube based on side length
 * AIdan Li
 * Version 0
 */
import java.util.Scanner;
public class Cube{
    public static void main(String [] args){
        
        Scanner reader=new Scanner(System.in);
        System.out.println("Input length of side of cube");
        int length=reader.nextInt();
        int area=(length*length)*6;
        System.out.println("The surface area is "+area);
        
    
    }
}
