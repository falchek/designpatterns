package observer.vultures;

public class Mike implements VultureObserver{
	
	private int benchPress;
	
	public Mike() {
		benchPress = 300;
	}
	
	public void displayBenchPress() {
		System.out.println("Mike's bench rises to " + benchPress +"!!");
	}
	
	public void update(Food food){
		consumeOrDiscardFood(food);
		displayBenchPress();
	}
	
	public void consumeOrDiscardFood(Food food){
		switch(food){
			case PIZZA:
				System.out.println("Mike scrapes the cheese and pepperoni off the pizza, and eats it!");
				benchPress++;
				break;
			case SANDWICH:
				System.out.println("Mike peels the bread off the sandwich, and eats it!");
				benchPress++;
				break;
			case SALAD:
				System.out.println("Mike looks at the salad quizzically before discarding it.");
				break;
			case MEXICAN:
				System.out.println("Mike scrapes the chees and pepperoni off the pizza, and eats it!");
				benchPress += 15;
				break;
			case COOKIES:
				System.out.println("Mike can't eat cookies. :( :( :(");  
				benchPress++;
				break;
			default:
				System.out.println("Shouldn't get here");
				break;  
		}
	}
	
}
