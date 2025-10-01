package leetCodeArraySting;

import java.util.*;

public class RemoveElement {
	public int RemoveArrayElement(int[] nums, int val) {
		/**First assumptions based on description
		 * 1. May need counter for number of elements that != to val
		 * 2. If element does not equal val to remove, increment counter, increment loop index, and start again. 
		 * 3. var count = number of elements that do not match 
		 * 
		 * 
		 * 
		 */
		/**
		 * Attempt to use .stream to filter out val, but it would not be editing the array passed into my method. 
		 *long countkept = Arrays.stream(nums)
								 .filter(n -> n != val)
								 .count();
		
		return (int) countkept; 
		1,2,3,4
		 */
		
		/*
		 * I over complicated the issue below by using ArrayList and adding complexity to the task at hand. 
		 * Depending on the data sent in, the removeIf time complexity can go from o(n) to o(N^2)
		 * For each element that is removed, the array list must shift the rest of the list. 
		 * Say you want to remove 3 elements from the following array starting at the beginning (1,2,3,4)
		 * Remove at index 0 -> 3 operations(shifting each other element after index 0) 
		 * Remove at index 0 -> 2 operations
		 * Remove at index 0 -> 1 operations
		 * remove at index 0 -> 0 operations(No more elements to shift)
		 * So, 3 + 2 + 1 + 0 = 6 operations
		 * 
		 * Depending on the data, this could get worse.
		ArrayList<Integer> remove = new ArrayList<Integer>();
		int count = 0;
		
		for (int k = 0; k < nums.length; k++) {
			remove.add(nums[k]);
		}
		
		remove.removeIf(n -> n == val);
		
		for (int j = 0; j < remove.size(); j++) {
			nums[j] = remove.get(j);
			count++;
		}
		*/
		
		/*
		 * The solution below keeps O notation at 0(n)
		 * There is no need for shifting all data elements that comes after the element removed. 
		 * The leetcode question outlines that all that must be done is removing the values matching val from the array
		 * After removing, overwrite that value with the element that comes after. So the loop only runs until i = array.length
		 * No repeated scanning or shifting of elements. You loop until there is no more room.  
		 */
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[count++] = nums[i];
			}
		}
		return count;
	}
}
