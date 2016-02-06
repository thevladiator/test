package features;

/**
 * This is my Feature class. It is the best class.
 */
public class Feature {
	
	private String name;
	private int counter;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public String toString() {
		return "Featuring my changes: " + name + " " + counter;
	}
	

}
