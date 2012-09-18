package questions100;

public class CountAndSay {
	public String countAndSay(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
		
		//String result = new String();
		if (n== 0)
		{
        	return new String();
        }	
        if(n == 1)
        {
        	return new String("1");
        }
		
        String last = countAndSay(n-1);
        StringBuffer sb = new StringBuffer();
        char prev = last.charAt(0);
        int times = 0;
        
        for(char c:last.toCharArray())
        {
        	if(c == prev)
        	{
        		times ++;
        	}
        	else
        	{
        		sb.append(times);
        		sb.append(prev);
        		prev  = c;
        		times = 1;
        	}
        }
        sb.append(times);
		sb.append(prev);
        
        return sb.toString();
    }
}
