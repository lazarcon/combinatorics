/*
 * File: 		UndirectedPairListFactoryTest.java
 * Date: 		Sep 21, 2015
 *
 * Copyright 2015 Constantin Lazari. All rights reserved.
 *
 * Unless required by applicable law or agreed to in writing, this software
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.
 */
package ch.lazari.combinatorics.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Test class
 */
public class UndirectedPairListFactoryTest {

	/**
	 * Test method for {@link ch.lazari.combinatorics.impl.UndirectedPairListFactory#create()}.
	 */
	@Test
	public void testCreate() {
		final List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("Julia");
		list.add("Constantin");
		final UndirectedPairListFactory<String> factory = new UndirectedPairListFactory<String>(list);
		final List<UndirectedPair<String>> result = factory.create();
		// Check number of entries, using gauss
		assertEquals(((list.size() *(list.size() - 1)/2)), result.size());
		// Check if every combination is in the list
		for(final String row : list) {
			for(final String col : list) {
				if(row.equals(col)) {
					// Skip; things are not compared to themselves
				} else {
					assertTrue(isIn(result, row, col));
				}
			}
		}
	}

	private boolean isIn(final List<UndirectedPair<String>> pairs, String a, String b) {
		final UndirectedPair<String> pair = new UndirectedPair<String>();
		pair.set(1, a);
		pair.set(2, b);
		for(final UndirectedPair<String> paired : pairs) {
			if(paired.equals(pair)) {
				return true;
			}
		}
		return false;
	}

}
