/**NAME: Molly Redman
 * CLASS ID: 395
 * ASSIGNMENT #: 1 
 * DESCRIPTION: SimpleList.java contains one class consisting of two variables.
 * 				A variety of methods are available to manipulate and extract 
 * 				information from the integer array.
 */

package cse360assign2;


/**
 * @author mredm
 * The class SimpleList contains two variables - int[] list and int count.
 * The following methods are available: 
 * 	+SimpleList()
 * 	+add(int): void
 * 	+remove(int): void
 * 	+count(): int
 * 	+toString(): String
 * 	+search(): int
 */
public class SimpleList {
	
	
	private int[] list;
	private int count;	
		
	
	
	/**
	 * SimpleList() is used for the constructor of the class.
	 * Creates a new array that holds 10 integers. Count is 
	 * used to keep track of the size, it is set to zero.
	 */
	public SimpleList() {
		list = new int[10];
		count = 0;
	}
	
	
	
	/**
	 * @param numberToAdd value to be inserted at index 0 of the array
	 * Shifts the current numbers in the array up one position to make room
	 * for the new number. The count is increased by 1, if the array is not 
	 * already full (indicated if count equals 10). With every new addition,
	 * the count will increase.
	 */
	public void add(int numberToAdd) {
		if (count == 0) {
			list[0] = numberToAdd;
			count++;
		} else if (count < 10) {
			for(int index = count-1; index >= 0; index--) 
				list[index + 1] = list[index];
			list[0] = numberToAdd;
			count++;
		} else {
			//uniquely removes end to avoid outOfBounds error
			list[count - 1] = list[count - 2];
			//start two down from the end
			for(int index = count - 2; index >= 0; index--) 
				list[index + 1] = list[index];
			list[0] = numberToAdd;
		}
	}
	
	
	
	/**
	 * @param numberToRemove value to be removed from array.
	 * Searches for the number and moves all subsequent numbers down one position
	 * to accommodate the change. The count is decreased by one. The first instance
	 * is the one to be removed.
	 */
	public void remove(int numberToRemove) {
		int numberIndex = this.search(numberToRemove);
		
		if (numberIndex >= 0) {
			for(int index = numberIndex; index < list.length - 1; index++)
				list[index] = list[index + 1];
			count--;
		}
	}
	
	
	
	
	/**
	 * @return number of elements in variable list
	 * Iterates over the array count number of times and 
	 * returns the number of elements
	 */
	public int count() {
		int numberOfElements = 0;
		for(int index = 0; index < count; index++) 
				numberOfElements++;
		return numberOfElements;
	}
	
	
	
	/**
	 * @return the elements of the array concatenated into a string
	 * Extracts elements and generates a string of each value separated
	 * by a space.
	 */
	public String toString() {
		String stringList = "";
		
		if(count == 1) {
			stringList = stringList + list[0];
		} else {			
			for (int index = 0; index < count - 1; index++)
				stringList = stringList + list[index] + " ";
			//final value appended after loop so no space is added
			stringList = stringList + list[count - 1];
		}
		return stringList;
	}
	
	
	
	/**
	 * @param numberToFind value to locate inside the array
	 * @return if the number is in the array, the index of the first instance
	 * 		   is returned. Otherwise -1 if it is not present 
	 * Locates the position of a an integer within the integer array
	 */
	public int search(int numberToFind) {
		for(int index = 0; index < list.length; index++) 
			if (list[index] == numberToFind)
				return index;
		return -1;
	}
	
	
	
	//METHODS NOT REQUIRED IN DESCRIPTION

	/**
	 * @return the integer list assigned to the variable list
	 * Accesses the integer list of the object for testing purposes
	 */
	public int[] getArray() {
		return list;
	}
	
	
	
	/**
	 * @param newArray new array to change list to when testing
	 * Changes the current array that is stored. If the new array is larger
	 * than 10 integers, only the first 10 values will be kept. If the array
	 * is less than 10 integers, 0s will be added to extend the array to the 
	 * correct size. Count keeps track of total elements in array (excluding
	 * the added on zeros.
	 * 
	 * Method used to initiate the list variable on newly created objects 
	 * when testing.
	 */
	public void setArray(int[] newArray) {
		if (newArray.length > 10) {
			for(int index = 0; index < 10; index++) {
				this.list[index] = newArray[index];
				count++;
			}
		} else if (newArray.length < 10) {
			for(int index = 0; index < newArray.length; index++) {
				this.list[index] = newArray[index];
				count++;
			}
			for(int index = newArray.length; index < 10; index++) {
				this.list[index] = 0;
			}
		} else {
			this.list = newArray;
			count = 10;
		}
	} 
	
	
	
} // end class 
