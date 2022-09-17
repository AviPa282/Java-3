//13. Write a program to read and store 10 numbers in an array and display the maximum element after the location x specified by the user
import java.util.Scanner;
import java.util.Arrays;
class MaxAfterX
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      int a[] = new int[10];
      int sum = 0;
      System.out.println("Input:");
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
      System.out.println("Enter the starting point for max element: ");
      int x = sc.nextInt();
      int a2[] = new int[10 - (x + 1)];
      int k = 1;
      for (int j = 0; j < a2.length; j++)
      {
          a2[j] = a[x + k];
          k += 1;
      }
      
      Arrays.sort(a2);
      int max = a2[a2.length - 1];
      
      System.out.println("The max elemnt after the input is: " + max);
       sc.close();
    }
}
