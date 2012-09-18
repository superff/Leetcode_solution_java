package questions100;

public class ClimbStair {
	public int climbStairs(int n) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (n <= 0)
			return 0;
		int[] ways = new int[n];

		for (int i = 0; i < n; i++) {
			if (i == 0)
				ways[i] = 1;
			else if (i == 1)
				ways[i] = 2;
			else
				ways[i] = ways[i - 1] + ways[i - 2];
		}
		return ways[n - 1];
	}

	public int climbStairsR(int n) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (n < 0)
			return 0;
		else if (n == 0)
			return 1;

		return climbStairsR(n - 1) + climbStairsR(n - 2);

	}
}
