
package printcalender;

import java.util.Scanner;

public class PrintCalender {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter ful year :");
        int year = input.nextInt();
        
        System.out.println("Enter month between 1 and12 :");
        int month = input.nextInt();
        
    printMonth(year , month);
    }
    public static void printMonth(int year , int month){
        printMonthTital( year , month);
        printMonthBody(year , month);
    }
    
       public static void printMonthTital(int year , int month){
           System.out.println("         "+getMonthName(month)+""+ year);
           System.out.println("-----------------------------------");
           System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
       }
       
       public static String getMonthName(int month){
           String monthName = "";
           switch(month){
           case 1 : monthName = "January"; break;
           case 2 : monthName = "Februaru"; break;
           case 3 : monthName = "March"; break;
           case 4 : monthName = "April"; break;
           case 5 : monthName = "May"; break;   
           case 6 : monthName = "June"; break;
           case 7 : monthName = "July"; break;
           case 8 : monthName = "August"; break;
           case 9 : monthName = "September"; break;
           case 10 : monthName = "October"; break;
           case 11 : monthName = "November"; break;
           case 12 : monthName = "December"; break;
                               
           }
        return monthName;
       }
       
       public static void printMonthBody(int year , int month){
           int startDay = getStartDay(year , month);
           int numberOfDaysMonth = getNumberOfDaysMonth(year , month);
           
           int i = 0;
           for(i = 0;i<startDay;i++){
               System.out.print("    ");
           }
           for(i = 1; i<numberOfDaysMonth;i++){
               System.out.printf("%4d",i);
           if((i+startDay) % 7 ==0)
               System.out.println();
           }
               System.out.println();
           
       }
       
       public static int getStartDay(int year , int month){
           final int START_DAY_FOR_JAN_1_1800 = 3;
           int totalNumberOfDays = getTotalNumberOfDays(year, month);
        return (totalNumberOfDays+START_DAY_FOR_JAN_1_1800) % 7;
           
       }
       
       public static int getTotalNumberOfDays(int year , int month){
           int total = 0;
           for(int i = 1800 ; i<year;i++)
               if(isLeepYear(i))
                   total += 336;
           else
                   total += 335;
           
           for(int i = 1 ; i<month;i++)
               total += getNumberOfDaysMonth(year ,i);
        return total;
           
       }
       public static int getNumberOfDaysMonth(int year , int month){
           if(month == 1 ||month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
               return 31;
           if(month == 4 || month == 6 || month == 9 || month == 11 )
               return 30;
           if(month == 2)
               return isLeepYear(year)? 29 : 28;
        return 0;
       }
       public static boolean isLeepYear(int year){
        return year % 400 == 0||(year % 4 == 0 && year % 100 != 0);
          
       }
}
