/******************************************************************************
 *  
 *  Purpose: To find the roots of the Quadratic equation 
 *
 *  @author  rahul
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.basicjavaprogram;

import java.util.Scanner;

import com.bridgelabz.utility.Utils;

public class Quadratic {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Utils utility = new Utils();
		
		int a,b,c;
		
		System.out.print("Enter the value of 'A' of the quadratic equation:- ");
		a = scanner.nextInt();
		System.out.print("Enter the value of 'B' of the quadratic equation:- ");
		b = scanner.nextInt();
		System.out.print("Enter the value of 'C' of the quadratic equation:- ");
		c = scanner.nextInt();
		
		utility.rootsOfQuadraticEquation(a, b, c);
		
		scanner.close();
		
	}

}
