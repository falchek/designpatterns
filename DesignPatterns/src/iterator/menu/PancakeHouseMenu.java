package iterator.menu;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu extends MenuComponent{
	ArrayList menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList(); 
		
		addItem("Regular Pancake Breakfast",
				"Pancakes with fried eggs, sausage",
				false, 
				2.99);
		
		addItem("Really bad Pancake Breakfast",
				"Pancakes with fried eggs, sausage made from vegan substitutes",
				true, 
				12.99);
		
		addItem("Giant Pancake Breakfast",
				"So many Pancakes with a dozen fried eggs, and 4 pounds of sausage",
				false, 
				22.99);
		
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public Iterator createIterator() {
		return menuItems.iterator();
	}
}
