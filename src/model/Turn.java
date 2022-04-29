package model;

public class Turn {

	private Turn next;
	private Turn previous;
	private int skiped;
	private int number;
	
	public Turn(int number) {
		
		this.number = number;
		skiped = 0;
	}

	public Turn getNext() {
		
		return next;
	}

	public void setNext(Turn next) {
		
		this.next = next;
	}

	public Turn getPrevious() {
		
		return previous;
	}

	public void setPrevious(Turn previous) {
		
		this.previous = previous;
	}

	public int getNumber() {
		
		return number;
	}

	public void setNumber(int number) {
		
		this.number = number;
	}

	public int getSkiped() {
		
		return skiped;
	}

	public void addSkiped() {
		
		++skiped;
	}
}
