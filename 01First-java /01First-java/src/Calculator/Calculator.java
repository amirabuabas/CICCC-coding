package Calculator;
    import java.util.InputMismatchException;
    import java.util.Scanner;
    
    public class Calculator {
        public static void main(String[] args) {
         int pressed = 1;
         do{
             System.out.println("==============================");
             System.out.println("Type 1 : For Adding");
             System.out.println("Type 2 : For Subtraction");
             System.out.println("Type 3 : For Division");
             System.out.println("==============================");
    
             Scanner sc = new Scanner(System.in);
             Scanner typed=new Scanner(System.in);
            
           
            
    
            int userChoice = 0;
            int number1 = 1;
            int number2 = 1;
            int output = 0;
            
    
          
    
             
                userChoice = sc.nextInt();
    
                System.out.println("Please enter First number : ");
                number1 = sc.nextInt();
    
                System.out.println("Please enter Second number : ");
                number2 = sc.nextInt();
    
                if (userChoice == 1) {
                    output = number1 + number2;
                    
                }
    
                if (userChoice == 2) {
                    output = number1 * number2;
                }
    
                if (userChoice == 3) {
                    output = number1 / number2;
                }
               
         try{
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number which is valid meaning integer");
            } catch (IllegalStateException e) {
                System.out.println("Sorry, scanner is closed now");
            } catch (ArithmeticException e) {
                System.out.println("You cannot divide a number by 0");
            } catch (Exception e) {
                System.out.println("Something Went Wrong Sorry");
            } finally {
                System.out.println("Your final output is : " + output);  
               
            } System.out.println("Do you want to perform another calculation? Press 1 for yes or 2 for no.");
            pressed= typed.nextInt();
     
 
         }
    
 
    while(pressed==1); {
     System.out.println("thanks for using the Calculator ;)");
    }
 
    }
 }