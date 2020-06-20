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
        String result = cal.operation(first, second, operator);

        System.out.printf(result);
        reader.close();
	}

	/**
	 * Function operation.
	 * @param first value1
	 * @param second value2
	 * @param operator number that assign the operation
	 * @return String that shows result's operation
     */
	private String operation(double first, double second, char operator) {
		double result = 0;
		switch (operator) {
            case '1':
                result = first + second;
                break;
            case '2':
                result = first - second;
                break;
            case '3':
                result = first * second;
                break;
            case '4':
                result = first / second;
                break;
            default:
            	return "Error! operator is not correct";
        }
		return "The result is: " + result;
	}
}
