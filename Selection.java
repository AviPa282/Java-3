//32. Write a program to store 15 numbers in array and sort it by using Selection sorting technique.days
import java.util.Scanner;

class Selection
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int arr[] = new int[10];
    System.out.println("Enter the inputs: ");
    for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
        
    for(int i=0;i<arr.length;i++)
    {
      int small=arr[i];
      int pos=i;
      for(int j=i;j<arr.length;j++)
      {
         if(arr[j]<small)
          {
             small=arr[j];
             pos=j;
          }
      }
      int temp=arr[i];
      arr[i]=arr[pos];
      arr[pos]=temp;
      
      for(int i=0;i<arr.length;i++)
      {
         System.out.println("
      }
        
      
    }
    sc.close();
}
}
