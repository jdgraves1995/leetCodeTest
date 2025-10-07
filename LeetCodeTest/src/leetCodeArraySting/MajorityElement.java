package leetCodeArraySting;			

public class MajorityElement {
	public int majorityElementReturn(int[] nums) {
		
		//since nums can have length equal to 1, I can always return the first element.
		/*
		 * Though the below solution could work after I loop through the hash to find the max value pair
		 * if does not work in O(1) space.   
		
		 
		int majorityNum = 0;
		HashMap<Integer,Integer> majority = new HashMap<Integer,Integer>();
		int numsLength = nums.length;
		
		
		if(numsLength == 1) {
			return nums[0];
		} else {
			for (int i = 0; i < numsLength; i++) {
				if (!majority.containsKey(nums[i])) {
					majority.putIfAbsent(nums[i], 1);
				} else {
					majority.computeIfPresent(nums[i], (key, value) -> value + 1);
				}
			}
		}
		*/
		
		int majorityNum = 0;
		int candidate = 0;
		
		/*
		 * for each num in array nums, we are going to check on the candidate status.  
		 * Since the problem describes that the majority element will show more than half the time, 
		 * It will cancel out any other numbers that are not the majority in the array. 
		 * for example:
		 * nums = {1,1,2,2,2,1,1}
		 * At the start of parsing the array, 1 will be the first candidate. 
		 * However, due the number of 2 values, majoirtyNum will move to 0 and set 2 as the next candidate. 
		 * Yet, it will once again be replaced by 1 as the candidate since majorityNum will fall to 0 before the end of the array for the candidate of 1. 
		 * This is because is exist less than half of the length of the array which has been dominated 
		 */
		for(int num: nums) {
			if (majorityNum == 0) {
				candidate = num;
			}
			//Used ternary operation instead of expanded if else for more concise logic
			majorityNum += (num == candidate) ? 1 : -1;
		}
		
		return candidate;
		
	}
}
