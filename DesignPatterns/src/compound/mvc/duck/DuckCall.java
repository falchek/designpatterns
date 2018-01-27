package compound.mvc.duck;

public class DuckCall implements Quackable {
	Observable observable;
	
	public DuckCall() {
		this.observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Kwak (Fake duck noise)");
		notifyObservers();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

}
