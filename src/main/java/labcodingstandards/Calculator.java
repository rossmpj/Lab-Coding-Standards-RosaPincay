// Copyright (C) 2020
// All rights reserved

package labcodingstandards;

import java.util.Scanner;


/**
 * @author Rosy
 *
 */
public class Calculator {
//CHECKSTYLE:OFF
/**
 * Calculator.
 * @param args
 */
public static void main(final String[] args) {
//CHECKSTYLE:ON
Scanner reader = new Scanner(System.in);

System.out.print("1. +\n2. -\n3. *\n4. /\nEnter an operator: ");

char operator = reader.nextLine().charAt(0);
double first;
double second;
String input;

while (true) {
System.out.print("Enter first number: ");
input = reader.nextLine();

    try {
first = Integer.parseInt(input);
        break;
    } catch (NumberFormatException e) {
        System.out.println("Not valid!");
    }
}

        while (true) {
System.out.print("Enter second number: ");
input = reader.nextLine();

            try {
second = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }

        Calculator cal = new Calculator();
        String result = cal.operat(first, second, operator);

        System.out.printf(result);
        reader.close();
}

/**
 * Function operation.
 * @param n1 value1
 * @param n2 value2
 * @param op char that assign the operation
 * @return String that shows result's operation
 */
private String operat(final double n1, final double n2, final char op) {
double result = 0;
switch (op) {
            case '1':
                result = n1 + n2;
                break;
            case '2':
                result = n1 - n2;
                break;
            case '3':
                result = n1 * n2;
                break;
            case '4':
                result = n1 / n2;
                break;
            default:
return "Error! operator is not correct";
        }
return "The result is: " + result;
}
}
