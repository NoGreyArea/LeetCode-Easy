

/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4*/
public class SearchInsertPosition {
	// using binary search method
	public int searchInsertOld(int[] nums, int target) {
		int low = 0, high = nums.length - 1;
		while (low <= high) {
			int mid = nums.length / 2;
			if (target == nums[mid])
				return mid;
			else if (target < nums[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}
		return low;
	}

	public int searchInsert(int[] nums, int target) {
		int i = 0;
		while (i < nums.length && target > nums[i])
			i++;
		return i;
	}

	public static void main(String args[]) {
		SearchInsertPosition ob = new SearchInsertPosition();
		int nums[] = new int[4];
		nums[0] = 1;
		nums[1] = 3;
		nums[2] = 5;
		nums[3] = 6;

		System.out.println(ob.searchInsert(nums, 7));
	}
}
