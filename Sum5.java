//9. Read the marks of a student in 6 subjects and display the sum of best five
import java.util.Scanner;
import java.util.Arrays;
class Sum5
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a[] = new int[6];
      int sum = 0;
      System.out.println("Input:");
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
      Arrays.sort(a);
      for (int i = 1; i<a.length; i++)
      {
          sum += a[i];
      }
      System.out.println("The sum of the five best scores is: " + sum);
      
       sc.close();
    }
}
