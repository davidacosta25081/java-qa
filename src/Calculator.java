
public class Calculator {


  public static int addition(int a , int b) {
    int result = a + b;
    return result;
  }

  public static int multiplication(int a , int b) {      
    int result = a * b;
    return result;
  }


  public static int substraction(int a , int b) {
    int result = a - b;
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
