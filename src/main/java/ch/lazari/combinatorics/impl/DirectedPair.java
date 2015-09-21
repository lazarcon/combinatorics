/*
 * File: 		DirectedPair.java
 * Date: 		Sep 21, 2015
 *
 * Copyright 2015 Constantin Lazari. All rights reserved.
 *
 * Unless required by applicable law or agreed to in writing, this software
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.
 */
package ch.lazari.combinatorics.impl;

/**
 * Directed pair: (A, B) != (B, A)
 */
public class DirectedPair<T> extends BasicPair<T> {

	public DirectedPair(T[] objects) {
		super(objects);
	}

	@Override
	public boolean equals(final Object object) {
		if(object instanceof BasicPair) {
			final BasicPair<T> compare = (BasicPair<T>) object;
			for(int index = 0; index < this.getSize(); index++) {
				if(!this.getAtIndex(index).equals(compare.getAtIndex(index))) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		int hashCode = 0;
		for(int index = 0; index < getSize(); index++) {
			final T item = getAtIndex(index);
			hashCode += (item == null) ? 0 : item.hashCode() * 10 ^ (getSize() - index);
		}
		return hashCode;
	}
	
}
