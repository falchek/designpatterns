package iterator.menu;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {

	MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	
	public void printMenu(){
		allMenus.print(); 
	}
	
	/*public void printMenu(){
		Iterator menuIterator = menus.iterator();
		while(menuIterator.hasNext()) {
			Menu menu = (Menu)menuIterator.next();
			printMenu(menu.createIterator());
		}
		/*Iterator menuIterator = menus.iterator();
		
		System.out.println("MENU\n-------");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);
		System.out.println("\nDINNER");
		printMenu(cafeIterator);
		
	}
	
	public void printMenu(Iterator iterator){
		while(iterator.hasNext()){
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.name + " || ");
			System.out.print(menuItem.price + " || ");
			System.out.println(menuItem.description);
		}
	}*/
}
