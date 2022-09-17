//Write a program to read and store 10 numbers in an array and display the which are even and multiples of 6.
import java.util.Scanner;

class Even6
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
       
      int a[] = new int[10];
      System.out.println("Input:");
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
      
      for(int i=0;i<a.length;i++)
      {
        if (a[i] %2 == 0 && a[i] %6 == 0)
        {
            System.out.println("One element that is even and divisible by 6 is: " + a[i]);
        }
       sc.close();
    }
}
}