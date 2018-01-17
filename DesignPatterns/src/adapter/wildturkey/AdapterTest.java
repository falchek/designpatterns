package adapter.wildturkey;

public class AdapterTest {

	public static void main(String args[]){
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey(); 
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("Testing Duck");
		testDuck(duck);
		
		System.out.println("Testing Turkey!");
		testDuck(turkeyAdapter);
		
	}
	
	public static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}

}
