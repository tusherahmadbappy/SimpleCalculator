
package simplecalculator;

public class Calculator {
    int sum,sub,mul,div,modu=0;
    
    void addition(int num1,int num2){
        sum=num1+num2;
       System.out.printf("Addition of %d + %d is: %d\n",num1,num2,sum);
       
    }
    
    void subtraction(int num1,int num2){
        if(num1< num2){
            sub = num2 - num1;
            System.out.printf("Subtraction of %d - %d is: %d\n",num2,num1,sub);
        }
        
        else{
            sub = num1 - num2;
            System.out.printf("Subtraction of %d - %d is: %d\n",num1,num2,sub);
        }
    }
    
    void multiplication(int num1,int num2){
        mul=num1*num2;
       System.out.printf("Multiplication of %d * %d is: %d\n",num1,num2,mul);
    }
    
    void division(int num1,int num2){
        if(num1< num2){
            div = num2 / num1;
            System.out.printf("Division of %d / %d is: %d\n",num2,num1,div);
        }
        
        else{
            div = num1 / num2;
            System.out.printf("Division of %d / %d is: %d\n",num1,num2,div);
        }
    }
    
    void modulus(int num1,int num2){
        if(num1< num2){
            modu = num2 % num1;
            System.out.printf("Modulus of %d and %d is: %d\n",num2,num1, modu);
        }
        else{
            modu = num1 % num2;
            System.out.printf("Modulus of %d and %d is: %d\n",num1,num2, modu);
        }
    }
    
    
}
