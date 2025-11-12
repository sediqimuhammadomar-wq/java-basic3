
package computchange;

import java.util.Scanner;

public class ComputChange {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter amount");
        double amount = in.nextInt();
         double remainingAmount = (int)(amount * 100);
         
         double numberOfDolers = remainingAmount / 100 ;
         remainingAmount = remainingAmount % 100;
         
               double numberOfQuarter = remainingAmount / 25 ;
         remainingAmount = remainingAmount % 25; 
         
                  double numberOfDimes = remainingAmount / 10 ;
         remainingAmount = remainingAmount % 10;
         
                  double numberOfNickles = remainingAmount / 5 ;
         remainingAmount = remainingAmount % 5;
         
                  double numberOfPennies = remainingAmount  ;
        
                  
                System.out.println("your amount "+amount+"consists of :");
                System.out.println("dollers"+numberOfDolers);
                System.out.println("quarters"+numberOfQuarter);
                System.out.println("dimse"+numberOfDimes);
                System.out.println("nickles"+numberOfNickles );
                System.out.println("pennies"+numberOfPennies );
                
    }
    
}
