package observer.weather;

import java.util.ArrayList;
import java.util.HashMap;

public class WeatherData implements Subject{
	private ArrayList observers;
	private float temperature;
	private float humidity; 
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList(); //I'm going to try a hashmap later. 
	}
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if (i >= 0)
				observers.remove(i);
	}
	
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(this.temperature, this.humidity, this.pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers(); 
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged(); 
	}
	
}
