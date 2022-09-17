//26. Read a number between 1 to 50 and display the Roman value for the same.
import java.util.Scanner;

class Roman
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String[] roman = {"I", "IV","V", "IX","X", "XL", "L" };
      int[]    num = {1, 4, 5, 9, 10, 40, 50};
      System.out.println("Enter a number: ");
      int n = sc.nextInt();
      String result = "";
      for(int j = num.length - 1; j >= 0; j--)
      {
          int denomination = n/num[j];
          for (int i = 1; i <= denomination; i++)
          {
              result += roman[j];
          }
          n = n%num[j];
      }
      
      System.out.println("THe final output is: " + result);
      
      sc.close();
    }
}
