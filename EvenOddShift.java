//27. Write a program to store 10 numbers in an array and shift all even numbers to array E[] and all odd numbers to array O[]. B[] and next 5 in array C[]. Display the content of new arrays..
import java.util.Scanner;

class EvenOddShift
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
      
      int even = 0;
      int odd = 0;
      for(int j = 0; j<a.length; j++)
      {
          if (a[j] %2 == 0)
          {
              even += 1;
          }
          else
          {
              odd += 1;
          }
      }
      
      int e[] = new int[even];
      int o[] = new int[odd];
      int k = 0;
      int l = 0;
      for(int j = 0; j<a.length; j++)
      {
          
          if (a[j] %2 == 0)
          {
              e[k] = a[j];
              k += 1;
          }
          else
          {
              o[l] = a[j];
              l += 1;
          }
      }
      
      for(int i=0;i<e.length;i++)
      {
        System.out.println("An element is of e is: " + e[i]);
      }
      
      for(int i=0;i<o.length;i++)
      {
        System.out.println("An element is of o is: " + o[i]);
      }
      
      
      
      sc.close();
    }
    
    
    }

