
package primenumber;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
  
        Scanner myscanner = new Scanner(System.in);
        
         int numberOfPrimes = 50;
   int numberOfPrimesPerLine = 10;
   int count =0;
   int number = 2;
        System.out.println("the first primenumber are \n");
    while(count<numberOfPrimes){
   boolean isPrems = true;
    for(int divisor = 2; divisor<number / 2;divisor++){
        if(number % divisor ==0){
           isPrems  = false;
            break;
            
        }
    }
    if(isPrems){
        count++;
        
        if(count % numberOfPrimesPerLine == 0){
            System.out.println(number);
            
        }
        else
            System.out.print(number+"  ");
    }
    number++;}
    }
    
}
