package _01_introduction_to_encapsulation;

import org.junit.Test;

import junit.framework.TestCase;

public class EcapsulateTheDataTest extends TestCase {
	EncapsulateTheData test= new EncapsulateTheData();
	@Test
	public void testItemsRecievedGetterSetter() throws Exception {
		test.itemsReceivedSetter(-5);
		assertEquals(0, test.itemsReceivedGetter());
	}
	public void testDegreesTurnedGetterSetter() throws Exception {
		float f = 5;
		test.degreesTurnedSetter(5);
		assertEquals(f, test.degreesTurnedGetter());
	}
	public void testNomenclature() throws Exception {
		test.nomenclatureSetter("");
		assertEquals(" ",test.nomenclatureGetter());
	}
	public void testMemberObjGetterSetter() throws Exception {
		test.memberObjSetter(" ");
		assertEquals(new Object().getClass(), test.memberObjGetter());
	}
}
