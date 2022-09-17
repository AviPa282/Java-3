//20.Write a program to count the even numbers in odd locations of an array of size 10.
import java.util.Scanner;

class CountEvenOdd
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       
      int a[] = new int[10];
      int count = 0;
      System.out.println("Input:");
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
      
      for(int i=1;i<a.length;i+=2)
      {
        if (a[i] %2 == 0)
        {
            count += 1;
        }
      }
      System.out.println("The amount of even numbers in odd locations: " + count);
       sc.close();
    }
}
