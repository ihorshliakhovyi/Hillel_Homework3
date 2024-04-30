package HomeworkReDo;

import java.util.Scanner;

public class Methods2 {
    public static int summ(int n1, int n2){
        return n1+n2;
    }
    public static int subtraction(int n1, int n2){
        return n1-n2;
    }
    public static String divide(int n1, int n2){
        String result = "Try again";
        if (n2 != 0){
            result = String.valueOf(n1/n2);
        }
        return result;
      }
    public static int multi(int n1, int n2){
        return n1*n2;
    }
    public static int leftover(int n1, int n2){
        return n1%n2;
    }
    public static float percentage(int n1, int n2){
        return (float) (n1 * n2) / 100;
    }








//    public static int calc (int num1, int num2, char mathSymbol){
//        int sum = 0;
//        Scanner dataFromConsole = new Scanner(System.in);
//        System.out.println("Enter number 1: ");
//        num1 = dataFromConsole.nextInt();
//        System.out.println("Enter number 2: ");
//        num2 = dataFromConsole.nextInt();
//        System.out.println("Enter operator: ");
//        mathSymbol = dataFromConsole.next().charAt(0);
//        switch (mathSymbol){
//            case '+':
//                sum = num1+num2;
//                break;
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
//            default:
//                System.out.println("Something went wrong:( Recheck and rerun your code");
//        }
//        return sum;
//    }
}
