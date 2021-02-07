/* Student Name: Jake Coombes
 * Date:10/16/18
 * Lab 5: 
 * 		a class that stores an items name, its value, and quantity
 * 		
 */

public class Item {
	//Private Data (These are the variables of the Item class)
	//Note: Because these are private, they cannot be accessed directly by other classes!
	private String itemName;
	private int itemQuantity;
	private double itemPrice;
	
	//Constructor
	//This sets the default values
	public Item(){
		itemName = "";
		itemQuantity = 0;
		itemPrice = 0.00;
		System.out.println("A new item instance was created!");
	}
	
	//Public Methods
	//These are what we use to access the private data variables
	//"Setters" are used to set the value of a variable
	//"Getters" are used to retrieve the value of a variable
	
	public void setItemName(String item){
			itemName = item;
	}
	
	public String getItemName(){
		return itemName;
	}
	
	public void setItemQuantity(int quantity){
		if (quantity > 0)
			itemQuantity = quantity;
		else{
			System.out.println("The quantity was invalid. The value of 'itemQuantity' was not set.\nQuantity must be greater than 0.\nRestart the program and try again.");
			System.exit(0);
		}
	}
	
	public double getItemQuantity(){
		return itemQuantity;
	}

	public void setItemPrice(double price){
		if (price > 0.0)
			itemPrice = price;
		else{
			System.out.println("The price was invalid. The value of 'itemPrice' was not set.\nPrice must be greater than 0.00.\nRestart the program and try again.");
			System.exit(0);
		}	
	}
	
	public double getItemPrice(){
		return itemPrice;
	}
}