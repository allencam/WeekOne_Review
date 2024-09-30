package com.ps;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        float x = scan.nextFloat();
        System.out.print("Enter another number: ");
        float y = scan.nextFloat();
        scan.nextLine(); //Consume the CRLF
        System.out.print("Choose an operation (+, -, *, /, %): ");
        String op = scan.nextLine();

        switch(op) {
            case "+":
                System.out.println(add(x,y));
                break;
            case "-":
                System.out.print("Subtract: (a) " + x + "-" + y + " or (b) " + y + "-" + x + "? ");
                String orderSub = scan.nextLine();
                if(orderSub.equals("a")){
                    System.out.println(subtract(x,y));
                } else if(orderSub.equals("b")) {
                    System.out.println(subtract(y,x));
                }
                else {
                    System.out.println("Invalid selection. Goodbye!");
                }
                break;
            case "*":
                System.out.println(multiply(x,y));
                break;
            case "/":
                if( x == 0 || y == 0 ) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.print("Divide: (a) " + x + "/" + y + " or (b) " + y + "/" + x + "? ");
                    String orderDiv = scan.nextLine();
                    if (orderDiv.equals("a")) {
                        System.out.print(divide(x, y));
                    } else if (orderDiv.equals("b")) {
                        System.out.print(divide(y, x));
                    }
                }
                break;
            case "%":
                if( x == 0 || y == 0 ) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.print("Get remainder of: (a) " + x + "/" + y + " or (b) " + y + "/" + x + "? ");
                    String orderMod = scan.nextLine();
                    if (orderMod.equals("a")) {
                        System.out.print(modulo(x, y));
                    } else if (orderMod.equals("b")) {
                        System.out.print(modulo(y, x));
                    }
                }
                break;
            default:
                System.out.println("Invalid option");
        }
    }
// ==================== Operation Methods ==================== \\
    public static float add(float x, float y) {
        return x + y;
    }
    public static float subtract(float x, float y) {
        return x - y;
    }
    public static float multiply(float x, float y) {
        return x * y;
    }
    public static float divide(float x, float y) {
        return x / y;
    }
    public static float modulo(float x, float y) {
        return x % y;
    }
}