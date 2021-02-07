/*Jake Coombes
 * 
 */


import java.util.*;
import java.io.*;

public class lab5Conversion {

	public static void main(String[] args) {
		
		try {
			//create an instance of the text scanner
			File input = new File("input.txt");
			Scanner in = new Scanner(input);
			//create an instance of the text writer
			PrintWriter output = new PrintWriter("output.txt");
					
			//declare variables
			double giftCardBalance;
			String itemName;
			int quantity; 
			double price;
			double cost;
			
			//Create a new instances of the "Item" class
			Item item1 = new Item();
			Item item2 = new Item();
			Item item3 = new Item();
			
			//start the shopping list
			output.println("\n\nSHOP RECEIPT\n");
			//get gift card balance
			giftCardBalance = in.nextDouble();
			in.nextLine();
			
			//get item 1 info
			itemName = in.nextLine();
			item1.setItemName(itemName);
			quantity = in.nextInt();
			item1.setItemQuantity(quantity);
			price = in.nextDouble();
			item1.setItemPrice(price);
			in.nextLine();
					
			//get item 2 info
			itemName = in.nextLine();
			item2.setItemName(itemName);
			quantity = in.nextInt();
			item2.setItemQuantity(quantity);
			price = in.nextDouble();
			item2.setItemPrice(price);
			in.nextLine();
			
			//get item 3 info
			itemName = in.nextLine();
			item3.setItemName(itemName);
			quantity = in.nextInt();
			item3.setItemQuantity(quantity);
			price = in.nextDouble();
			item3.setItemPrice(price);

			output.println("****************************************\n");
			
			
			//Print the value of item1's itemName
			output.println("First Item: " + item1.getItemName());		
			output.println("\t" + item1.getItemQuantity() + " @ " + item1.getItemPrice() + " each");
			
			//Print the value of item2's itemName
			output.println("Second Item: " + item2.getItemName());		
			output.println("\t" + item2.getItemQuantity() + " @ " + item2.getItemPrice() + " each");
					
			//Print the value of item3's itemName
			output.println("Third Item: " + item3.getItemName());		
			output.println("\t" + item3.getItemQuantity() + " @ " + item3.getItemPrice() + " each");
			
			output.println("\n****************************************\n");
			
			//calculate and print the total cost
			cost = ( item1.getItemQuantity() * item1.getItemPrice() ) + ( item2.getItemQuantity() * item2.getItemPrice() ) + ( item3.getItemQuantity() * item3.getItemPrice() );
			output.println("The total cost is $"+String.format("%.2f", cost));
			
			if(cost>giftCardBalance)
				output.println("You Owe $"+String.format("%.2f", cost - giftCardBalance));
			else
				output.print("Your card has a remaining balance of $"+String.format("%.2f", giftCardBalance - cost));
			
			//close scanners and readers
			in.close();
			output.close();		
		}
		catch(FileNotFoundException e) {
			System.err.println("No File Exists");
		}
		
		
		
	}

}
