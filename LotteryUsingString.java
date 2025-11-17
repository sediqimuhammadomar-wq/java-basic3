
package lotteryusingstring;

import java.util.Scanner;

public class LotteryUsingString {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        
        String lottrey = ""+(int)(Math.random()*10)+(int)(Math.random());
        
        System.out.println("Enter your gusse two digit :");
        String gusse = input.nextLine();
        // D == digit
         char lottreyD1 = lottrey.charAt(0);
         char lottreyD2 = lottrey.charAt(1);
         
         char gusseD1 = gusse.charAt(0);
         char gusseD2 = gusse.charAt(1);
         
         System.out.println("the lottrey number is :"+lottrey);
         if(gusse.equals(lottrey)){
             System.out.println("Exact match : you win $100000");
             
         }
         else if(gusseD2 == lottreyD1 && gusseD1 == lottreyD2){
             System.out.println("Exact match :you win $3000 ");
         }
         else if(gusseD1 == lottreyD1 ||gusseD2 == lottreyD2 || gusseD1 == lottreyD2 || gusseD2 == lottreyD1 ) {
             System.out.println("Match one diggit :you win $1000 ");
             
         }   
         else
            System.out.println("Sorry no match ");
         
    }
    
}
