
/**
 * Calculates income tax
 *
 * Aidan Li
 * @version (a version number or a date)
 */
/*
 * Case study 3.1: income tax calculator
 * Compute a person's income tax
 * 1. Constants: tax rate, standard deduction, deduction per dependent
 * 2. Inputs: gross income, number of dependents
 * 3. Computations: net income=gross income-standard deductionn-deductions for dependents
 *      income tax=fixed percentage of net income
 * 4. Outputs: income tax
 */
import java.util.Scanner;
public class Taxcalculator
{
    public static void main(String [] args){
        //Constants
        final double tax_rate=0.2;
        final double standard_deduction=10000.0;
        final double dependent_deduction=2000.0;
        
        Scanner reader=new Scanner(System.in);
        
        double grossIncome;
        int numDependents;
        double taxableIncome;
        double incomeTax;
        
        //Request the inputs
        System.out.print("Enter the gross income: ");
        grossIncome=reader.nextDouble();
        System.out.print("Enter the number of dependents: ");
        numDependents=reader.nextInt();
        
        //Compute income tax
        taxableIncome=grossIncome-standard_deduction-dependent_deduction*numDependents;
        incomeTax=taxableIncome*tax_rate;
        
        //Display income tax
        System.out.println("The income tax is $"+incomeTax);
        System.out.println("Gross income: "+grossIncome);
        System.out.println("Number of dependents: "+numDependents);
        System.out.println("Taxable income: "+taxableIncome);
    }
}
