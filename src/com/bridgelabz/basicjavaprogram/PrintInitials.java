/******************************************************************************
 *  
 *  Purpose: Pattern of the Initial Letters.   INCOMPLETE

 *
 *  @author  rahul
 *  @version 1.0
 *  @since   06-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.utility.Utils;

public class PrintInitials {

	public static void main(String[] args) {
		
		String initials = "KDW";
		
		int n = initials.length();
		
		Utils utility = new Utils();
		
		char a;
		
		for(int i=0;i<n;i++)
		{
			a = initials.charAt(i);
			
			if(a=='K')
			{
				utility.kPattern();
			}
			else if(a=='D')
			{
				utility.dPattern();
			}
			
			System.out.println("  ");
		}
		
	}

}
