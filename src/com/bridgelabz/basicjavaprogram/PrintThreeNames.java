/******************************************************************************
 *  
 *  Purpose: Print reverse Names.
 *
 *  @author  rahul
 *  @version 1.0
 *  @since   06-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.utility.Utils;

public class PrintThreeNames {

	public static void main(String[] args) {
		
		Utils utility = new Utils();
		
		System.out.print("Hi "+utility.reverseName(args));
		
		
	}

}
