
package simplecalculator;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        
        //create a Calculator class object
        Calculator ob1 = new Calculator();
        
        //create a scanner class object
        Scanner s = new Scanner(System.in);
        
        //user input in console
        System.out.println("Enter the element:");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        
        //Calculator class method call
        ob1.addition(num1, num2);
        ob1.subtraction(num1, num2);
        ob1.multiplication(num1, num2);
        ob1.division(num1, num2);
        ob1.modulus(num1, num2);
        
    }
    
}
