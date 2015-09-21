/*
 * File: 		BasicMultipelTest.java
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
public class BasicMultipelTest {

	private final String[] strings = {"A", "B", "C"};
	
	private final BasicMultipel<String> toTest;
	
	public BasicMultipelTest() {
		toTest = new BasicMultipel<String>(strings);
	}
	
	/**
	 * Test method for {@link ch.lazari.combinatorics.impl.BasicMultipel#getSize()}.
	 */
	@Test
	public void testGetSize() {
		assertEquals(strings.length, toTest.getSize());
	}

	/**
	 * Test method for {@link ch.lazari.combinatorics.impl.BasicMultipel#get(int)}.
	 */
	@Test
	public void testGet() {
		assertEquals(strings[0], toTest.get(1));
		assertEquals(strings[1], toTest.get(2));
		assertEquals(strings[2], toTest.get(3));
	}

	/**
	 * Test method for {@link ch.lazari.combinatorics.impl.BasicMultipel#set(int, java.lang.Object)}.
	 */
	@Test
	public void testSetIntT() {
		toTest.set(2, "X");
		assertEquals("X", toTest.get(2));
	}

	/**
	 * Test method for {@link ch.lazari.combinatorics.impl.BasicMultipel#getTotalFreePositions()}.
	 */
	@Test
	public void testGetTotalFreePositions() {
		assertEquals(0, toTest.getTotalFreePositions());
		toTest.set(1, null);
		toTest.set(3, null);
		assertEquals(2, toTest.getTotalFreePositions());
	}

	/**
	 * Test method for {@link ch.lazari.combinatorics.impl.BasicMultipel#isFree(int)}.
	 */
	@Test
	public void testIsFree() {
		assertFalse(toTest.isFree(1));
		assertFalse(toTest.isFree(2));
		assertFalse(toTest.isFree(3));
		toTest.set(1, null);
		assertTrue(toTest.isFree(1));
	}

	/**
	 * Test method for {@link ch.lazari.combinatorics.impl.BasicMultipel#getFreePositions()}.
	 */
	@Test
	public void testGetFreePositions() {
		toTest.set(1, null);
		toTest.set(3, null);
		int[] freePositions = toTest.getFreePositions();
		assertEquals(2, freePositions.length);
		assertEquals(1, freePositions[0]);
		assertEquals(3, freePositions[1]);
	}

	/**
	 * Test method for {@link ch.lazari.combinatorics.impl.BasicMultipel#isFull()}.
	 */
	@Test
	public void testIsFull() {
		assertTrue(toTest.isFull());
		toTest.set(1, null);
		assertFalse(toTest.isFull());
	}

	/**
	 * Test method for {@link ch.lazari.combinatorics.impl.BasicMultipel#set(T[])}.
	 */
	@Test
	public void testSetTArray() {
		final String[] strings = {"D", "E", "F"}; 
		toTest.set(strings);
		assertEquals(strings[0], toTest.get(1));
		assertEquals(strings[1], toTest.get(2));
		assertEquals(strings[2], toTest.get(3));		
	}

}
