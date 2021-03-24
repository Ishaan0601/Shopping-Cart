AP Computer Science
Unit 7 Lab  2 - ArrayList
A Shopping Cart Using the ArrayList Class
Files : 
•	Item.java contains the incomplete definition of a class that models an item one would purchase. An item has a name, price, and quantity (the quantity purchased). 
•	ShoppingList.java is the incomplete definition of a class that models a set of  Item objects.  A shopping cart has an ArrayList of items.
•	Shop.java is an incomplete program that models shopping using a menu.


Complete Item.java as follows:
•	Add a toString method so that when an Item is printed, the name, price, quantity and total price are displayed (note that the dollar items should have a dollar sign in front, but no number formatting yet):
          soup     $1.20    35  $42.37
•	Add an equals method that compares items based on their name.  Two items should be considered equal if they have the same name.
•	Add an additional constructor that ONLY receives an item name as a parameter.  This constructor will be used when you need to search for an item in the ArrayList by its name only, and the other fields do not matter. This constructor, along with the equals method will allow you to use the ArrayList indexOf and contains.
•	PROVIDE JAVADOCS for this class and all methods of this class!
•	Add a compareTo method that compares on the name.
•	Remember:  The equals & compareTo methods must receive an Object data type and cast it to be an Item before any comparison is done.


Complete ShoppingList.java as follows:
•	Add the instance field.  There is only one instance field – an ArrayList of Item objects called cart.  It is NOT instantiated until the constructor.
•	Follow the javadoc instructions to add the following methods: NOTE: Add the first three, test them, then add some more.  Please DON’T ADD ALL METHODS WITHOUT COMPILING AND TESTING.
o	Constructor – no parameters: instantiates the cart
o	addItem: adds an item to the cart (ask for name, price and quantity)
o	toString: returns each item on a separate line
o	emptyCart: removes all elements from the cart
o	countItem: returns the quantity of a specified item, or zero if it isn’t in the cart.  Use the ArrayList indexOf method when implementing this method.  Assume there is at most 1 object for each Item, so you just have to find it and return its quantity.
o	removeItem: removes an item from the cart and returns true if it exists, or returns false if it doesn’t exist.  Either use indexOf, or remember that the ArrayList remove method returns a boolean.
o	getTotalCost: returns the total cost of everything in the cart (price * quantity for each item in your list)
 
Complete Shop.java as follows: TIP: Start with options 1,2 and 4, test, then add the remaining/test one at a time, test.
•	Declare a ShoppingList object in the main method.
•	The dispatch method serves as the user interface.  This method will prompt the user to enter data about the item.  Declare local variables to store the entered name, price and quantity of items.  All printing occurs in the dispatch method, and not in the ShoppingList class!
•	Menu option 1 (Start Shopping):  The user can use the menu option to start their shopping session over at any time, or begin another one after checkout.  This case should empty the cart of all contents.  Use the emptyCart method.
•	Menu option 2 (Add an item to the cart):  Prompt the user for the name, price and quantity of the item to add. Construct an Item object with the information just read in. Add it to the shopping cart using the add method of the ShoppingList.
•	Menu option 3 (Find an item in the cart by name):  This option will prompt the user for the name only of the product to find, not the price or quantity.  Use the countItem method of ShoppingList.  Display how many of this item are in the cart.  (EX:  “You have 4 soup (s) in your cart”  OR “You have 0 soup(s) in your cart”).
•	Menu option 4 (Print the cart contents): This case should simply print the ShoppingList identifier.  This will call the toString of the ShoppingList class to display the cart. Each item will print on its own line.
•	Menu option 5 (Remove an item from the cart):  Prompt the user for the name only of the product to remove.  Call the removeItem method.  You will print a message whether the item was deleted or not.  (EX:  “soup has been removed from your cart”  OR  “You have no soup to remove”)
•	Menu option 6 (Check out):  Call the getTotalCost method to get the total cost of all items in the cart. Print a message. (Ex:  The total cost of your purchase before tax is $26.75).  Use printf  to format the output.  The user is finished shopping at this point, so the ArrayList should be emptied.


BONUS:
•	The lab assumes that the user will enter each item only once, and include a quantity that they are purchasing.  If they enter an item a second time, the searching algorithms will not find it.  Modify the addItem method so that if the item is already in the list (matched by name), you will not add it a second time.  You WILL, however, increase the quantity by the new quantity entered by the user.  Example:  If the user purchases two units of toothpaste, and later adds another 3 units of toothpaste, there should be one ArrayList element for toothpaste with a quantity of 5.  If the existing price and new price are different, prompt the user for the correct price.
•	Format the display of the shopping cart items so that long and short item names will still result in even columns and the dollar amounts are formatted with two decimals at all times (the dollar sign should already be included).
