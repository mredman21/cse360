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
	//test size after overflow
	void test2A() {
		SimpleList testList = new SimpleList();
		int[] tempArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		testList.setArray(tempArray);
		
		testList.add(0);
		testList.add(100);
		testList.add(1000);
		
		int expectedValue = 15;
		int actualValue = testList.size();
		
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
	
	@Test
	//test size after removing integers going below 25% emptiness
	void test5A() {
		SimpleList testList = new SimpleList();
		int[] tempArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		testList.setArray(tempArray);
		
		testList.remove(1);
		testList.remove(2);
		testList.remove(3);
		testList.remove(4);
		
		int expectedValue = 7;
		int actualValue = testList.size();
		
		assertEquals(expectedValue, actualValue);
	}	
	
	@Test
	//test size after removing integers going below 25% emptiness
	void test5B() {
		SimpleList testList = new SimpleList();
		int[] tempArray = {1, 2, 3, 4, 5, 6, 7};
		testList.setArray(tempArray);
		
		testList.remove(1);
		testList.remove(2);
		
		int expectedValue = 5;
		int actualValue = testList.size();
		
		
		//System.out.println(actualValue);
		
		assertEquals(expectedValue, actualValue);
	}	
	
	
	@Test
	//test count after appending integers
	void test6() {
		SimpleList testList = new SimpleList();
		int[] tempArray = {1, 2, 3, 4, 5};
		testList.setArray(tempArray);
		
		testList.append(0);
		testList.append(10);
		testList.append(100);
		
		int expectedValue = 8;
		int actualValue = testList.count();
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	//test toString after appending integers
	void test7() {
		SimpleList testList = new SimpleList();
		int[] tempArray = {1, 2, 3, 4, 5};
		testList.setArray(tempArray);
		
		testList.append(0);
		testList.append(10);
		testList.append(100);
		
		String expectedValue = "1 2 3 4 5 0 10 100";
		String actualValue = testList.toString();
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	//test count after appending overflow
	void test8() {
		SimpleList testList = new SimpleList();
		int[] tempArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		testList.setArray(tempArray);
		
		testList.append(0);
		testList.append(10);
		testList.append(100);
		
		int expectedValue = 13;
		int actualValue = testList.count();
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	//test toString after appending overflow
	void test9() {
		SimpleList testList = new SimpleList();
		int[] tempArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		testList.setArray(tempArray);
		
		testList.append(0);
		testList.append(10);
		testList.append(100);
		
		String expectedValue = "1 2 3 4 5 6 7 8 9 10 0 10 100";
		String actualValue = testList.toString();
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	//test first when the array has elements
	void test10() {
		SimpleList testList = new SimpleList();
		int[] tempArray = {1, 2, 3, 4, 5};
		testList.setArray(tempArray);
		
		int expectedValue = 1;
		int actualValue = testList.first();
	
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	//test first when the array has no elements
	void test11() {
		SimpleList testList = new SimpleList();
		
		int expectedValue = -1;
		int actualValue = testList.first();
	
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	//test last when the array has elements
	void test12() {
		SimpleList testList = new SimpleList();
		int[] tempArray = {1, 2, 3, 4, 5};
		testList.setArray(tempArray);
		
		int expectedValue = 5;
		int actualValue = testList.last();
	
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	//test last when the array has no elements
	void test13() {
		SimpleList testList = new SimpleList();
		
		int expectedValue = -1;
		int actualValue = testList.first();
	
		assertEquals(expectedValue, actualValue);
	}
	
	
	
	
}
