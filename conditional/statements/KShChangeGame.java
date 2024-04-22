package conditional.statements;

import java.util.Scanner;

/*
 * The objective of this game is to enter enough change to equal exactly 100 Kenyan shillings! 
 * Create a program that allows a user to enter the quantities for the following coins: 
 * 1-shilling coins, 5-shilling coins, 10-shilling coins, and 20-shilling coins. 
 * Your program should count up the value of all the change.
 * If it's exactly 100 shillings, they win! If it's more than 100 shillings, tell them by how 
 * much they went over. If it is less than 100 shillings, tell them by how much they went under.
 */

public class KShChangeGame {

	public static void main(String[] args) {
		//Get the inputs from the user
		System.out.println("How many 1-shilling coins are you inserting?");
		Scanner scanner = new Scanner(System.in);
		double _1ShillingCoins = scanner.nextDouble();
		
		System.out.println("How many 5-shilling coins are you inserting?");
		double _5ShillingCoins = scanner.nextDouble();
		
		System.out.println("How many 10-shilling coins are you inserting?");
		double _10ShillingCoins = scanner.nextDouble();
		
		System.out.println("How many 20-shilling coins are you inserting?");
		double _20ShillingCoins = scanner.nextDouble();		
		
		scanner.close();
		
		//Calculate the total amount from the change
		double requiredChange = 100;
		double userTotalChange = (1 * _1ShillingCoins) + (5 * _5ShillingCoins) + (10 * _10ShillingCoins) + (20 * _20ShillingCoins);
		double amountChangeisLess = requiredChange - userTotalChange; 
		double amountChangeisMore = userTotalChange - requiredChange;
		
		//Inform them whether they have won, or by how much more or less they need to add/remove to win
		if (userTotalChange == requiredChange) {
			System.out.println("You win!");
		}
		else if (userTotalChange < requiredChange) {
			System.out.println("Your change is less by " +amountChangeisLess +"shillings");
		}
		else {
			System.out.println("Your change is more by " +amountChangeisMore +"shillings");
		}
	}

}
