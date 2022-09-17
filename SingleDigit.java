//24.  Read a single digit and display the same in word. For e.g. input 1 output ->One the input is 5 output must be May has 31 days
import java.util.Scanner;

class SingleDigit
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       
      String[] digits = {"Zero","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
      
      System.out.println("Enter a number for the digit: ");
      int num = sc.nextInt();
      
      System.out.println("The word based on the number is: " + digits[num]);
       sc.close();
    }
}
