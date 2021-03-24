/* Author: Ishaan Virani */
/* Add javadocs!!!!    */
/** 2021 **/
public class Item 
{
    private String name;
    private double price;
    private int quantity;

	/*
  *creates an overloaded constrcutor that receives an item name, item price, and item quantity
  */
    public Item (String itemName, double itemPrice, int numPurchased)
    {
	 	   name = itemName;
		   price = itemPrice;
		   quantity = numPurchased;
    }

	/*
  *creates an overloaded constrcutor that receives only a name
  */
    public Item ( String itemName)
    {
      name = itemName;
    }

	/*
  *gets the price of the given item
  *@return the price of item
  */
    public double getPrice()
    {
		   return price;
    }

 	/*
  *gets the name of the given item
  *@return the name of item
  */   
    public String getName()
    {
		   return name;
    }

  /*
  *gets the quantity of the given item
  *@return the quantity of item
  */
    public int getQuantity()
    {
		   return quantity;
    }
    
     //incomplete methods

  /*
  *provides the proper format of the item values as a string
  *@return the Item attributes as a string
  */
      public String toString()
      {
        String name = getName();
        double price = getPrice();
        int quantity = getQuantity();
        double totalPrice = ((double)quantity) * price;
        return name + " $" + price + " " + quantity + " $" + totalPrice;
      }

  /*
  *compares the name of the 2 items provided
  *@return a boolean expression (true or false) depending on wether the names are the same or are different
  */
      public boolean equals(Object o)
      {
        Item comparison = (Item) o;
        return this.name.equals(comparison.name);
      }

  /*
  *Compares the name of the 2 items provided and returns an integer
  *@return 0 if the names are the same or -1 if the name is different than another item
  */
      public int compareTo (Object o)
      {
      	Item comparison = (Item) o;
        return this.name.compareTo(comparison.name);
      }
     
      
}  
