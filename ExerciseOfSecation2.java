
package exerciseofsecation.pkg2;

import java.util.Scanner;

public class ExerciseOfSecation2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //  (2:1)   Convert Celsius to Fahrenheit
        
    /*  System.out.println("Eter digree of F");
        int f = input.nextInt();
        double celsius = 5.0 / 9 *( f - 32);
        System.out.println("celsius is = "+ celsius);*/
    
    
        //  (2:2}  Comput the valume of cylinder .
    
    /*  System.out.println("Enter vaou of radius");
        int radius = input.nextInt();
        double PI = 3.14;
        double area = radius * radius * PI;
        int lenght = input.nextInt();
        double volum = area * lenght;
        System.out.println("Area =" +area);
        System.out.println("volum =" + volum);*/
    
        //  (2:3)  Convert feet in to meter:
    /*  System.out.println("Enter value of feet");
        double foot = input.nextDouble();
        //  one foot = 0.305 meter
        double meters = foot * 0.305;
        System.out.println(foot+"foot is"+meters+"meters");*/
    
    
        //  (2:4)  convert pound into kilograms.
    
    /*    System.out.println("Enter value of pound :");
        double pound = input.nextDouble();
        // one pound is = 0.454 kilograms.
        double kilograms = pound * 0.454;
        System.out.println(pound+"pound is"+kilograms+"kilograms");*/
   
    
        //  (2:5) Financial applacation : calcute tips
    /*  System.out.println("Enter the subtotal");
        int subtotal = input.nextInt();
        System.out.println("Enter the the gratuity :");
        int gratuity = input.nextInt();
        double gratuityRate = gratuity / 10.0;
        double total = subtotal + gratuityRate;
        System.out.println("the gratuityRate is "+gratuityRate+"and total is"+total);*/
    
    
        //  (2:6)  sum the digits in an integer.
    /*  System.out.println("Enter an integer between 0 and 1000 .");
        int integer = input.nextInt();
        int digit1 = integer % 10 ;
        integer = integer / 10 ;
    
        int digit2 = integer % 10 ;
        integer = integer / 10 ;
    
        int digit3 = integer % 10 ;
        integer = integer / 10 ;
        
        int sum = digit1 + digit2 + digit3 ;
        System.out.println("sum of digit is"+sum);*/
    
    
        //  (2:7)  find the number of year :
    /*  System.out.println("Enter the number of year :");
        int minute = input.nextInt();
        int minuteOfYear = 365*60*24;
        int year = minute / minuteOfYear ;
        int remainingMinute = minute % minuteOfYear ;
        int day = remainingMinute / (60 * 24) ;
        System.out.println(minute+"minute is "+year+"year"+day+"day");*/
   
    
    
    //    (2:8) show CurrentTime :
    /*  System.out.println("Enter the time zone ofset to GTM :");
        int timeZone = input.nextInt();
        long totalMilliSecond = System.currentTimeMillis();
        long totalSeconds = totalMilliSecond / 1000;
        long correntSecond = totalSeconds % 60;
        
        long totalMinutes = totalSeconds / 60 +30 ;
        long correntMinute = totalMinutes % 60;
    
        long totalHours = totalMinutes / 60 + timeZone;
        long correntHour = totalHours % 24 ;
        
        System.out.println(correntHour+":"+correntMinute+":"+correntSecond + "GTM"); */
    
        // (2:9)  phisics acceletration :
        
    /*    System.out.println("Enter starting velocty");
        double startingVelocty = input.nextDouble();
        System.out.println("Enter ending velocity");
        double endingVilocity = input.nextDouble();
        System.out.println("Enter time :");
        double time = input.nextDouble();
        double acceletration =( endingVilocity - startingVelocty) / time;
        System.out.println("acceletration is ="+acceletration);*/
    
    
    //  (2:10)  Science Calculating energy :
     /*   System.out.println("Enter amount of water in kilogram");
           
        double amountOfWater = input.nextDouble();
        System.out.println("Enter the final temperatire :");
        double finalTemperatire = input.nextDouble();
        
        System.out.println("Enter the intial temperatire :");
        double intialTemperatire = input.nextDouble();

        
        double energyNeded = amountOfWater * ( finalTemperatire - intialTemperatire )*4184 ;
        System.out.println("the energyNeded is"+energyNeded);*/
     
     
        //(2:11) dificult
    
        //  (2:12)  finding runway lenght :
       /* System.out.println("Enter valu of v ");
        int v = input.nextInt();
        System.out.println("Enter the valu of a ");
        double a = input.nextDouble();
        double lenght = (v*v) / (2*a) ;
        System.out.println("lenght is"+lenght);*/
       
         /*  **2.13   double  previousamount = 0;
    int monthlysaving = 100;
    double monthlyinterestrate = 0.00417;
    double amount = (previousamount+monthlysaving)*(1+monthlyinterestrate);
    
    
      double monthly1 = (previousamount+monthlysaving)*(1+monthlyinterestrate);
    double monthly2 = (monthly1+monthlysaving)*(1+monthlyinterestrate);
    double monthly3 = (monthly2+monthlysaving)*(1+monthlyinterestrate);
    double monthly4 = (monthly3+monthlysaving)*(1+monthlyinterestrate);
    double monthly5 = (monthly4+monthlysaving)*(1+monthlyinterestrate);
    double monthly6 = (monthly5+monthlysaving)*(1+monthlyinterestrate);
        System.out.println(monthly6);*/
    
    
    // (2:14)  Health application : computing BMI : 
     /* System.out.println("Enter weigth in pound");
    double weigth = input.nextDouble();
        System.out.println("Enter height in inches");
    double height = input.nextDouble();
    // one pound = 0.45359237  and  one inches = 0.254 meter
    double bmi = weigth*0.45359237 / (height*0.0254*height*0.0254) ;
        System.out.println("BMI is"+bmi); */
    
    /*    System.out.println("Enter x1 ");
    double x1 = input.nextDouble();
     System.out.println("Enter y1 ");
    double y1 = input.nextDouble();
     System.out.println("Enter x2 ");
    double x2 = input.nextDouble();
     System.out.println("Enter y2 ");
    double y2 = input.nextDouble();
 
    double a = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
        System.out.println("a is"+a);*/
    
    
    //  (2:16)  Geometry area of hexagon :
    /*    System.out.println("Enter the lenght of the side :");
    double s = input.nextDouble();
    double area = 3*(Math.pow(3, 1/2.0)*s*s) / 2 ;
        System.out.println("area is "+area);*/
    
    
    //  (2:17) difficult 
    
    
    // (2:18)  print a table :
       /* System.out.println("a   b    Math.pow(a, b)");
        System.out.println("1   2    Math.pow(1, 2)");
        System.out.println("2   3    Math.pow(2, 3)");
        System.out.println("3   4    Math.pow(3, 4)");
        System.out.println("4   5    Math.pow(4, 5)");
        System.out.println("5   6    Math.pow(5, 6)");*/
    
       
  /*   (*2.19) 
    double x1 = input.nextDouble();
    double x2 =input.nextDouble();
    double x3 = input.nextDouble();
    double y1 = input.nextDouble();
    double y2 = input.nextDouble();
    double y3 = input.nextDouble();
 
    double a = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
        double b = Math.sqrt(Math.pow((x3-x1), 2)+Math.pow((y3-y1), 2));
        double c = Math.sqrt(Math.pow((x3-x2), 2)+Math.pow((y3-y2), 2));
    double p = (a + b + c) / 2;
    double areaOfTriangle = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("The area of triangle ="+areaOfTriangle);*/ }
}
