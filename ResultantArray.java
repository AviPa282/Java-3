//28. Write a program to create 2 one dimensional array having 10 elements each. Merge both the array to array M[].Display the resultant array.hem into array C[] .
import java.util.Scanner;

class ResultantArray
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
       
      int a[] = new int[10];
      int b[] = new int[10];
      int m[] = new int[a.length + b.length];
      System.out.println("Input for array A:");
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
      
      System.out.println("Input for array B:");
      for(int i=0;i< b.length;i++)
      {
        b[i] = sc.nextInt();
      }
      
      for (int i = 0; i < a.length; i++)
      {
          m[i] = a[i];
          
      }
      int k = 10;
      for (int i = 0; i < b.length; i++)
      {
          m[k] = b[i];
          k += 1;
      }

      for (int i = 0; i < m.length; i++)
      {
          System.out.println("An element of array m is: " + m[i]);
      }
      sc.close();
    }
    
    
    }

