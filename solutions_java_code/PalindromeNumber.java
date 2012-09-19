package questions100;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
		if( x < 0)
			return false;
		if(x >=0 && x<=9)
			return true;
		int div = 1;
		while(x/div >= 10)
		{
			div *= 10;
		}
		while(x!= 0)
		{
			int l = x/div;
			int r = x%10;
			if(l != r)
			{
				return false;
			}
			x = (x %div)/10;
			div = div /100;
		}
		return true;
    }
}
