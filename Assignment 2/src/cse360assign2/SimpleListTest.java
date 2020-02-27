package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleListTest {

	@Test
	//test count after adding 3 integers
	void test1() {
		SimpleList testList = new SimpleList();
		int[] tempArray = {1, 2, 3, 4, 5};
		testList.setArray(tempArray);
		
		testList.add(10);
		testList.add(100);
		testList.add(1000);
		
		int expectedValue = 8;
		int actualValue = testList.count();
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	//test count after overflow
	void test2() {
		SimpleList testList = new SimpleList();
		int[] tempArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		testList.setArray(tempArray);
		
		testList.add(0);
		testList.add(100);
		testList.add(1000);
		
		int expectedValue = 13;
		int actualValue = testList.count();
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	//test count transition to overflow
	void test3() {
		SimpleList testList = new SimpleList();
		int[] tempArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		testList.setArray(tempArray);
		
		testList.add(10);
		testList.add(100);
		testList.add(1000);
		
		int expectedValue = 12;
		int actualValue = testList.count();
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	//test count after removing an integer without going below 25%
	void test4() {
		SimpleList testList = new SimpleList();
		int[] tempArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		testList.setArray(tempArray);
		
		testList.remove(3);
		testList.remove(7);
		
		int expectedValue = 8;
		int actualValue = testList.count();
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	//test count after removing integers going below 25% emptiness
	void test5() {
		SimpleList testList = new SimpleList();
		int[] tempArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		testList.setArray(tempArray);
		
		testList.remove(2);
		testList.remove(3);
		testList.remove(4);
		testList.remove(6);
		
		int expectedValue = 6;
		int actualValue = testList.count();
		
		assertEquals(expectedValue, actualValue);
	}
	

}
