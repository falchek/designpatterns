package abstractmethod.coffee;

public class Tea extends CaffeineBeverage{

	@Override
	void brew() {
		System.out.println("Put the bag of earl grey in the water");
		
	}

	@Override
	void addCondiments() {
		System.out.println("Add lemonssss!");		
	}

	
}
