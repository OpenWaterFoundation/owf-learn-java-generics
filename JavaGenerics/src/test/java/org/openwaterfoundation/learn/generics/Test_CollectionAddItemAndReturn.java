package org.openwaterfoundation.learn.generics;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class Test_CollectionAddItemAndReturn extends TestCase {

	public Test_CollectionAddItemAndReturn(String name) {
		super(name);
	}
	
	/**
	 * Test to add Double to an ArrayList.
	 */
	public void testArrayListAddDoubleAndReturn() {
		List<Double> doubleList = new ArrayList<Double>();
		Double aDouble = new Double(3.14);
		Double addedDouble = CollectionAddItemAndReturn.addAndReturn ( aDouble, doubleList );
		assertEquals(aDouble, addedDouble);
	}
	
	/**
	 * Test to add Integer to an ArrayList.
	 */
	public void testArrayListAddIntegerAndReturn() {
		List<Integer> integerList = new ArrayList<Integer>();
		Integer aInteger = new Integer(3);
		Integer addedInteger = CollectionAddItemAndReturn.addAndReturn ( aInteger, integerList );
		assertEquals(aInteger, addedInteger);
	}
	
	/**
	 * Test to add Integer and Double to an ArrayList.
	 */
	public void testArrayListAddObjectsAndReturn() {
		List<Object> objectList = new ArrayList<Object>();
		Integer aInteger = new Integer(3);
		Object addedInteger = CollectionAddItemAndReturn.addAndReturn ( aInteger, objectList );
		assertEquals(aInteger, (Integer)addedInteger);
		Double aDouble = new Double(3.14);
		Object addedDouble = CollectionAddItemAndReturn.addAndReturn ( aDouble, objectList );
		assertEquals(aDouble, (Double)addedDouble);
	}

}
