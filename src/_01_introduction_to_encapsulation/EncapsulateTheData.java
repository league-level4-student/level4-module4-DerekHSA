package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */

public class EncapsulateTheData {
	// 1. Encapsulate the member variables.
	// Add restrictions to the setters according to the comment.

	// 2. Create a new JUnit Test case and write tests to verify that
	// the member variables' getters and setters are working

	private int itemsReceived; // must not be negative. All negative arguments get set to 0.
	private float degreesTurned; // must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; // must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; // must not be a String. If it is a String, set it equal to a new Object();

	public int itemsReceivedGetter() {
		return itemsReceived;
	}

	public void itemsReceivedSetter(int i) {
		if (i >= 0) {
			itemsReceived = i;
		} else {
			itemsReceived = 0;
		}
	}

	public float degreesTurnedGetter() {
		return degreesTurned;
	}

	public void degreesTurnedSetter(float f) {
		if (f >= 0.0 && f <= 360.0) {
			degreesTurned = f;
		}

	}

	public String nomenclatureGetter() {
		return nomenclature;
	}

	public void nomenclatureSetter(String s) {
		if (s.equals("")) {
			s=" ";
		}
		nomenclature = s;
	}

	public Object memberObjGetter() {
		return memberObj.getClass();
	}

	public void memberObjSetter(Object o) {
		if (o instanceof String) {
			o = new Object();
		}
		memberObj = o;
	}

	public static void main(String[] args) {
		
	}
}
