//23. Read a number and display corresponding month name and no of days in it. For e.g. if the input is 5 output must be May has 31 days
import java.util.Scanner;

class MonthDays
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       
      String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
      int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      System.out.println("Enter a number for the month: ");
      int num = sc.nextInt();
      
      System.out.println("The month based on the day is: " + months[num-1]);
      System.out.println("The number of days in the month is: " + days[num - 1]);
      
       sc.close();
    }
}
