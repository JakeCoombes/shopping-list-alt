/* Student Name:Jake Coombes
 * Date:10/16/18
 * Lab 5:
 * 		create a shopping list using the item class
 */

import java.util.*;
import javax.swing.*;

public class Receipt {

	//Main function (This is where your program starts!)
	public static void main(String[] args) {
		
		/* *******************************************************
		 * Develop your code under this comment
		 ********************************************************
		 * Be sure to look at the "Item" class to understand the
		 * variables and methods in it.
		 * *******************************************************/
		
		double giftCardBalance;
		String itemName;
		int quantity; 
		double price;
		double cost;
		
		//Create a new instances of the "Item" class
		Item item1 = new Item();
		Item item2 = new Item();
		Item item3 = new Item();
		Scanner input = new Scanner(System.in);
		
		//start the shopping list
		System.out.println("\n\nSHOP RECEIPT\n");
		//get gift card balance
		System.out.print("Gift card balance:\n$");
		giftCardBalance = input.nextDouble();
		input.nextLine();
		System.out.println("\n****************************************\n");
		
		//get item 1 info
		System.out.println("Item 1 Name:");
		itemName = input.nextLine();
		item1.setItemName(itemName);
		System.out.println("Quantity:");
		quantity = input.nextInt();
		item1.setItemQuantity(quantity);
		System.out.print("Price:\n$");
		price = input.nextDouble();
		item1.setItemPrice(price);
		input.nextLine();
		System.out.println("\n");
				
		//get item 2 info
		System.out.println("Item 2 Name:");
		itemName = input.nextLine();
		item2.setItemName(itemName);
		System.out.println("Quantity:");
		quantity = input.nextInt();
		item2.setItemQuantity(quantity);
		System.out.print("Price:\n$");
		price = input.nextDouble();
		item2.setItemPrice(price);
		input.nextLine();
		System.out.println("\n");
		
		//get item 3 info
		System.out.println("Item 3 Name:");
		itemName = input.nextLine();
		item3.setItemName(itemName);
		System.out.println("Quantity:");
		quantity = input.nextInt();
		item3.setItemQuantity(quantity);
		System.out.print("Price:\n$");
		price = input.nextDouble();
		item3.setItemPrice(price);
		input.nextLine();

		System.out.println("\n****************************************\n");
		
		
		//Print the value of item1's itemName
		System.out.println("First Item: " + item1.getItemName());		
		System.out.println("\t" + item1.getItemQuantity() + " @ " + item1.getItemPrice() + " each");
		
		//Print the value of item2's itemName
		System.out.println("First Item: " + item2.getItemName());		
		System.out.println("\t" + item2.getItemQuantity() + " @ " + item2.getItemPrice() + " each");
				
		//Print the value of item3's itemName
		System.out.println("First Item: " + item3.getItemName());		
		System.out.println("\t" + item3.getItemQuantity() + " @ " + item3.getItemPrice() + " each");
		
		System.out.println("\n****************************************\n");
		
		//calculate and print the total cost
		cost = ( item1.getItemQuantity() * item1.getItemPrice() ) + ( item2.getItemQuantity() * item2.getItemPrice() ) + ( item3.getItemQuantity() * item3.getItemPrice() );
		System.out.println("The total cost is $"+String.format("%.2f", cost));
		//System.out.println("The total cost is $" + cost);		
		//print if they owe extra money or have remaining money on their card
		//System.out.println(“Some text ”+String.format("%.2f", totalCost);
		//System.out.println(“... ”+String.format("%.2f", giftCardBalance);
		
		if(cost>giftCardBalance)
			System.out.println("You Owe $"+String.format("%.2f", cost - giftCardBalance));
			//System.out.printf("You owe $%.2f", (cost - giftCardBalance));
		else
			System.out.print("Your card has a remaining balance of $"+String.format("%.2f", giftCardBalance - cost));
		input.close();
	}
}