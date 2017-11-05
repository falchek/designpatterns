package observer.vultures;

public class Tommy implements VultureObserver{
	
private int benchPress;
	
	public Tommy() {
		benchPress = 245;
	}
	
	public void displayBenchPress() {
		System.out.println("Tommy's bench rises to " + benchPress +"!!");
	}
	
	public void update(Food food){
		consumeOrDiscardFood(food);
		displayBenchPress();
	}
	
	public void consumeOrDiscardFood(Food food){
		System.out.println("Tommy eats everything and gets jacked."); 
		benchPress += 5;
	}

}
