
package testbreak;

import java.util.Scanner;


public class TestBreak {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        
        while(num<20){
            num++;
            sum += num;
            if(sum >= 100)
                break;
        }
        System.out.println("the number is"+num);
        System.out.println("the sum is"+sum);
    }
    
}
