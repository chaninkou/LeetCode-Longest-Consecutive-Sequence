package leetcode128;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {50, 4, 123, 1, 3, 2};
		
		System.out.println("Nums: " + Arrays.toString(nums));
		
		FindLongestConsecutive solution = new FindLongestConsecutive();
		
		System.out.println("Solution: " + solution.longestConsecutive(nums));
	}
}
