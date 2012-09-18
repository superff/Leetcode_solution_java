package questions100;

public class AddBinary {
	public String addBinary(String a, String b) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (a.isEmpty())
			return b;
		if (b.isEmpty())
			return a;

		int i = a.length() - 1, j = b.length() - 1;
		int flag = 0, newDigit = 0;
		StringBuffer sb = new StringBuffer();

		while (i >= 0 || j >= 0) {
			int digitA = 0, digitB = 0;
			if (i >= 0) {
				if (a.charAt(i) == '1')
					digitA = 1;
				else if (a.charAt(i) == '0')
					digitA = 0;
				else {
					// throw new Exception(
					// "Input string has invalid character");
				}
				
			}

			if (j >= 0) {
				if (b.charAt(j) == '1')
					digitB = 1;
				else if (b.charAt(j) == '0')
					digitB = 0;
				else {
				// throw new Exception(
				// "Input string has invalid character");
				}
			}

			int sum = flag + digitA + digitB;
			flag = sum / 2;
			newDigit = sum % 2;
			sb.insert(0, newDigit);
			if (i >= 0)
				i--;
			if (j >= 0)
				j--;
		}
		if (flag == 1)
			sb.insert(0, flag);

		return sb.toString();
	}
}
