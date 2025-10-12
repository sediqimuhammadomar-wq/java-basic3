
package computechange;

import java.util.Scanner;

public class ComputeChange {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount in double type for example : 11.5:");
double amount = input.nextDouble();
    int remainingAmount = (int)(amount*100);
    int numberOfDollars = remainingAmount / 100;
    remainingAmount = remainingAmount % 100;
    
    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;
    
    int numberOfDimes = remainingAmount / 10 ;
    remainingAmount = remainingAmount % 10;
    
    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;
    
    int numnberOfPennies = remainingAmount;
        System.out.println(numberOfDollars+"Dollars");
        System.out.println(numberOfQuarters+"Quarters");
        System.out.println(numberOfDimes+"Dimes");
        System.out.println(numberOfNickels+"Nickels");
        System.out.println(remainingAmount+"Pennies");}
    
}
