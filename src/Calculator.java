import java.util.Scanner;

public class Calculator {

  static boolean flag = true;
  static Scanner scan = new Scanner(System.in);
  static int result;	
	
  
  public static void main(String[] args) {	
	
 
  	  
  do {  
	 
	  System.out.println("Enter the two numbers you want to operate on...\nEnter number 1 :");	
	  int number1 = Integer.parseInt(scan.nextLine());
	  System.out.println("Enter number 2 :");
	  int number2 = Integer.parseInt(scan.nextLine());
	  
	  System.out.println("Enter the number of the arithmetic operation you'd like to run : \n"
	             + "1. Addition \n2. Substraction \n3. Multiplication\n4. Division \n5. Exit");
      result = Integer.parseInt(scan.nextLine());
	
	  
	  
	  
	  switch (result) {
	  case 1:
	    System.out.println(addition(number1,number2));
	    break;
	
	case 2:
		System.out.println(substraction(number1,number2));	
		  break;
		
	
	case 3:
		System.out.println(multiplication(number1,number2));	
		  break;
	
	
	case 4:
		System.out.println(division(number1,number2));	
		  break;
	
  
	case 5:
		System.out.println("Exiting app");
		flag = false;
	}
	
	
	
  }  while  (flag);
	  
   
  }  
	  
	  
	  
	  
	  
	public static int addition(int a , int b) {
      int result = a + b;
      return result;
    }

	public static int substraction(int a , int b) {
	  int result = a - b;
	  return result;
	}
	
	
	public static int multiplication(int a , int b) {      
      int result = a * b;
      return result;
    }



  public static String division(double a , double b){
    double result = a / b;
	if (a < b) { 
	  return "INVALID INPUTS";
    }else{
    return "" + result;	
    }
  }


  



}
