/******************************************************************************
 *  
 *  Purpose: Program to calculate WindChill
 *
 *  @author  rahul
 *  @version 1.0
 *  @since   09-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.utility.Utils;

public class WindChill {

	public static void main(String[] args) {
		
		Utils utility = new Utils();
		
		double temperature = Double.parseDouble(args[0]);
		double windSpeed = Double.parseDouble(args[1]);
		
		if(utility.checkTemperature(temperature))
		{
			if(utility.checkWindSpeed(windSpeed))
			{
				System.out.println("The Temperature of WindChill is:- "+ temperature);
				System.out.println("The WindSpeed of WindChill is:- "+ windSpeed);
				System.out.println("The WindChill is:- "+ utility.computeWindChill(temperature, windSpeed));
			}
			else
				System.out.println("WindSpeed is not Valid");
		}
		else
			System.out.println("Temperature is not Valid");
		
	}

}
