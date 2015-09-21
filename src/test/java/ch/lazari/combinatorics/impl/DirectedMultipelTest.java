/*
 * File: 		DirectedMultipelTest.java
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
public class DirectedMultipelTest {

	private final String[] strings = {"A", "B", "C"};
	
	private final DirectedMultipel<String> toTest;
	
	public DirectedMultipelTest() {
		toTest = new DirectedMultipel<String>(strings);
	}
	
	/**
	 * Test method for {@link ch.lazari.combinatorics.impl.DirectedMultipel#hashCode()}.
	 */
	@Test
	public void testHashCode() {
		final DirectedMultipel<String> equal = new DirectedMultipel<String>(new String[]{"A", "B", "C"});
		final DirectedMultipel<String> different = new DirectedMultipel<String>(new String[]{"a", "b", "c"});		
		assertEquals(equal.hashCode(), toTest.hashCode());
		assertFalse(different.hashCode() == toTest.hashCode());
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
		final DirectedMultipel<String> compare = new DirectedMultipel<String>(new String[]{"A", "B", "C"});
		assertTrue(toTest.equals(compare));
	}

	/**
	 * Test method for {@link ch.lazari.combinatorics.impl.DirectedMultipel#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObjectFalse() {
		final DirectedMultipel<String> compare = new DirectedMultipel<String>(new String[]{"C", "B", "A"});
		assertFalse(toTest.equals(compare));
	}

}
