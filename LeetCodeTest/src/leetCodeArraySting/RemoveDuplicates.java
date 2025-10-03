package leetCodeArraySting;


public class RemoveDuplicates {
	
	public int RemoveDups(int[] nums) {
		/*
		 * Creating "slow counter" to mark the last spot
		 * in the array since a unique value was found.
		 */
		int count = 0;
		
		for (int i = 1; i < nums.length; i++) {
			/*
			 * If we find a unique number
			 * The code must first increment the slow counter
			 * from the last placeholder to the next. 
			 * We then assign that element the unique number 
			 * found from the fast counter.  
			 * 
			 * count will keep its place and I will increment 
			 * to find the next unique value until it reaches 
			 * the max length of the array. 
			 */
			if(nums[count] != nums[i]) {
				nums[++count] = nums[i];
			} 
		}
		
		return count + 1;
	}
}
