
package multiplicationtable;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        
        System.out.print("   ");
        for(int j = 1;j<=10;j++)
            System.out.print(j+"\t");
        System.out.println("\n_  _ _ _ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
 
        
for(int i = 1 ; i<=10;i++){
    System.out.print("\n"+i +" |");
    
            for(int j = 1 ; j<=10;j++){
            
    System.out.print( i*j+"\t");
}
            System.out.println();
}

    }
    
}
