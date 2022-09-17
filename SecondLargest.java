//17. Write a program to read and store 20 numbers in an array and find out the largest even no and smallest odd number.
import java.util.Scanner;

class SecondLargest
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      int a[] = new int[20];
      System.out.println("Input 20 numbers:");
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
      int largeeven = a[0];
      int smallodd = a[0];
      for(int i=0;i<a.length;i++)
      {
        if (a[i] %2 == 0 && a[i] >= largeeven)
        {
            largeeven = a[i];
        }
        
        else if ( a[i] % 2 != 0 && a[i] <= smallodd)
        {
            smallodd = a[i];
        }
      }
      System.out.println("The largest even number is: " + largeeven);
      System.out.println("The smallest odd number is: " + smallodd);
       sc.close();
    }
}
