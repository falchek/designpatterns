package observer.vultures;

import java.util.ArrayList;

public class Meeting implements Subject{

	private ArrayList<VultureObserver> vultures;
	private Food food; 
	
	public Meeting() {
		this.vultures = new ArrayList(); 
	}
	
	@Override
	public void registerObserver(VultureObserver vulture) {
		vultures.add(vulture);
	}
	
	@Override
	public void notifyObservers() {
		VultureObserver vulture;
		for (int i = 0; i < vultures.size(); i++){
			vulture = vultures.get(i);
			vulture.update(this.food);
		}
	}

	@Override
	public void removeObserver(VultureObserver vulture) {
		int i = vultures.indexOf(vulture);
		if (i >= 0)
				vultures.remove(i);
	}
	
	public void foodChanged(){
		notifyObservers();  
	}
	
	public void setFood(Food food){
		this.food = food; 
		foodChanged(); 
	}
	 
}
