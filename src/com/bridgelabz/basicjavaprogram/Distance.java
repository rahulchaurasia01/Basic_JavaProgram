/******************************************************************************
 *  
 *  Purpose: To find the Euclidean Distance
 *
 *  @author  rahul
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.utility.Utils;

public class Distance {

	public static void main(String[] args) {
		
		Utils utility = new Utils();
		
		int x, y;
		
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		
		double result = utility.euclideanDistance(x, y);
		
		System.out.println(result);
		
	}

}
