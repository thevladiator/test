package vlad;

import features.Feature;

/**
 * This is a test class.
 * @author vlad.georgescu
 * 
 * Let's see here
 *
 */
public class TestMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I'm testing");
		Feature feature = new Feature();
		feature.setName("Vlad");
		feature.setCounter(2);
		System.out.println("Now is the best time: " + feature.toString());
	}

}
