package questions100;

public class LengthofLastWord {
	
	public int lengthOfLastWord(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(s.isEmpty())
		{
			return 0;
		}
		
		int i= s.length()-1;
		
		while(i >= 0 && s.charAt(i) == ' ')
		{
			i--;
		}
		
		int end = i;
		
		while(i>=0 && s.charAt(i) != ' ')
		{
            i--;
		}
		
		return end -i ;
	}
}
