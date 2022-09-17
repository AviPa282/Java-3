//16. Write a program to read and store 20 numbers in an array .Find the sum of first 10 and last 10 elements. Display which half has bigger sum.  no and odd numbers.
import java.util.Scanner;

class BiggerHalf
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       
      int a[] = new int[20];
      System.out.println("Input:");
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
      int sum1 = 0;
      int sum2 = 0;
      
      for(int i=0;i < (a.length/2) - 1;i++)
      {
        sum1 += a[i];
      }
      for (int j = 10; j < a.length; j ++)
      {
          sum2 += a[j];
      }
      System.out.println("The sum of first half is: " + sum1);
      System.out.println("The sum of second half is:  " + sum2);
      if (sum1 > sum2)
      {
          System.out.println("The first half is greater than the second half");
      }
      else if (sum2 > sum1)
      {
          System.out.println("The second half is greather than the first half");
      }
      else
      {
          System.out.println("Both the halves are equal");
      }
       sc.close();
    }
}
