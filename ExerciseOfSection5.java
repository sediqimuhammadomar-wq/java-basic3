
package exerciseofsection.pkg5;

import java.util.Scanner;

public class ExerciseOfSection5 {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        
        
        
    
//   (5 - 3)  Counversion from kg to puond  
    
  /*  for(int i = 1;i<200 ; i += 2){
        System.out.println(i+"\t"+i*2.2+"pound" );
        
    }*/
  
  //  (5,2) 
  
  /*  int count = 0;
int correct = 0;
long startTime  = 0;
    while(count<10){
           int number1 = 1+(int)(Math.random()*15);
  int number2 = 1+(int)(Math.random()*15);
        System.out.println("what is"+ number1+"+"+number2+"?");
      int answer = input.nextInt();
      if(answer == number1+number2)
          System.out.println("your answer is correct");
      
      else
          System.out.println("your answer is worng");  
      count++;
    }
long andTime = System.currentTimeMillis();
    long totalTime = (andTime-startTime) / 1000;
        System.out.println("you got "+correct+"answer");
        System.out.println("totalTime"+totalTime+"second");*/
    
   //  (5,4)   conversion from miles to km
    
         /*   System.out.println("Miles\t\tkilometers");
    for(int i = 1;i<=10;i++){

        System.out.println(i+"\t\t"+i*1.609);
    }*/
    
    //  Conversion from kg to pound and pound to kg :
  
     
    /* int i = 1;
     int j = 20;
        System.out.println("kg\t\tpound\t|\tpound\t\tkg");
     while(i<=199&&j<=515){
 
         System.out.println(i+"\t\t"+Math.round(i*2.2)+"\t|\t"+j+"\t\t"+j /2.2f);
                 i+= 2;
         j += 5;
     }*/
    
/* double tiuton = 10000;
    int year = 0;
    double pay = 0.05;
    while(year<=10){
        tiuton *= 0.05;
       year++;
    }
        System.out.printf("tiuton"+tiuton);
    double totalCost = 0;
    for(int i = 0;i<4;i++){
        tiuton += 0.05;
        totalCost += tiuton;   
    }
        System.out.printf(totalCost+"totalCost");*/
    
    
      /*  System.out.println("Enter the value of n");
        int n = input.nextInt();
    for(int i = 1;i <= n;i++){

        for(int space = i;space <i;space++){
            System.out.println("     ");
            
        } 
        int value = 1;
        for(int j = 1;j <= i;j++){
            System.out.printf("%4d",value);
            value *= 2;
            
        }
  
        System.out.println();
    }*/
    
      /*  System.out.println("Enter the number");
        int num = input.nextInt();
        for(int i = 1;i <=num ;i++){
       //     for(int j = 1;j<=i;j++){
          //      System.out.print(j+" ");
          //  }
            for(int k = num-i;k>0;k--){
                System.out.print(k+" ");
            }
            
            System.out.println();
            
        }*/
      
      // (5 - 10) 
      
    /*  int NUMBER_PER_LINE = 10;
     int count = 0;
     
    for( int i = 100; i<=1000;i++){
        if(i%6==0&&i%5==0){
  
            System.out.print(i+"\t");
               count++;
            if(count==NUMBER_PER_LINE){
                System.out.println();
                count = 0;   }
            }  
          }*/
    
    //  (5 - 11)
  /*  int NUMBER_PER_LINE = 10;
    int count = 0;
    
     
    for(int x = 100;x <=200;x++){
        if(x % 5 ==0 || x % 6 ==0){
            System.out.print(x+"\t");
            count++;

            if(count == NUMBER_PER_LINE){
                System.out.println();
                count = 0;
            
        }
    }}*/
  
  //  (5 - 16)
  
 /* for(int j =  1; j<= 120;j ++){
      System.out.print((char)j+"  ");
      if(j % 10 == 0){
          System.out.println();
      }
  }*/
 
 //  (5 -27)
 /*
int NUMBER_PER_LINE = 10;
int count = 0;
for(int i = 100;i<2101;i++){
   if(( i % 4==0 && i % 100 != 0)||( i % 400 == 0)){
        
    System.out.print("\t"+i);
      count++;
       if(count==NUMBER_PER_LINE){
           count = 0;
           System.out.println();
       }

  }
}*/
 
 // (5 - 48) 
/*
       System.out.println("Enter the string :");
        String s = input.nextLine();
        System.out.println("Character at odd position :");
        for(int i = 0; i<s.length();i++){
            if(i % 2 == 0){
                System.out.print(s.charAt(i));
            }
        }
 */
//  (5-43)
/*
int count = 0;
for(int i = 1 ; i <= 7 ; i++){
    for(int j = i + 1; j <= 7;j++){
        System.out.println(i +"  "+ j);
        count++;
        }
}
        System.out.println("the total number fo all combniation is"+count);
*/




//  (5 - 44)

/*
        System.out.println("Enter an intiger :");
        short num = input.nextShort();
        System.out.println("the bits are ");
       for(int i = 15 ; i>= 0;i--){
            int bit =(num >> i)&1;
            System.out.print(bit);
        }
*/

// (5 - 45)

/*
double[] number = new double[10];
double sum = 0;
        System.out.println("Enter 10 numbers :");
        for(int i = 0 ; i< 10 ;i++){
            number[i] = input.nextDouble();
            sum += number[i];
            
        }
double mean = sum / 10;
double sumDeviation = 0;
for(int i = 0 ; i < 10; i++){
    sumDeviation += Math.pow(number[i] - mean,2);
    
}
double deviation = Math.sqrt(sumDeviation / 9);
        System.out.println("the mean is"+mean);
        System.out.println("the devitation is"+deviation);
*/



//  (5 - 46)
/*
        System.out.println("Enter a string :");
        String s = input.nextLine();
        for(int i = s.length()-1;i >= 0;i--){
            System.out.print(s.charAt(i));
        }
*/
 

 // (5 - 49) سوال
 /*
        System.out.println("Enter the string :");
        String s = input.nextLine();
       int countVawel = 0;
       int countConstant = 0;
 for(int i = 0; i<s.length();i++){
     char ch = s.charAt(i);
     if(ch == 'a'|| ch == 'e' || ch == 'i'||ch == 'o' ||ch == 'u' ){
 countVawel++;}
     else
         countConstant++;
 }
        System.out.println("The number of vawel is"+countVawel);
        System.out.println("The number of counstant is"+countConstant);*/
 
 
 
 // ( 5 - 50) سوال
 /*
        System.out.println("Enter the of string :");
        String s = input.nextLine();
        int count = 0;
       
        for(int i = 0 ; i< s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
                count++;
        }
        System.out.println("The number of uppercase letter is"+count);
 */
 
 
 //   ( 5 - 51 ) سوال
  /*
        System.out.println("Enter the first string");
        String s1 = input.nextLine();
        System.out.println("Enter the second stering");
        String s2 = input.nextLine();
        String prefix = longestCommonPerfix(s1, s2);
        if(prefix.length() == 0){
            System.out.println(s1+"and"+s2+"No has common prefix");
            
        }
        else{
            System.out.println("the common prefix is\""+prefix+"\"");
        }
        input.close();
}
public static String longestCommonPerfix(String s1, String s2){
    int minLen = Math.min(s1.length(),s2.length());
    int i = 0;
    while(i<minLen && s1.charAt(i) == s2.charAt(i)){
    i++;
}

       return s1.substring(0 , i);*/
}
 } 

  
    

