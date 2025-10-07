package leetCodeArraySting;

public class RemoveDuplicatesII {
	public int removeDuplicatesAgain(int[] nums) {
		
			/*
			 My code below fails for one main reason.
			 I am trying to do too much manual manipulation on the array size and uniqueCount. 
			 This is causing my solutions to be inconsistent depending on the test case. 
			 
			int uniqueCount = 0, dupCount = 1, maxDuplicates = 2, arraymax = nums.length;
			if (arraymax > 3) {
				arraymax = arraymax - 1;
			}
			
			for (int i = 1; i < arraymax; i++) {
		
				if(nums[uniqueCount] != nums[i] && dupCount > maxDuplicates) {
		
					
					nums[++uniqueCount] = nums[i];
					//If unique number found, need to reset dup counter
					dupCount = 1;
				} 
				else if (nums[uniqueCount] != nums[i] && dupCount == maxDuplicates) {
					dupCount = 1;
					nums[++uniqueCount] = nums[i];
				} 
				else if (nums[uniqueCount] == nums[i] && dupCount >= maxDuplicates && i < (arraymax)) {
					dupCount++;
				} else {
					nums[++uniqueCount] = nums[i]; 
					dupCount++;
				}
			}
			
			if (dupCount > 2) {
			return uniqueCount + 1;
			}else {
				return uniqueCount;
			}
		*/
		
		int n = nums.length;
		//if array max is 2 then based on the problem description, 2 will always be allowed. 
	    if (n <= 2) return n;

	    int uniqueCount = 2; // start from index 2 because first two are always allowed
	    for (int i = 2; i < n; i++) {
	    	/*
	    	 * if nums[i] "fast counter" is unique from the slow counter[uniqueCount] 2 elements behind then we increase the uniqueCount
	    	 * and set the uniqueCount element to the value inside the fast counter
	    	 * 1,1,2,3,3,3,4
	    	 *     i(fast counter)
	    	 *     s(slow counter)
	    	 * 2(nums[i]) != 1(uniqueCount - 2) so we set uniqueCount to the value of nums[i] which is 2. 
	    	 * The after incrementing the counts, the indexs will look like below
	    	 *
	    	 * 1,1,2,3,3,3,4
	    	 *       i  
	    	 *       s
	    	 * 3(nums[i]) != 1(uniqueCount - 2) so we set uniqueCount to the value of nums[i] which is 3. 
	    	 * The after incrementing the counts, the indexs will look like below
	    	 * 
	    	 * 1,1,2,3,3,3,4
	    	 *         i
	    	 *         s
	    	 * 3(nums[i]) != 2(uniqueCount - 2) so we set uniqueCount to the value of nums[i] which is 3. 
	    	 * The after incrementing the counts, the indexs will look like below
	    	 * 
	    	 *  1,1,2,3,3,3,4
	    	 *            i
	    	 *            s
	    	 * 3(nums[i]) == 3(uniqueCount - 2). Since both values are equal than we do nothing but increment the fast counter
	    	 * This is going to repeat until a number is found by the fast counter that is unique from (uniqueCount -2) 
	    	 * 
	    	 * 1,1,2,3,3,3,4
	    	 *             i
	    	 *           s
	    	 * 4(nums[i]) != 3(uniqueCount - 2). so we set uniqueCount to the value of nums[i] which is 4
	    	 * The after incrementing the counts, the indexs will look like below
	    	 * 
	    	 *  1,1,2,3,3,4,4 (index  i is no longer less than n, so loop breaks)
	    	 *  uniqueCount = 6
	    	 * 
	    	 */
	        if (nums[i] != nums[uniqueCount - 2]) {
	            nums[uniqueCount] = nums[i];
	            uniqueCount++;
	        }
	    }
	    return uniqueCount;
	}
}
