/*
 * File: 		BasicPairTest.java
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

import org.junit.Test;

/**
 * Test class
 */
public class BasicPairTest {

	private final String[] strings = {"A", "B"};
	
	private final BasicPair<String> toTest = new BasicPair<String>(strings);
	
	/**
	 * Test method for {@link ch.lazari.combinatorics.impl.BasicPair#getFirst()}.
	 */
	@Test
	public void testGetFirst() {
		assertEquals("A", toTest.getFirst());
	}

	/**
	 * Test method for {@link ch.lazari.combinatorics.impl.BasicPair#getSecond()}.
	 */
	@Test
	public void testGetSecond() {
		assertEquals("B", toTest.getSecond());
	}

	/**
	 * Test method for {@link ch.lazari.combinatorics.impl.BasicPair#setFirst(java.lang.Object)}.
	 */
	@Test
	public void testSetFirst() {
		toTest.setFirst("C");
		assertEquals("C", toTest.getFirst());
	}

	/**
	 * Test method for {@link ch.lazari.combinatorics.impl.BasicPair#setSecond(java.lang.Object)}.
	 */
	@Test
	public void testSetSecond() {
		toTest.setSecond("D");
		assertEquals("D", toTest.getSecond());
	}

	/**
	 * Test method for {@link ch.lazari.combinatorics.impl.BasicPair#set(java.lang.Object, java.lang.Object)}.
	 */
	@Test
	public void testSetTT() {
		toTest.set("E", "F");
		assertEquals("E", toTest.getFirst());
		assertEquals("F", toTest.getSecond());
	}

}
