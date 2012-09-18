package questions100;

import java.util.*;

public class GaryCode {
	public ArrayList<Integer> grayCode(int n) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<Integer> aL = new ArrayList<Integer>();

		int size = 1;

		while (n-- > 0) {
			size *= 2;
		}

		//no formular quite difficult
		for (int i = 0; i < size; i++) {
			aL.add((i>>1)^i);
		}
		
		return aL;
	}
}
