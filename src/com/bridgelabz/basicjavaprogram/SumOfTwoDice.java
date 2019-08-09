/******************************************************************************
 *  
 *  Purpose: Addition of Two Dice
 *
 *  @author  rahul
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.utility.Utils;

public class SumOfTwoDice {

	public static void main(String[] args) {
		
		Utils utility = new Utils();
		
		int dice1 = 1 + (int) (Math.random() * 6);
		
		int dice2 = 1 + (int) (Math.random() * 6);
		
		System.out.println("First Random Number is:- "+dice1);
		System.out.println("Second Random Number is:- "+dice2);
		System.out.println("Sum of two Random Number is:- "+utility.sumOfTwoDice(dice1, dice2));
		
	}

}
