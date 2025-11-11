
package dec2hex;

import java.util.Scanner;

public class Dec2Hex {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        
        System.out.println("Enter decimal number");
        int dec = myscanner.nextInt();
        
        String hex = "";
        
        while(dec != 0){
            int hexValue = dec % 16 ;
            
            char hexDigit = (0 <= hexValue && hexValue <= 9)?
              (char)(hexValue + '0'):(char)(hexValue - 10 +'A');
            
         hex =  hexDigit + hex ;
         dec /= 16;
                    
        }
        System.out.println("the hex number is"+hex);
    }
    
}
