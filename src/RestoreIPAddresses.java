package questions100;

import java.util.*;

public class RestoreIPAddresses {
	public ArrayList<String> restoreIpAddresses(String s) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<String> res = new ArrayList<String>();

		if (s.length() > 12 || s.length() < 4) {
			return res;
		}

		int len = s.length();
		int i = 0;
		
		for (int j = i + 1; j < len - 2 && j < i + 4; j++) {
			for (int m = j + 1; m < len - 1 && m < j + 4; m++) {
				for (int n = m + 1; n < len && n < m + 4; n++) {
					String a = s.substring(i, j);
					String b = s.substring(j, m);
					String c = s.substring(m, n);
					String d = s.substring(n);
					if (isValidIp(a, b, c, d)) {
						res.add(a + "." + b + "." + c + "." + d);
					}
				}
			}
		}
		return res;

	}

	public boolean isValidIp(String a, String b, String c, String d) {
		// check length
		boolean lenVal = d.length() < 4;
		if (!lenVal) {
			return false;
		}

		boolean zVal = (a.length() == 1 || a.charAt(0) != '0')
				&& (b.length() == 1 || b.charAt(0) != '0')
				&& (c.length() == 1 || c.charAt(0) != '0')
				&& (d.length() == 1 || d.charAt(0) != '0');

		if (!zVal) {
			return false;
		}

		int aV = Integer.parseInt(a), bV = Integer.parseInt(b), cV = Integer
				.parseInt(c), dV = Integer.parseInt(d);

		boolean vVal = (aV >> 8) == 0 && (bV >> 8) == 0 && (cV >> 8) == 0
				&& (dV >> 8) == 0;

		return vVal;
	}

}
