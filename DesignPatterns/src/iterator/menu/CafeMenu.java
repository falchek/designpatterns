package iterator.menu;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu extends MenuComponent{
	Hashtable menuItems = new Hashtable(); 
	
	public CafeMenu() {
		addItem("Veggie burger and air fries",
				"MAX, WHAT IS THIS?",
				true, 3.99);
		addItem("Fat Burg",
				"MAAAAAXXXX, WHAT IS THISSSSSS",
				true, 5.99);
		
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.name, menuItem);
	}
	
	public Hashtable getItems() {
		return menuItems;  
	}
	
	public Iterator createIterator() {
		return menuItems.values().iterator();
	}
}
