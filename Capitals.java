//29. Write a program to store 20 countries name and capitals name in array CA [] and CO[]. When the user inputs a country name the program displays the Capital name, If the country name is not present then the program shows an appropriate error message the input is 5 output must be May has 31 days
import java.util.Scanner;

class Capitals
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       
      String[] country = {"India", "Afgahnistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua", "Argentina"};
      String[] capital = {"Delhi", "Kabul", "Tirana", "Algiers", "Andorra la Vella", "Luanda", " Buenos Aires"};
      System.out.println("Enter a country: ");
      String countryuser = sc.nextLine();
      int temp = 0;
      for (int i = 0; i < country.length; i++)
      {
          if(countryuser.equals(country[i]))
          {
              temp = i; 
              break;
          }
      }
      
      System.out.println("The capital corresponding to the country is: " + capital[temp]);
      
      
       sc.close();
    }
}
