
package lottery;

import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
int lottery = (int)(Math.random() * 100);
        System.out.println("Enter yout lottery pick (two digits)");
        
        int guess = input.nextInt();
        
        int l1 = lottery / 10;
            int l2 = lottery % 10;
            
        int g1 = guess / 10 ;
        int g2 = guess % 10;
        System.out.println("the lottery number is "+ lottery);
        if(guess==lottery)
            System.out.println("Exact match: you win $10.000");
        else if(g2 == l1 && g1 == l2)
            System.out.println("Match all digits! you win3,000"); 
        else if(g1 == l1 || g1 == l2 || g2 == l1 || g2 == l2)
            System.out.println("Match one digit! you win1,000");
        else 
            System.out.println("No match . Try again!");
        System.out.println("Lottery number was : "+lottery);}
    
}
