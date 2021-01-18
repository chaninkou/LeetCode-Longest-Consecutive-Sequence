package leetcode128;

import java.util.HashMap;

public class FindLongestConsecutive {
	// O(N) solution
	public int longestConsecutive(int[] nums) {
		// Keep track of longest consecutive of current element for all
		HashMap<Integer, Integer> map = new HashMap<>();

		int result = 0;

		for (int num : nums) {
			if (!map.containsKey(num)) {
				// Get left and right side
				int left = map.getOrDefault(num - 1, 0);
				int right = map.getOrDefault(num + 1, 0);

				int sum = left + right + 1;

				result = Math.max(result, sum);

				map.put(num, sum);

				// Update all the count
				if (left > 0) {
					map.put(num - left, sum);
				}
				if (right > 0) {
					map.put(num + right, sum);
				}

			} else {
				continue; // Skip duplicates
			}
		}

		return result;
	}
}
