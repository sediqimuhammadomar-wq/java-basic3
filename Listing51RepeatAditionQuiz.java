
package listing.pkg5.pkg1.repeataditionquiz;

import java.util.Scanner;

public class Listing51RepeatAditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
  int number1= (int)(Math.random()*10);
    int number2= (int)(Math.random()*10);
        System.out.println("what is"+number1+"+"+number2+"?");
    int answer = input.nextInt();
    
    while(number1+number2!=answer){
            System.out.println("answer is worng Try agin. What is"+number1+"+"+number2+"?" );
     answer = input.nextInt();
    }
              System.out.println("you are answer is correct"); 
    }
    
}
