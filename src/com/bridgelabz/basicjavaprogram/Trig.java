/***************************************************************************************
 *  
 *  Purpose: Performing various trignometric function.
 *
 *  @author  rahul
 *  @version 1.0
 *  @since   12-08-2019
 *
 **************************************************************************************/

package com.bridgelabz.basicjavaprogram;

import java.util.Scanner;

import com.bridgelabz.utility.Utils;

public class Trig {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Utils utility = new Utils();
		
		float degree;
		
		System.out.print("Enter the angle in degree:- ");
		degree = scanner.nextFloat();
		
		utility.trigoFunction(degree);
		
		scanner.close();
		
		
	}

}
