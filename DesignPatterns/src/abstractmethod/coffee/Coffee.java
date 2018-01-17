package abstractmethod.coffee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage{

	@Override
	void brew() {
		System.out.println("Grind those beans!");
		System.out.println("Put them into the little weird strainer paper bag thing");
		
	}

	@Override
	void addCondiments() {
		System.out.println("Add milk and sugar!");
		
	}
	
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		}
		else 
			return false; 
	}
	
	private String getUserInput() {
		String answer = null;
		
		System.out.println("Would you like milk/sugar in yo' covfefe? (y/n)");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("Oh come on, do it right");
		}
		if(answer == null){
			return "no";
		}
		return answer;  
	}

}
