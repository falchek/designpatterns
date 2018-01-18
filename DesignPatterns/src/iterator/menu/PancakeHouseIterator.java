package iterator.menu;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseIterator implements Iterator {

	ArrayList items;
	int position = 0; 
	
	public PancakeHouseIterator(ArrayList items){
		this.items = items;
	}
	
	@Override
	public boolean hasNext() {
		if(position < this.items.size()){
			return true;
		}
		else
			return false;
	}

	@Override
	public Object next() {
		MenuItem item = (MenuItem) items.get(position);
		position += 1;
		return item;
	}
	
	
}
