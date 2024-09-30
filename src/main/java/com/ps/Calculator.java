package com.ps;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float x = scan.nextInt();
        System.out.print("Enter another number: ");
        float y = scan.nextInt();
        scan.nextLine(); //Consume the CRLF
        System.out.print("Choose an operation (+, -, *, /): ");
        String op = scan.nextLine();
        switch(op) {
            case "+":
                System.out.println(add(x,y));
                break;
            case "-":
                System.out.print("Subtract: (a) " + x + " - " + y + " or (b) " + y + " - " + x + "? ");
                String order = scan.nextLine();
                if(order.equals("a")){
                    System.out.println(subtract(x,y));
                } else if(order.equals("b")) {
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
    public static float modulo(int x, int y) {
        return x % y;
    }


}