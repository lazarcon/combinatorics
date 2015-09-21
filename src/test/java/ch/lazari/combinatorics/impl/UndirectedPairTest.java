/*
 * File: 		UndirectedPairTest.java
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class
 */
public class UndirectedPairTest {

	private final String[] strings = {"A", "B"};
	
	private final UndirectedPair<String> toTest;
	
	public UndirectedPairTest() {
		toTest = new UndirectedPair<String>(strings);
	}
	
	/**
	 * Test method for {@link ch.lazari.combinatorics.impl.DirectedMultipel#hashCode()}.
	 */
	@Test
	public void testHashCode() {
		final UndirectedPair<String> equal = new UndirectedPair<String>(new String[]{"A", "B"});
		final UndirectedPair<String> different = new UndirectedPair<String>(new String[]{"B", "A"});		
		assertEquals(equal.hashCode(), toTest.hashCode());
		assertEquals(different.hashCode(), toTest.hashCode());
	}

	/**
	 * Test method for {@link ch.lazari.combinatorics.impl.DirectedMultipel#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObjectObject() {
		assertFalse(toTest.equals(new Object()));
	}

	/**
	 * Test method for {@link ch.lazari.combinatorics.impl.DirectedMultipel#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObjectTrue() {
		final UndirectedPair<String> compare1 = new UndirectedPair<String>(new String[]{"A", "B"});
		assertTrue(toTest.equals(compare1));
		final UndirectedPair<String> compare2 = new UndirectedPair<String>(new String[]{"B", "A"});
		assertTrue(toTest.equals(compare2));
	}

	/**
	 * Test method for {@link ch.lazari.combinatorics.impl.DirectedMultipel#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObjectFalse() {
		final UndirectedPair<String> compare = new UndirectedPair<String>(new String[]{"A", "b"});
		assertFalse(toTest.equals(compare));
	}

}
