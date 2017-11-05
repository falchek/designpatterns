package observer.vultures;

public class Ryan implements VultureObserver{

	private int benchPress;
	
	public Ryan() {
		this.benchPress = 100; 
	}
	
	public void displayBenchPress() {
		System.out.println("Ryan's bench is still " + benchPress +".  He says something dismissive about it not being a functional movement.");
	}
	
	public void update(Food food){
		consumeOrDiscardFood(food);
		displayBenchPress();
	}
	
	public void consumeOrDiscardFood(Food food){
		switch(food){
			case PIZZA:
				System.out.println("Ryan sheds a single tear for the abuse cows suffered to make this pizza!");
				break;
			case SANDWICH:
				System.out.println("Ryan goes on about how the turkey in the sandwich has a high water cost!");
				break;
			case SALAD:
				System.out.println("Ryan starts to eat the salad, but realizes the ranch dressing is non-vegan.");
				break;
			case MEXICAN:
				System.out.println("Ryan can't eat Mexican.  He starts talking about Ayn Rand instead.");
				break;
			case COOKIES:
				System.out.println("Ryan can't eat cookies.  He sighs wistfully");  
				benchPress++;
				break;
			default:
				System.out.println("Shouldn't get here");
				break;  
		}
	}
}
