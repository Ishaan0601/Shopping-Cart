import java.util.Scanner;
//## missing @param
//### incorrect toString format in Item

import javax.lang.model.util.ElementScanner6;
public class Main 
{
  /** declare a class variable to reference the ShoppingCart.  This will allow all methods to share the object.
	 */
	 
	 
	/**
	 * main Displays the user interface menu and calls the dispatch method until
	 * the user enters choice 0 to end their shopping session.
	 * @param args not used
	 */
  public static void main(String[] args) 
  {
    ShopList myCart;
    // instantiate a ShoppingCart object called myCart (declared above, so don't re-declare.
     
    	myCart = new ShopList();
    	
    	// Prepare/display menu
    	Scanner in = new Scanner(System.in);
		int choice;
		do   // loop until choice is 0
		{
			printMenu();
			choice = in.nextInt();
			in.nextLine(); // clears the buffer
			if (choice != 0)
			{
				dispatch(choice, myCart); // process their choice
			}
		
    	}
    	while(choice != 0);
		System.out.println("Thanks for shopping with PESH!");
  }
  /**
	 * dispatch receives the user entered menu choice, and the ShoppingCart.
	 * The users menu options are processed using a switch statement.
	 * @param choice the user's menu entry
	 * @param basket the shopping cart
	 */
    public static void dispatch(int choice, ShopList basket)
    {
    	// declare local variables for the item name, price and quantity
    	String name;
      int quantity;
      double price;
    	
      Scanner input = new Scanner(System.in);  //Not a class variable, so must declare again.
      switch(choice)
      {
        // Start shopping
          case 1:
            basket.emptyCart();
            break;
        // Add an item to the cart
          case 2:
            System.out.println("Name: ");
            name = input.next();
            System.out.println("Price: ");
            price = input.nextDouble();
            System.out.println("Quantity: ");
            quantity = input.nextInt();
            Item purchase = new Item(name, price, quantity);
            basket.addItem(purchase);
            break;
        // Find an item in the cart by name
          case 3:
            System.out.println("Name of Product of Interest: ");
            name = input.next();
            Item interest = new Item(name);
            System.out.println("You have " + basket.countItem(interest) + " " + name + "(s) in your cart");
            break;
        // Print the cart contents
          case 4:
            System.out.println(basket.toString());
            break;
        // Remove an item from the cart
        case 5: 
          System.out.println("Name of Item wanted to be Removed: ");
          name = input.next();
          Item deleted = new Item(name);
          if (basket.removeItem(deleted) == true)
          {
            System.out.println(name + " was removed successfully!");
          }
          else
          {
            System.out.println("You have no " + name + " to remove");
          }
          break;
        // Check out
        case 6: 
          System.out.print("The total cost of your purchase before tax is $"); 
          System.out.printf(" $%.2f", basket.getTotalCost());
          basket.emptyCart();
          break;
          default:
          System.out.println("Sorry, invalid choice");
	    }
    }


    /**
     * Prints the menu of user options and prompts for a selection
     */
    public static void printMenu()
    {

      System.out.println("\n   Menu   ");
      System.out.println("   ====");
      System.out.println("0: Quit");
      System.out.println("1: Start Shopping");
      System.out.println("2: Add an item to the cart");
      System.out.println("3: Find an item in the cart by name");
      System.out.println("4: Print the cart contents");
      System.out.println("5: Remove an item from the cart");
      System.out.println("6: Check out");
      System.out.print("\nEnter your choice: ");
    }

}