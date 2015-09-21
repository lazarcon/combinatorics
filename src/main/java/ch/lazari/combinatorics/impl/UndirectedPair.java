/*
 * File: 		UndirectedPair.java
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
 * Undirected pair: (A, B) == (B, A)
 */
public class UndirectedPair<T> extends BasicPair<T> {
	
	public UndirectedPair() {
		super();
	}
	
	/**
	 * @param objects
	 */
	public UndirectedPair(final T[] objects) {
		super(objects);
	}

	@Override
	public boolean equals(final Object object) {
		if(object instanceof UndirectedPair) {
			final UndirectedPair<T> compare = (UndirectedPair<T>) object;
			if ((compare.getFirst().equals(this.getFirst()) || compare.getFirst().equals(this.getSecond()))
					&& (compare.getSecond().equals(this.getFirst()) || compare.getSecond().equals(this.getSecond()))) {
				return true;
			} 
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int hashCode = 0;
		hashCode += (getFirst() == null) ? 0 : getFirst().hashCode();
		hashCode += (getSecond() == null) ? 0 : getSecond().hashCode();
		return hashCode;
	}
}
