/* Author: Ishaan Virani */
import java.util.ArrayList;

import javax.lang.model.util.ElementScanner6;


/****************************************************************
 * ShoppingList.java
 *
 * A class that models a set of  Item objects.  A shopping cart has 
 * an ArrayList of items.
 *          
 ****************************************************************/
 
 
public class ShopList
{
	// instance field
	 private ArrayList<Item> cart;

	/**
	 * Constructs an empty shopping list
	 */
  public ShopList()
  {
    cart = new ArrayList<Item>();
  }
	
	/**
	 * emptyCart removes all contents from the list
	 */
	public void emptyCart()
  {
    cart.clear();
  }
	
	/**
	 * addItem adds a specified item to the cart
	 * @param purchase the item being added
	 */
  public void addItem(Item purchase)
  {
    cart.add(purchase);
  }
	
	/**
	 * toString provides a String version of the shopping cart with
	 * each item on a separate line
	 * @return the String version of the cart
	 */
	public String toString()
  {
    String fullList = "";
    for(int i = 0; i < cart.size(); i++)
    {
      fullList = fullList + cart.get(i).getName() + "\n";
    }
    return fullList;
  }
	
	/**
	 * countItem returns the quantity of a specified item.
	 * If the item is not in the list, returns 0.
	 * @param purchase the item to count
	 * @return the quantity of that item or 0.
	 */
	public int countItem(Item purchase)
  {
    if (cart.contains(purchase))
    {
      return cart.get(cart.indexOf(purchase)).getQuantity();
    }
    else
    {
      return 0;
    }
  }
	
	/** 
	 * removeItem removes a specified item from the cart if it exists, and returns true.
	 * If the item does not exist in the cart, returns false.
	 * @param purchase the item to search for and remove
	 * @return whether the item was removed
	 */
		public boolean removeItem(Item purchase)
  {
    if (cart.contains(purchase))
    {
      cart.remove(cart.indexOf(purchase));
      return true;
    }
    else
    {
      return false;
    }
  }
	
	/**
	 * getTotalCost returns the total cost of all items and quantities 
	 * in the cart.
	 * @return the cost of all items.
	 */
	public double getTotalCost()
  {
    double cartTotal = 0.0;
    for(int i = 0; i < cart.size(); i++)
    {
      cartTotal += (cart.get(i).getQuantity() * (cart.get(i)).getPrice());
    }
    return cartTotal;
  }
}
	
	
	
	
	
    