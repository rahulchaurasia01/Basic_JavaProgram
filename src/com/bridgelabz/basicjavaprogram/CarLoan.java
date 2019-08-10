/******************************************************************************
 *  
 *  Purpose: To calculate monthly emi need to pay for car loan.
 *
 *  @author  rahul
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.utility.Utils;

public class CarLoan {

	public static void main(String[] args) {
		
		Utils utility = new Utils();
		
		int principal = Integer.parseInt(args[0]);
		
		int year = Integer.parseInt(args[1]);
		
		double interest = Double.parseDouble(args[2]);
		
		double payment = utility.calculateCarLoanEmi(principal, year, interest);
		
		System.out.println("The monthly emi you need to pay:- "+payment);
		
	}

}
