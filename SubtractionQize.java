
package subtractionqize;

import java.util.Scanner;

public class SubtractionQize {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = (int)(Math.random()*10);
         int num2 = (int)(Math.random()*10);
   if(num1>num2)
            System.out.println("What is"+num1+"-"+num2+"?");
   int answer = input.nextInt();
    if(num1-num2 == answer)
            System.out.println("You are correct");
    else{
        System.out.println("Your answer is worng.");
        System.out.println(num1+"-"+num2+"is"+(num1-num2));
    }}
    
}
