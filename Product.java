//Write a program to read and store 10 numbers in an array and display the product of alternate elements of the array.
import java.util.Scanner;

class Product
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
    int product = 1;
    int a[] = new int[10];
    System.out.println("Input:");
    for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
      
    for(int i=0;i<a.length;i+=2)
      {
       product *= a[i];  
      }
    System.out.println("The final product of the alternate element: " + product);
    sc.close();
    }
}
