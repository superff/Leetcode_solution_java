package questions100;

import java.util.*;

public class GenerateParentheses {
	public ArrayList<String> generateParenthesis(int n) {
		// Start typing your Java solution below
		// DO NOT write main() function

		Set<String> hash = new HashSet<String>();
		ArrayList<String> last = new ArrayList<String>();
		last.add("");
		for (int i = 0; i < n; i++) {
			hash = new HashSet<String>();
			ArrayList<String> newArr = new ArrayList<String>();
			for (String s : last) {
				for (int m = 0; m < s.length(); m++) {
					if (s.charAt(m) == '(') {
						String str = insertInside(s, m);
						if (!hash.contains(str)) {
							hash.add(str);
							newArr.add(str);
						}
					}
				}
				String head = "()" + s;
				if (!hash.contains(head)) {
					hash.add(head);
					newArr.add(head);
				}
			}
			last = newArr;
		}
		return last;
	}

	public String insertInside(String str, int leftIndex) {
		String left = str.substring(0, leftIndex + 1);
		String right = str.substring(leftIndex + 1);
		return left + "()" + right;

	}
}
