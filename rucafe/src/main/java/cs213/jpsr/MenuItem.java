/**
 * A class defining the Menu Items of the store.
 * This class helps defining the basic functions which are
 * further populated in their respective extended classes.
 *
 * @author Swarnendu Roy
 * @author James Prial
 */

public abstract class MenuItem {
	private double price;

	public MenuItem(){
		this.price = 0;
	}

	public MenuItem(double price){
		this.price = price;
	}
	
	/**
	 * A public method that helps calculation
	 * of the item price
	 *
	 * @return the price of the items in the order.
	 */


	public double getPrice() {
		return this.price;
	}

	protected void setPrice(double price){
		this.price = price;
	}

	/**
	 * An abstract method that helps making a copy
	 * of an item on the menu.
	 *
	 * @return copy of a MenuItem object
	 */

	public abstract MenuItem copy();

	
}
