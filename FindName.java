//30.  Write a program to store 15 names in an array and search a particular name inputted by the user by using Linear Search Technique 
import java.util.Scanner;

class FindName
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       
    String[] names = {"Bob", "John", "Jack", "Jill", "Jeff", "Brock", "Leo", "Mike", "Michael", "Ralph", "Rex", "Colt"};
      
    System.out.println("Enter a name to find: ");
    String search = sc.nextLine();
    int flag = 0;
    for (int i = 0; i < names.length; i++)
      {
        if (names[i].equals(search))
        {
            flag = 1;
              System.out.println("The name is found at index: " + i);
              break;
        }
      }
    
    if (flag == 0)
    {
        System.out.println("The name is not present in the array");
    }
    
    sc.close();
    }
}
