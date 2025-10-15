
package listing.pkg5.pkg3.gussnumber;

import java.util.Scanner;

public class Listing53GussNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         int number = (int)(Math.random()*101);
        System.out.println("Enter your guss beetwen 0 and 100.");
        int guss = input.nextInt();
   if(number==guss)
            System.out.println("yes the number is :"+number);
   else if(guss>number)
            System.out.println("your guss too high");
   else 
            System.out.println("your guss is too low");
    }
    
}
