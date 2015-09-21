/*
 * File: 		BasicMultipel.java
 * Date: 		Sep 21, 2015
 *
 * Copyright 2015 Constantin Lazari. All rights reserved.
 *
 * Unless required by applicable law or agreed to in writing, this software
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.
 */
package ch.lazari.combinatorics.impl;

import ch.lazari.combinatorics.api.Multipel;

/**
 * Simple implementation of a general purpose multipel
 */
public class BasicMultipel<T> implements Multipel<T> {

	private final int size;
	
	private final T[] objects;
	
	protected BasicMultipel(int size) {
		this.size = size;
		this.objects = (T[]) new Object[size];
	}
	
	protected BasicMultipel(int size, T[] objects) {
		assert(objects.length == size);
		this.size = size;
		this.objects = objects;
	}
	
	/**
	 * Creates a BasicMultipel that stores the given objects
	 * @param objects the objects to store
	 */
	public BasicMultipel(T[] objects) {
		this(objects.length, objects);
	}
	
	/* (non-Javadoc)
	 * @see ch.lazari.combinatorics.api.Multipel#getSize()
	 */
	@Override
	public int getSize() {
		return size;
	}

	/* (non-Javadoc)
	 * @see ch.lazari.combinatorics.api.Multipel#get(int)
	 */
	@Override
	public final T get(int position) {
		return getAtIndex(position - 1);
	}

	/* (non-Javadoc)
	 * @see ch.lazari.combinatorics.api.Multipel#set(int, java.lang.Object)
	 */
	@Override
	public void set(int position, T object) {
		setAtIndex(position - 1, object);
	}

	/* (non-Javadoc)
	 * @see ch.lazari.combinatorics.api.Multipel#getTotalFreePositions()
	 */
	@Override
	public final int getTotalFreePositions() {
		int totalFree = 0;
		for(int index = 0; index < objects.length; index++) {
			totalFree += (objects[index] == null) ? 1 : 0;
		}
		return totalFree;
	}

	/* (non-Javadoc)
	 * @see ch.lazari.combinatorics.api.Multipel#isFree(int)
	 */
	@Override
	public final boolean isFree(int position) {
		return objects[position - 1] == null;
	}

	/* (non-Javadoc)
	 * @see ch.lazari.combinatorics.api.Multipel#getFreePositions()
	 */
	@Override
	public final int[] getFreePositions() {
		final int[] freePositions = new int[getTotalFreePositions()];
		int freeIndex = 0;
		for(int index = 0; index < objects.length; index++) {
			if(objects[index] == null) {
				freePositions[freeIndex++] = index + 1;
			}
		}
		return freePositions;
	}
	
	/* (non-Javadoc)
	 * @see ch.lazari.combinatorics.api.Multipel#isFull()
	 */
	@Override
	public final boolean isFull() {
		return getTotalFreePositions() == 0;
	}

	/* (non-Javadoc)
	 * @see ch.lazari.combinatorics.api.Multipel#set(T[])
	 */
	@Override
	public final void set(T[] objects) {
		assert(objects.length == size);
		for(int index = 0; index < objects.length; index++) {
			setAtIndex(index, objects[index]);
		}		
	}
	
	/**
	 * Sets the object at index position, not at position which is index + 1
	 * @param index Actual index of the object
	 * @param object The object to Store
	 */
	protected void setAtIndex(int index, T object) {
		this.objects[index] = object;
	}

	/**
	 * Gets the object at index position, not at position which is index + 1
	 * @param index Actual index of the object
	 * @return Object at that position
	 */
	protected T getAtIndex(int index) {
		return this.objects[index];
	}
}
