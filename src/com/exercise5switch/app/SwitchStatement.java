package com.exercise5switch.app;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		int nMonth = 0;
		char answer = 'y';
		
		Scanner input = new Scanner(System.in);
		
		do  {
			System.out.println("Enter a month number: ");
			nMonth = input.nextInt();
			
			switch (nMonth) {
				case 1: System.out.println("January");
				break;
				case 2: System.out.println("February");
				break;
				case 3: System.out.println("March");
				break;
				case 4: System.out.println("April");
				break;
				case 5: System.out.println("May");
				break;
				case 6: System.out.println("June");
				break;
				case 7: System.out.println("July");
				break;
				case 8: System.out.println("August");
				break;
				case 9: System.out.println("September");
				break;
				case 10: System.out.println("October");
				break;
				case 11: System.out.println("November");
				break;
				case 12: System.out.println("December");
				break;
				default:
					System.out.println("You have not enter a valid month number!");
					nMonth = -1;
			}
			
			System.out.println("Do you wish to enter another month? (y/n)");
			answer = input.next().charAt(0);
			
		}	while(answer =='y');
	}
}
