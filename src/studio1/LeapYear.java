package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = in.nextInt();
		
		
		int rmd1 = year % 4;
		int rmd2 = year % 100;
		int rmd3 = year % 400;
		
		boolean leapYear = ((rmd1 == 0) && (rmd2 != 0)) || rmd3 == 0;
		System.out.println(year + " is a leap year: " + leapYear);

	}

}
