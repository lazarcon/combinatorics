/*
 * File: 		BasicPair.java
 * Date: 		Sep 21, 2015
 *
 * Copyright 2015 Constantin Lazari. All rights reserved.
 *
 * Unless required by applicable law or agreed to in writing, this software
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.
 */
package ch.lazari.combinatorics.impl;

import ch.lazari.combinatorics.api.Pair;

/**
 * Simple implementation of a general purpose pair
 */
public class BasicPair<T> extends BasicMultipel<T> implements Pair<T> {
	
	public BasicPair() {
		super(2);
	}
	
	/**
	 * Creates a new pair carrying the given objects
	 * @param objects
	 */
	public BasicPair(T[] objects) {
		super(2, objects);
	}

	/* (non-Javadoc)
	 * @see ch.lazari.combinatorics.api.Pair#getFirst()
	 */
	@Override
	public T getFirst() {
		return get(1);
	}

	/* (non-Javadoc)
	 * @see ch.lazari.combinatorics.api.Pair#getSecond()
	 */
	@Override
	public T getSecond() {
		return get(2);
	}

	@Override
	public void setFirst(T object) {
		set(1, object);
	}

	/* (non-Javadoc)
	 * @see ch.lazari.combinatorics.api.Pair#setSecond(java.lang.Object)
	 */
	@Override
	public void setSecond(T object) {
		set(2, object);
	}

	/* (non-Javadoc)
	 * @see ch.lazari.combinatorics.api.Pair#set(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void set(T object1, T object2) {
		set(1, object1);
		set(2, object2);
	}
}
