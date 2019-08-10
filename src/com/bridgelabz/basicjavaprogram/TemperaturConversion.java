/***************************************************************************************
 *  
 *  Purpose: The Conversion of Temperature from fahrenhiet to celsius and vice versa.
 *
 *  @author  rahul
 *  @version 1.0
 *  @since   10-08-2017
 *
 **************************************************************************************/

package com.bridgelabz.basicjavaprogram;

import java.util.Scanner;

import com.bridgelabz.utility.Utils;

public class TemperaturConversion {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Utils utility = new Utils();
		
		double fahrenheit, celsius;
		
		System.out.print("Enter the temperature in fahrenheit:- ");
		fahrenheit = scanner.nextDouble();
		
		double result = utility.fahrenheitToCelsius(fahrenheit);
		
		System.out.println("The Temperature in Celicus is:- "+ result);
		
		System.out.print("Enter the temperature in celsius:- ");
		celsius = scanner.nextDouble();
		
		System.out.println("The Temperature in Fahrenheit:- "+utility.celsiusToFahrenheit(celsius));
		
		scanner.close();
		
	}

}
