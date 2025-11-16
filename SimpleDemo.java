/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledemo;

import java.util.Scanner;

/**
 *
 * @author Mustafa
 */
public class SimpleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner i = new Scanner(System.in);
        
        int num = i.nextInt();
        if(num % 2 == 0)
            System.out.println("hi even");
        if(num % 5 == 0)
            System.out.println("hi five");
    }
    
}
