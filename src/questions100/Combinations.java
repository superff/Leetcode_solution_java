package questions100;

import java.util.*;

public class Combinations {
	public ArrayList<ArrayList<Integer>> combine(int n, int k) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (k == 0) {
			ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
			return result;
		}
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> last = combine(n, k - 1);

		if (last.isEmpty()) {
			for (int i = 1; i <= n; i++) {
				ArrayList<Integer> l = new ArrayList<Integer>();
				l.add(i);
				result.add(l);
			}
		} else {
			for (ArrayList<Integer> list : last) {
				for (int i = list.get(list.size() - 1) + 1; i <= n; i++) {
					ArrayList<Integer> l = new ArrayList<Integer>();
					l.addAll(list);
					l.add(i);
					result.add(l);
				}
			}
		}
		return result;
	}
}
