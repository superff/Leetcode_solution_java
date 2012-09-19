package questions100;

public class ReverseInteger {
	public int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
		int val = 0;
		boolean neg = false;
		
		if(x < 0)
		{
			neg = true;
			x = -x;
		}
		
		while(x != 0)
		{
			val = val*10 + x%10;
			x= x/10;
		}
		if(neg)
			return -val;
		
		return val;
    }
}
