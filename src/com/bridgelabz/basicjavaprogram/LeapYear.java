/******************************************************************************
 *  
 *  Purpose: Program For checking leap year

 *
 *  @author  rahul
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.basicjavaprogram;

import java.util.Scanner;

import com.bridgelabz.utility.Utils;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Utils utility = new Utils();
		
		int year;
		
		System.out.print("Enter the Year:- ");
		year = scanner.nextInt();
		
		if(utility.checkYear(year))
		{
			if(utility.checkLeapYear(year))
				System.out.println("The year is a leap year");
			else
				System.out.println("The Year is not a leap year");
		}
		else
			System.out.println("Please! Enter the year from 1582");
		
		scanner.close();
		
	}

}
