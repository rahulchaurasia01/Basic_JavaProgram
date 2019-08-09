/******************************************************************************
 *  
 *  Purpose: Precedence of the double 

 *
 *  @author  rahul
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.basicjavaprogram;

import java.util.Scanner;

import com.bridgelabz.utility.Utils;

public class DoubleOpt {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Utils utility = new Utils();
		
		double firstNumber, secondNumber, thirdNumber;
		
		System.out.print("Enter the first number: ");
		firstNumber = scanner.nextDouble();
		
		System.out.print("Enter the second number: ");
		secondNumber = scanner.nextDouble();
		
		System.out.print("Enter the third number: ");
		thirdNumber = scanner.nextDouble();
		
		utility.operationOnDoublePrecedence(firstNumber, secondNumber, thirdNumber);
		
		scanner.close();
		
	}

}
