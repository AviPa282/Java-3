//12.  Write a program to read and store 10 numbers in an array and display the maximum and minimum element in the same
import java.util.Scanner;
import java.util.Arrays;
class MaxAndMin
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a[] = new int[10];
      
      System.out.println("Input:");
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
      Arrays.sort(a);
      int max = a[a.length - 1];
      int min = a[0];
      System.out.println("The max of the 10 numbers: " + max);
      System.out.println("The min of the 10 numbers: " + min);
       sc.close();
    }
}
