package questions100;

import java.util.*;

public class LargestRectangleinHistogram {
	public int largestRectangleArea(int[] height) {
		// Start typing your Java solution below
		// DO NOT write main() function

		if(height == null)
			return 0;
		
		if(height.length ==0)
			return 0;
		
		Stack<Integer> hei = new Stack<Integer>();
		Stack<Integer> indexs = new Stack<Integer>();

		hei.push(height[0]);
		indexs.push(0);

		int maxArea = 0;
		for (int i = 1; i < height.length; i++) {
			if (height[i] > hei.peek()) {
				hei.push(height[i]);
				indexs.push(i);
			} else if (height[i] == hei.peek()) {
			} else {
				int ind = 0;
				do {
					int h = hei.pop();
					ind = indexs.pop();
					int area = h * (i - ind);
					if (area > maxArea)
						maxArea = area;
				} while (!hei.isEmpty() && height[i] < hei.peek());
				hei.push(height[i]);
				indexs.push(ind);
			}
		}
		
		while (!hei.isEmpty()) {
			int h = hei.pop();
			int ind = indexs.pop();
			int area = h * (height.length - ind);
			if (area > maxArea)
				maxArea = area;
		}
		
		return maxArea;
	}
}
