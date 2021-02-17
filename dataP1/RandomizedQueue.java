package dataP1;

public class RandomizedQueue<Item> {
	
	private Item [] queue;
	private int size, toRemoved;
	
	public RandomizedQueue() {
		queue = (Item[]) new Object[1];
		size = 0;
	}
	
	public boolean isEmpty() {
		return ( size==0 );
	}
	
	private void resize(int cap) {
		Item[] copy = (Item[]) new Object[cap];
		for(int i=0; i<size; i++) {
			copy[i] = queue[i];
		}
		queue = copy;
	}
	
	public void add(Item item) {
		queue[size++]=item;
		if(size == queue.length) {
			resize(2*queue.length);
		}
	}
	public Item remove() {
		toRemoved = (int) (Math.random()*(size));
		Item removed = queue[toRemoved];
		queue[toRemoved]=queue[--size];
		queue[size]=null;
		if(size>0 && size == ((int)(queue.length/4))) {
			resize(queue.length/2);
		}
		return removed;
	}
	

}
