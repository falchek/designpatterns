package factory.simple.pizza;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>(); 

	public void prepare() {
		System.out.println("Preparing " + name + " pizzaaaaaaa");
		System.out.println("Tossing "+ dough +" dough...");
		System.out.println("Adding " + sauce + " sauce...");
		System.out.println("Adding toppings: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("  " +toppings.get(i));
		}
	}
	
	public void bake(){
		System.out.println("Bake for 25 minutes at 350.");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices.");
	}
	
	public void box() {
		System.out.println("Throwing pizza sloppily into box");
	}
	
	public String getName(){
		return name;
	}
}
