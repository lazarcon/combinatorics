/*
 * File: 		Pair.java
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
 * Carries a pair (two) objects of the same type
 */
public interface Pair<T> extends Multipel<T> {

	
	/**
	 * Fetches the first object
	 * @return The first object
	 */
	T getFirst();
	
	/**
	 * Fetches the second object
	 * @return The second object
	 */
	T getSecond();
	
	/**
	 * Sets the first object to store
	 * @param object The object to store
	 */
	void setFirst(T object);
	
	/**
	 * Sets the second object to store
	 * @param object The object to store
	 */
	void setSecond(T object);
	
	/**
	 * Populates the pair with object 1 at position 1 and object 2 at position 2
	 * @param object1 Object to store at position 1
	 * @param object2 Object to store at position 2
	 */
	void set(T object1, T object2);
}
