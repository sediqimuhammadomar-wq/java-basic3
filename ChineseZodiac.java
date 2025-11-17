
package chinese.zodiac;

import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args) {
     
    Scanner input = new Scanner(System.in);
    
    int year = input.nextInt();
    
    switch(year % 12){
     case 0 : System.out.println("M");  break ;
     case 1 : System.out.println("r");  break ;
     case 2 : System.out.println("d");  break ;
     case 3 : System.out.println("p");  break ;
     case 4 : System.out.println("rat");  break ;
     case 5 : System.out.println("ox");  break ;
     case 6 : System.out.println("t");  break ;
     case 7 : System.out.println("rabit");  break ;
     case 8 : System.out.println("dragon");  break ;
     case 9 : System.out.println("snak");  break ;
     case 10 : System.out.println("horse");  break ;
     case 11 : System.out.println("sheep");  break ;}
    
}
    
}
