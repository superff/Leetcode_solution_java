package questions100;

public class DecodeWays {
	public int numDecodings(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
		if(s.isEmpty() || s.charAt(0) == '0')
			return 0;
			
		int[] ret = new int[3];
		ret[0] = 1;
		ret[1] = 1;
		
		for(int i = 1; i < s.length();i++)
		{
			char a = s.charAt(i);
			char b = s.charAt(i-1);
			
			if(a == '0' && b == '0')
			{
				return 0;
			}
			if(a =='0' && b >= '3')
			{
				return 0;
			}
			if (a == '0')
			{
				ret[(i + 1) % 3] = ret[i % 3];
			}
			else
			{
				String stemp = s.substring(i-1,i+1);
				int temp = Integer.parseInt(stemp);
				ret[(i + 1) % 3] = ret[i % 3] + (temp >= 10 && temp <= 26 ? ret[(i - 1) % 3] : 0);		 
			}
		}
		
		return ret[s.length() % 3];
	}
}
