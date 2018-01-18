package iterator.menu;

import java.util.Iterator;

public class DinerMenu extends MenuComponent {

	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems; 
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("Vegetarian BLT",
				"Fake bacon with the food our food eats.  I think this is a tomato.", 
				true, 
				2.99);
		
		addItem("BLT",
				"bacon with the food our food eats.  a tomato.  how quaint", 
				true, 
				5.99);
		
		addItem("A fat burg",
				"You can tell this book was written 12 years ago, since they think a sandwich costs $3.", 
				true, 
				20.99);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_ITEMS){
			System.err.println("Menu is full.");
		} else{
			menuItems[numberOfItems] =  menuItem;
			numberOfItems = numberOfItems + 1; 
		}
	}
	
	public Iterator getMenuItems() {
		return new DinerMenuIterator(menuItems);
	}
	
	public DinerMenuIterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
	
}
