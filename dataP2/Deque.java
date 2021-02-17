package dataP2;


public class Deque<Item> {
	
	private class Node {
		Item item;
		Node next, previous;
	}

	private Node first, last;
	private int size;
	
	public Deque() {
		size = 0;
	}
	
	public boolean isEmpty() {
		return ( size==0 );
	}
	
	public void addFirst(Item item) {
		Node oldfirst = first;
		first = new Node();
		first.next = oldfirst;
		first.item = item;
		if (size>0) {
			oldfirst.previous = first;
		}
		else {
			last=first;
		}
		size++;
	}
	
	public void addLast(Item item) {
		Node oldlast = last;
		last = new Node();
		last.previous = oldlast;
		last.item = item;
		if(size>0) {
			oldlast.next = last;
		}
		else {
			first = last;
		}
		size++;
	}
	
	public Item removeFirst() {
		Item item = first.item;
		if(size>1) {
			first = first.next;
			first.previous = null;
		}
		else {
			first = null;
			last = null;
		}
		size--;
		return item;
	}
	
	public Item removeLast() {
		Item item = last.item;
		if(size>1) {
			last = last.previous;
			last.next = null;
		}
		else {
			first = null;
			last = null;
		}
		size--;
		return item;
	}
	
	public boolean reverse() {
		char item = (char) removeFirst();
		char item2 = (char) removeLast();
		switch(item) {
			case 'A':
				item = 'T';
				break;
			case 'T':
				item = 'A';
				break;
			case 'G':
				item = 'C';
				break;
			case 'C':
				item = 'G';
				break;
			default:
				item = '0';
			}
		if(item==item2) {
			return true;
		}
		else {
			return false;
		}
		
		}
	
}
