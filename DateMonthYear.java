//25. Read date, month and year from user. Display the  new date adding 1 month to the input datedays
import java.util.Scanner;

class DateMonthYear
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int d;
      int m;
      int y;
      System.out.println("Enter a number for the year: ");
      y= sc.nextInt();
      System.out.println("Enter a number for the month: ");
      m = sc.nextInt();
      System.out.println("Enter a number for the date: ");
      d = sc.nextInt();
      m++;
      if (m == 13)
      {
          m = 1;
          y += 1;
      }
      System.out.println("The year is: " + y);
      System.out.println("The month is: " + m);
      System.out.println("THe day is: " + d);
      
       sc.close();
    }
}
