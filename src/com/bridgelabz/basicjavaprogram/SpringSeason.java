/******************************************************************************
 *  
 *  Purpose: To check whether it is Spring Season

 *
 *  @author  rahul
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.utility.Utils;

public class SpringSeason {

	public static void main(String[] args) {
		
		Utils utility = new Utils();
		
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		
		if(utility.checkSpringSeason(month, day))
			System.out.println("True");
		else
			System.out.println("False");
		
	}

}
