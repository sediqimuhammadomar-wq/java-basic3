
package dec2hexa;

import java.util.Scanner;

public class Dec2Hexa {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the decemal number :");
        int dec = input.nextInt();
        
        String hex = "";
        while(dec != 0){
            int hexValue = dec % 16;
            char hexDigit = (0<=hexValue && hexValue<=9)?
                    (char)(hexValue +'0'): (char)(hexValue -10+'A');
            hex = hexDigit +hex;
            dec = dec / 16;
        }
        System.out.println("the hex number is"+hex);
    }
    
}
