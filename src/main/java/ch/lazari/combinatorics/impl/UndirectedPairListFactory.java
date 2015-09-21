/*
 * File: 		UndirectedPairListFactory.java
 * Date: 		Sep 21, 2015
 *
 * Copyright 2015 Constantin Lazari. All rights reserved.
 *
 * Unless required by applicable law or agreed to in writing, this software
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.
 */
package ch.lazari.combinatorics.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Creates a list of pairs
 */
public class UndirectedPairListFactory<T> {

	private final List<T> unpairedItems;
	
	public UndirectedPairListFactory(final List<T> unpairedItems) {
		this.unpairedItems = unpairedItems;
	}
	
	public List<UndirectedPair<T>> create() {
		final List<UndirectedPair<T>> result = new ArrayList<UndirectedPair<T>>(); 
		final Stack<T> left = createStack(unpairedItems);
		while(left.size() > 0) {
			final Stack<T> right = createStack(left);
			final T itemLeft = left.pop();
			while(right.size() > 0) {
				final UndirectedPair<T> pair = new UndirectedPair<T>();
				pair.set(itemLeft, right.pop());
				result.add(pair);
			}
		}
		return result;
 	}
	
	private Stack<T> createStack(final List<T> items) {
		final Stack<T> stack = new Stack<T>();
		for(final T item : items) {
			stack.push(item);
		}
		return stack;
	}
	
	private Stack<T> createStack(final Stack<T> stack) {
		final Stack<T> clone = clone(stack);
		final Stack<T> created = new Stack<T>();
		if(clone.size() > 0) clone.pop();
		while(clone.size() > 0) {
			created.push(clone.pop());
		}
		return created;
	}
	
	private Stack<T> clone(final Stack<T> source) {
		final Object[] elements = source.toArray();
		final Stack<T> clone = new Stack<T>();
		for(Object element : elements) {
			clone.push((T) element);
		}
		return clone;
	}
}
