/******************************************************************************
 *  
 *  Purpose: Precedence on Integer
 *
 *  @author  rahul
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.basicjavaprogram;

import java.util.Scanner;

import com.bridgelabz.utility.Utils;

public class IntOpt {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Utils utility = new Utils();
		
		int firstNumber, secondNumber, thirdNumber;
		
		System.out.print("Enter the first number: ");
		firstNumber = scanner.nextInt();
		
		System.out.print("Enter the second number: ");
		secondNumber = scanner.nextInt();
		
		System.out.print("Enter the third number: ");
		thirdNumber = scanner.nextInt();
		
		utility.operationOnIntPrecedence(firstNumber, secondNumber, thirdNumber);
		
		scanner.close();
		
	}

}
