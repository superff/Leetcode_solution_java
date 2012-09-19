package questions100;

public class PlusOne {
	public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
		
		if(digits == null)
			return digits;
		
		int flag = 1;
		for(int i = digits.length-1; i>=0; i--)
		{
			if(flag == 1)
			{
				int sum = digits[i]+ flag;
				flag = sum/10;
				digits[i] = sum%10;
			}
			else
			{
				break;
			}
		}
		
		if(flag == 1)
		{
			int[] newD = new int[digits.length +1];
			
			newD[0] = flag;
			for(int i = 1; i< newD.length; i++)
			{
				newD[i] = digits[i-1];
			}
			
			return newD;
		}
        
		return digits;
    }
}
