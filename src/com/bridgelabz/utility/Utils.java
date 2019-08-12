/******************************************************************************
 *  
 *  Purpose: The Utility file to store the logic of all the program.
 *
 *  @author  rahul
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.utility;

public class Utils {
		
		
	/**
	 * Purpose:-  To Print the K-pattern 
	 * 
	 */
	public void kPattern()
	{
		int space = 8;
		int iterator, firstTwoStar, lastThreeStar, whiteSpace;
		for(iterator=0;iterator<=4;iterator++)
		{
			for(firstTwoStar=1; firstTwoStar<=2; firstTwoStar++)
				System.out.print("*");
			
			for(whiteSpace=1; whiteSpace<=space; whiteSpace++)
				System.out.print(" ");
				
			space = space-2;
				
			for(lastThreeStar=1; lastThreeStar<=3; lastThreeStar++)
				System.out.print("*");
				
			System.out.println();
				
		}
		space = 2;
		for(iterator=5; iterator<9; iterator++)
		{
			for(firstTwoStar=1;firstTwoStar<=2;firstTwoStar++)
				System.out.print("*");
				
			for(whiteSpace=1; whiteSpace<=space; whiteSpace++)
				System.out.print(" ");
				
			space= space+2;
				
			for(lastThreeStar=1; lastThreeStar<=3; lastThreeStar++)
				System.out.print("*");
				
			System.out.println();
		}
	}
	
	
	
	/**
	 *  Purpose:- To Print the D-Pattern
	 * 
	 */
	public void dPattern()
	{
		int space = 6;
		int iterator, firstTwoStar, lastTwoStar, whiteSpace;
		for(iterator=0; iterator<=4; iterator++)
		{
			for(firstTwoStar=1; firstTwoStar<=2; firstTwoStar++)
				System.out.print("*");
			
			for(whiteSpace=1; whiteSpace<=space; whiteSpace++)
			{
				if(iterator==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
				
			if(iterator<3)
				space = space+2;
			
			for(lastTwoStar=1; lastTwoStar<=2; lastTwoStar++)
				System.out.print("*");
			
			System.out.println();
		}
		
		for(iterator=5; iterator<9; iterator++)
		{
			for(firstTwoStar=1; firstTwoStar<=2; firstTwoStar++)
				System.out.print("*");
			
			for(whiteSpace=1; whiteSpace<=space; whiteSpace++)
			{
				if(iterator==8)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			space= space-2;
			
			for(lastTwoStar=1; lastTwoStar<=2; lastTwoStar++)
				System.out.print("*");
			
			System.out.println();
		}
		

	}
	
	
	
	/**
	 * Purpose:- To reverse the name.
	 * 
	 * @param 	args 		Command Line Inputs name	
	 * @return 	reverse		Reversed Name.
	 */
	public String reverseName(String[] args) {
		
		int length = args.length;
		String reverse="";
		for(int i=length-1;i>=0;i--)
		{
			if(i == 0)
				reverse = reverse+args[i]+".";
			else
				reverse = reverse+args[i]+", ";
		}
		return reverse;
	}
	

	/**
	 * Purpose:- To check the Precedence on Integer.
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @param thirdNumber
	 */
	public void operationOnIntPrecedence(int firstNumber, int secondNumber, int thirdNumber)
	{
		System.out.println("The ouput of a+b*c is: " + (firstNumber+(secondNumber*thirdNumber)));
		System.out.println("The ouput of a*b+c is: " + ((firstNumber*secondNumber)+thirdNumber));
		System.out.println("The ouput of c+a/b is: " + (thirdNumber+(firstNumber/secondNumber)));
		System.out.println("The ouput of a%b+c is: " + ((firstNumber%secondNumber)+thirdNumber));
	}
	
	
	
	/**
	 * Purpose:- To check the Precedence on Double
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @param thirdNumber
	 */
	public void operationOnDoublePrecedence(double firstNumber, double secondNumber, double thirdNumber)
	{
		System.out.println("The ouput of a+b*c is: " + (firstNumber+(secondNumber*thirdNumber)));
		System.out.println("The ouput of a*b+c is: " + ((firstNumber*secondNumber)+thirdNumber));
		System.out.println("The ouput of c+a/b is: " + (thirdNumber+(firstNumber/secondNumber)));
		System.out.println("The ouput of a%b+c is: " + ((firstNumber%secondNumber)+thirdNumber));
	}
	
	
	
	/**
	 * Purpose:- Check year, If it is greater than 1582 or not
	 * 
	 * @param 	year
	 * @return 	boolean value(True or False)
	 */
	public boolean checkYear(int year) {
		
		final int startLeapYear = 1582;
		
		if(year >= startLeapYear)
			return true;
		else
			return false;
	}
	
	
	/**
	 * Purpose:- To calculate whether it is leap year or not
	 * 
	 * @param 	year
	 * @return	true or false
	 */
	public boolean checkLeapYear(int year) {		
		
		if(year%4==0)
		{
			if(year%100 == 0)
			{
				if(year%400 == 0)
					return true;
				else
					return false;
			}
			else
				return true;
		}
		else
			return false;
		
	}
	
	
	
	/**
	 * Purpose:- To check whether it the season of Spring or not
	 * 
	 * @param month
	 * @param day
	 * @return
	 */
	public boolean checkSpringSeason(int month, int day) {
		
		if(month == 3 && (day>=20 && day <=31))
			return true;
		else if(month == 4 && (day >=1 && day <= 30))
			return true;
		else if(month == 5 && (day >=1 && day <= 31))
			return true;
		else if(month == 6 && (day >=1 && day <= 20))
			return true;
		else
			return false;
		
	}
	
	
	
	/**
	 * Purpose:- To calculate the quadratic equation
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public void rootsOfQuadraticEquation(int a, int b, int c) {
				
		double delta, root1, root2;
		
		delta = (b*b)-(4*a*c);
		
		root1 = (-b + ((Math.sqrt(delta))))/(2*a);
		
		root2 = (-b - ((Math.sqrt(delta))))/(2*a);
		
		System.out.println("The roots of the first Quadratic Equation is:- "+ root1);
		
		System.out.println("The roots of the first Quadratic Equation is:- "+ root2);
	}
	
	
	
	/**
	 * Purpose:- To calculate the euclidean Distance
	 * 
	 * @param x
	 * @param y
	 * @return result;
	 */
	public double euclideanDistance(int x, int y) {
		
		double result = Math.sqrt((Math.pow(x, x)) + Math.pow(y, y));
		
		return result;
		
	}
	
	
	/**
	 * Purpose:- Addition of Two Dice
	 * 
	 * @param dice1
	 * @param dice2
	 * @return
	 */
	public int sumOfTwoDice(int dice1, int dice2) {
		return dice1 + dice2;
	}
	
	
	
	/**
	 *  Purpose:- Generating Five Random Number, their min and max value
	 */
	public void stats5()
	{
		float sum=0;
		for(int i=0;i<5;i++)
		{
			float randomNumber = (float) Math.random();
			System.out.println("The "+(i+1)+ " Random Number is:- "+ randomNumber);
			sum = sum + randomNumber;
		}
		System.out.println("The Average of these Random Number is:- "+sum/5);
		System.out.println("The Minimum Value in these Random Number is:- "+Math.min(0.0, 1.0));
		System.out.println("The Maximum Value in these Random Number is:- "+Math.max(0.0, 1.0));
		
	}
	
	
	
	/**
	 * Purpose:- To check the temperature of the WindChill
	 * 
	 * @param temperature
	 * @return True or false
	 */
	public boolean checkTemperature(double temperature) {
		
		final int maxTemperature = 50;
		
		if(temperature > maxTemperature)
			return false;
		else
			return true;
	}
	
	
	
	/**
	 * Purpose:- To check the Wind Speed of the WindChill
	 * 
	 * @param windSpeed
	 * @return True or false
	 */
	public boolean checkWindSpeed(double windSpeed) {
		
		final int minWindSpeed = 3;
		final int maxWindSpeed = 120;
		
		if(windSpeed < minWindSpeed || windSpeed > maxWindSpeed)
			return false;
		else
			return true;
	}
	
	
	
	/**
	 * Purpose:- To Calculate the WindChill
	 * 
	 * @param temperature
	 * @param windSpeed
	 * @return WindChill
	 */
	public double computeWindChill(double temperature, double windSpeed) {
		
		final double constant = 35.74;
		final double constantTemperature = 0.6215;
		
		double calWindSpeed = Math.pow(windSpeed, 0.16);
		double thirdTerm = ((0.4275*temperature)-35.75)*calWindSpeed;
		double secondTerm = constantTemperature*temperature;
		
		double WindChill = constant + secondTerm + thirdTerm;
		
		return WindChill;
		
	}
	
	
	
	/**
	 * Purpose:- Conversion from fahrenheit to Celsius
	 * 
	 * @param fahrenheit
	 * @return result
	 */
	public double fahrenheitToCelsius(double fahrenheit) {
		
		final double constantCelsius = 32;
		final double constantFahrenheit = 0.55556;
				
		double result = (fahrenheit - constantCelsius) * constantFahrenheit;
		
		return result;
		
	}
	
	
	
	/**
	 * Purpose:- Conversion from Celsius to Fahrenheit
	 * 
	 * @param celsius
	 * @return result
	 */
	public double celsiusToFahrenheit(double celsius) {
		
		final double constantCelsius = 32;
		final double constantFahrenheit = 0.55556;
		
		double result = (celsius * constantFahrenheit) + constantCelsius;
		
		return result;
		
	}
	
	
	
	/**
	 * Purpose:- Calculate Monthly Emi for car loan
	 * 
	 * @param principal
	 * @param year
	 * @param interest
	 * @return payment
	 */
	public double calculateCarLoanEmi(int principal, int year, double interest) {
		
		int n = 12 * year;
		
		double r = interest/(12*100);
		
		double payment = principal*r/(1-(Math.pow(1+r, -n)));
		
		return payment;
	}
	
	
	
	/**
	 * Purpose:- Performing various trignometric function.
	 * 
	 * @param degree
	 */
	public void trigoFunction(float degree) {
		
		float radian;
		
		radian = (float) Math.toRadians(degree);
		System.out.println("The above angle " + degree + " in radian is:- "+radian);
		
		System.out.println("sin:- "+Math.sin(degree));
		
		System.out.println("cos:- "+Math.cos(degree));
		
	}
	
	
	
	
	
	
	
	
	

}
