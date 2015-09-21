/*
 * File: 		Multipel.java
 * Date: 		Sep 21, 2015
 *
 * Copyright 2015 Constantin Lazari. All rights reserved.
 *
 * Unless required by applicable law or agreed to in writing, this software
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.
 */
package ch.lazari.combinatorics.api;

/**
 * Carries multiple (x) objects of the same type
 */
public interface Multipel<T> {

	/**
	 * @return The size of the Multipel
 	 */
	int getSize();
	
	/**
	 * Fetches the object at <code>position</code> 
	 * @param position Position of the object (1 or 2)
	 * @return The object at the given position
	 */
	T get(int position);
	
	/**
	 * Sets the object at <code>position</code>
	 * @param position Position of the object to set (1 or 2)
	 * @param object The object to store
	 */
	void set(int position, T object);

	/**
	 * Checks whether the pair contains two not null objects
	 * @return <code>true</code>, if there are no </code>null</code> values stored; <code>false</code> otherwise
	 */
	boolean isFull();
	
	/**
	 * Checks whether the pair contains a <code>null</code> value at the given <code>position</code>
	 * @param position The position to check
	 * @return <code>true</code>, if there is a <code>null</code> value stored; <code>false</code> otherwise
	 */
	boolean isFree(int position);
	
	/**
	 * Retrieves the number of free positions
	 * @return Number of free positions
	 */
	int getTotalFreePositions();
	
	/**
	 * Fetches all free positions from the storage container 
	 * @return Array of integers with free positions
	 */
	int[] getFreePositions();

	/**
	 * Populates the container with the given objects in the given order
	 * @param objects The objects to store
	 */
	void set(T[] objects);
}