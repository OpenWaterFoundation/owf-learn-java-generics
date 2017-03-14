package org.openwaterfoundation.learn.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionAddItemAndReturn {

	public static void main(String[] args) {
		// Create a basic object and add to a collection, in this case only allowing Integer in the list
		List<Double> doubleList = new ArrayList<Double>();
		Double aDouble = new Double(3.14);
		Double addedDouble = addAndReturn ( aDouble, doubleList );
		System.out.println("Added integer " + addedDouble + " to ArrayList");

	}
	
	/**
	 * Add an item of any type (class) to a Collection, and return the added item.
	 * This illustrates operations using a class that is meant to provide generic functionality.
	 * - <T> at start of the line indicates type that is used in the method signature
	 * - next T indicates the return type of the method
	 * - remainder of the method definition is typical code
	 * @param item
	 * @param collection
	 * @return
	 */
	public static <T> T addAndReturn ( T item, Collection<T> collection ) {
		collection.add(item);
		return item;
	}

}
