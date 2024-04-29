package HomeworkReDo;

import java.util.Scanner;

public class Homework3_ReDo_calculator {
    public static void main(String[] args) {
        int num1, num2;
        char mathSymbol;
        Scanner dataFromConsole = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        num1 = dataFromConsole.nextInt();
        System.out.println("Enter operator: ");
        mathSymbol = dataFromConsole.next().charAt(0);
        System.out.println("Enter number 2: ");
        num2 = dataFromConsole.nextInt();



        switch (mathSymbol){
            case '+':
                System.out.println("Result is:\n " + Methods2.summ(num1, num2));;
            break;
            case '-':
                System.out.println("Result is:\n " + Methods2.subtraction(num1, num2));
                break;
            case '/':
                System.out.println("Result is:\n " + Methods2.divide(num1, num2));
                break;
            case '*':
                System.out.println("Result is:\n " + Methods2.multi(num1, num2));
                break;
            case '%':
                System.out.println("Result is:\n " + Methods2.leftover(num1, num2));
                break;
            default:
                System.out.println("Something went wrong:( Recheck and rerun your code");
        }
    }
}

//            case '-':
//                sum = num1 - num2;
//                break;
//            case '/':
//                sum = num1/num2;
//                break;
//            case '*':
//                sum = num1*num2;
//                break;
//            case '%':
//                sum = num1%num2;
//                break;

