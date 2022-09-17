//Write a program to read and store 10 numbers in an array and display the array in reverse order wihtout using a temporary array.
import java.util.Scanner;

class Reverse2
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a[] = new int[5];
      System.out.println("Input:");
      int z = a.length - 1;
      int temp = 0;
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
      
      for(int i=0;i<(a.length)/2;i++)
      {
         temp = a[i];
         a[i] = a[z];
         a[z] = temp;
         z -= 1;
      }
      for (int j = 0; j < a.length; j++)
      {
          System.out.println("Another Element is: " + a[j]);
      }
       sc.close();
    }
}
