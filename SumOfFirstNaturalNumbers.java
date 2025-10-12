k
package sum.of.first.natural.numbers;

import java.util.Scanner;

public class SumOfFirstNaturalNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      double n = input.nextDouble(); 
    double sum = (n*(n+1)) / 2 ;
        System.out.println("sum is ="+sum);
    }
    
}
