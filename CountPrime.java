//22. Write a program to count number of prime numbers in an array of size 10.
import java.util.Scanner;

class CountPrime
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       
      int a[] = new int[10];
      int count = 0;
      int prime = 0;
      System.out.println("Input:");
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }

      for(int i=0;i<a.length;i++)
      {
       prime = 0;
        for (int j = 2; j < (a[i] / 2) + 1; j++)
       {
            if (a[i]% j == 0)
            {
                prime = 1;
                System.out.println(a[i]);
                break;
            }
       }
       if (prime == 0)
       {
           count += 1;
       }
      }
      System.out.println("The count of prime nummbers is: " + count); 
       sc.close();
    }
}
