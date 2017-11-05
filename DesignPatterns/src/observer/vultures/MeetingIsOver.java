package observer.vultures;

public class MeetingIsOver {
	
	public static void main (String[] args){
		Meeting meeting = new Meeting(); 
	
		Mike mike = new Mike();
		Ryan ryan = new Ryan();
		Tommy tommy = new Tommy();  
	
		meeting.registerObserver(mike);
		meeting.registerObserver(tommy);
		meeting.registerObserver(ryan);
		
		
		meeting.setFood(Food.PIZZA);
		System.out.println();
		meeting.setFood(Food.COOKIES);
		System.out.println();
		meeting.setFood(Food.MEXICAN);
		System.out.println();
		meeting.setFood(Food.SALAD);
		System.out.println();
		meeting.setFood(Food.SANDWICH);
		
		
		
	}
}
