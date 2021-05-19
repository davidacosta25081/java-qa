package iteration;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {

		addingDigits();
		numberToWord(34);
	}

	public static void addingDigits() {
	  Scanner scan = new Scanner(System.in);
	  int num;
	  do {
	    System.out.println("Please enter a two digit number between 10 and 99");
	    num = scan.nextInt();
	    } while(num < 10 || num > 99);
	  int x = num % 10;
      num = num / 10;
      int y = x + num; 
      System.out.println("The added digits of number typed are = " + y + "! \n");
    }

	
	public static void numberToWord(int num) {

	  String[] multOfTen = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
	  String[] oneToNine = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	  int secondNum = num % 10;
	  num = num / 10;
	  String first = multOfTen[num];
	  String second = oneToNine[secondNum];
	  System.out.println("Number to word = " + first + "-" + second +"!");
	}

}

/*
   Create a method that takes a number 10-99 and adds the two digits together
   for example 74 = 7 + 4 = 11.
 
   Create a method that when given the number 1-99 returns a String representation of this number, 
   for example 1 = one, 11 = eleven, 21 = twenty-one.
*/