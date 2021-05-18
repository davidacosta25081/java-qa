package iteration;
import java.util.Scanner;

public class Numbers {

  public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in);
    int num;
    do {
      System.out.println("Please enter a two digit number between 10 and 99");
      num = scan.nextInt();
    } while(num < 10 || num > 99);
	  
	  System.out.println("The added digits of number typed are = " + addingDigits(num));
  }
	
	
  public static int addingDigits (int a) {
    int x = a % 10;
    a = a / 10;
    int y = x + a; 
    return y;
  }
}



/* Create a method that takes a number 10-99 
   and adds the two digits together for example 74 = 7 + 4 = 11.
*/