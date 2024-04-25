package org.example;

public class Methods {
    public static int calc(int a, char math, int b){
        int summ = 0;
        switch (math){
            case '+':
                summ = a+b;
                break;
            case '-':
                summ = a-b;
                break;
            case '*':
                summ = a*b;
                break;
            case '/':
                summ = a/b;
                break;
            case '%':
                summ = a%b;
                break;
            default:
                System.out.println("Something went wrong:( Recheck and rerun your code");
        }
        return summ;
    }
}
