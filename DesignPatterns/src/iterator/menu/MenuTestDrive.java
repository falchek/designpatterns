package iterator.menu;

import java.util.ArrayList;

public class MenuTestDrive {

	public static void main(String args[]) {
		//WITH Composites:
		
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "That lunch tho");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "It's a cafeeeeee");
		MenuComponent dessertMenu = new Menu("PANCAKE HOUSE MENU", "dat dessert tho");

		MenuComponent allMenus = new Menu("ALL MENUS", "All combined menus");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(cafeMenu);
		allMenus.add(dessertMenu);
		
		//pancake house menu items.:
		pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast",
				"Pancakes with fried eggs, sausage",
				false, 
				2.99));
		
		pancakeHouseMenu.add(new MenuItem("Really bad Pancake Breakfast",
				"Pancakes with fried eggs, sausage made from vegan substitutes",
				true, 
				12.99));
		
		pancakeHouseMenu.add(new MenuItem("Giant Pancake Breakfast",
				"So many Pancakes with a dozen fried eggs, and 4 pounds of sausage",
				false, 
				22.99));
		
		//Diner items;
		dinerMenu.add(new MenuItem("Vegetarian BLT",
				"Fake bacon with the food our food eats.  I think this is a tomato.", 
				true, 
				2.99));
		
		dinerMenu.add(new MenuItem("BLT",
				"bacon with the food our food eats.  a tomato.  how quaint", 
				true, 
				5.99));
		
		dinerMenu.add(new MenuItem("A fat burg",
				"You can tell this book was written 12 years ago, since they think a sandwich costs $3.", 
				true, 
				20.99));
		
		//cafe menu:
		
		cafeMenu.add(new MenuItem("Veggie burger and air fries",
				"MAX, WHAT IS THIS?",
				true, 3.99));
		cafeMenu.add(new MenuItem("Fat Burg",
				"MAAAAAXXXX, WHAT IS THISSSSSS",
				true, 5.99));
		
		//dessert menu:
		dinerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("pudding", "i'm so sick of design patterns", true, 100.12));
		dessertMenu.add(new MenuItem("pie", "ughhh I'm tired", true, 10.12));
		
		Waitress waitress = new Waitress(allMenus);
		
		waitress.printMenu();
		
		
		//Old way:
		/*Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		Menu cafeMenu = new CafeMenu();
		*/
		/*
		ArrayList menus = new ArrayList();
		menus.add(new PancakeHouseMenu());
		menus.add(new DinerMenu());
		menus.add(new CafeMenu());
		
		Waitress waitress = new Waitress(menus);
		
		waitress.printMenu();*/
	}
}

/* public interface Iterator {
boolean hasNext();
Object next(); 
} */

//This example is goofy and went from using our own custom iterator to just extending the java.util.iterator example