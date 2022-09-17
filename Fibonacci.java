//14. Write a program to store first 20 terms of a Fibonacci series in an array.
import java.util.Scanner;

class Fibonacci
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a[] = new int[20];
      int x = 0;
      int y = 1;
      int z = 0; 
      for (int i = 0; i < a.length; i ++)
      {
          a[i] = x;
          z = x + y;
          int temp = y;
          x = temp;
          y = z;
      }
      
      for (int j = 0; j < a.length; j ++)
      {
          System.out.println("An element of the fibonaccie sequence is: " + a[j]);
      }
      

      sc.close();
    }
}
