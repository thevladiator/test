package features;

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
		return "This is my new feature: " + name + " " + counter;
	}
	

}
