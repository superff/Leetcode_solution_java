package questions100;

import java.util.*;

public class Anagrams {
	public ArrayList<String> anagrams(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
		ArrayList<String> result = new ArrayList<String>();
		Map<String,ArrayList<String>> hash = new HashMap<String,ArrayList<String>>();
		
		for(String st: strs)
		{
			String key = sortChars(st);
			if(!hash.containsKey(key))
			{
				hash.put(key, new ArrayList<String>());
			}
			ArrayList<String> al = hash.get(key);
			al.add(st);
		}	
		
		for(String key: hash.keySet())
		{
			if(hash.get(key).size()>1)
				result.addAll(hash.get(key));
		}
		return result;  
    }
	
	public String sortChars(String str)
	{
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
}
