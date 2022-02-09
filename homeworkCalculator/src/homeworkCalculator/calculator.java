package homeworkCalculator;
import java.util.Scanner;
public class calculator{

   public static void main(String[] args) {
      // declare variables
      double num1=0.0, num2=0.0;
      double sum=0.0, sub=0.0, multiple=0.0, divide=0.0;
      char operator='\0';
      boolean nextProblem= true;
      

      // create Scanner class OBJECT to  
      // read inputs
      Scanner scan = new Scanner(System.in);

      // loop to repeat until system out
      while(nextProblem) {

         // read numbers from user
         System.out.print("Enter two numbers: ");
         num1 = scan.nextDouble();
         num2 = scan.nextDouble();

         // read operation
         System.out.println("Which operation "
		+ "do you want to perform? \n"
		+ "1. Addition \n"
		+ "2. Subtraction \n"
		+ "3. Multiplication \n"
		+ "4. Division \n"
		+ "5. Exit");
         System.out.print("Enter option number: ");
         operator = scan.next().charAt(0);

         // switch-case
         switch(operator) {

            case '1':
               sum = add(num1, num2);
               System.out.println(num1 + " + "+ num2 + " = " + sum);
               break;

            case '2':
               sub = subtract(num1, num2);
               System.out.println(num1 + " - "+ num2 + " = " + sub);
               break;

            case '3':
               multiple = multiply(num1, num2);
               System.out.println(num1 + " * "+ num2 + " = " + multiple);
               break;

            case '4':
               divide = division(num1,num2);
               System.out.println(num1 + " / "+ num2 + " = " + divide);
               break;
               
            case '5':
               // exit program
               System.exit(0); 

            default:
               System.out.println("Error");}
         } // end of switch-case

         

      

      // close Scanner class object
      
   }

   // method for addition 
   public static double add(double num1, double num2) {
      return num1 + num2;
   }

   // method for subtraction
   public static double subtract(double num1, double num2){
      return num1 - num2;
   }

   // method for multiplication 
   public static double multiply(double num1, double num2){
      return num1 * num2;
   }

   // method for division
   public static double division(double num1, double num2){
      return num1 / num2;
   }

   
}
