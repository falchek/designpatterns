package iterator.menu;

public class MenuItem extends MenuComponent{

	public String name;
	public String description; 
	public boolean vegetarian; 
	public double price;
	
	public MenuItem(String name, String description, boolean vegetarian, double price){
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price; 
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}

	public double getPrice(){
		return this.price; 
	}
	
	public boolean isVegetarian() {
		return this.vegetarian;
	}
	
	public void print() {
		System.out.print("  " + getName());
		if(isVegetarian())
			System.out.print("[Not Actually Food] ");
		System.out.println(", " + getPrice());
		System.out.println(getDescription());
	}
	
}
