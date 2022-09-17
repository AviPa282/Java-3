//21. Write a program to swap the first and last element of an array of size 10. 10.
import java.util.Scanner;

class SwapFirst
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
      int temp1 = a[0];
      a[0] = a[9];
      a[9] = temp1;
      for(int i=0;i<a.length;i++)
      {
        System.out.println("An element of a is: " + a[i]);
      }
       sc.close();
    }
}
