package today;
import java.util.*;

public class PermutationsII {
	public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        // Start typing your Java solution below
		// DO NOT write main() function
	
		//from n power of n to n!
			
		ArrayList<ArrayList<Integer>> last = new ArrayList<ArrayList<Integer>>();
		if(num.length ==0 || num == null)
			return last;
		
		if(last.isEmpty())
		{
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(num[0]);
			last.add(arr);	
		}
		
		for (int i = 1; i < num.length; i++) {	
			int digit = num[i];
			ArrayList<ArrayList<Integer>> next = new ArrayList<ArrayList<Integer>>();
			for (ArrayList<Integer> al : last) {
					for(int j = 0; j <=al.size();j++)
					{
						ArrayList<Integer> arr = new ArrayList<Integer>();
						for(int m = 0; m <= al.size(); m++)
						{
							if(j == m)
								arr.add(digit);
							if(m < al.size())
							{
								arr.add(al.get(m));
							}
						}
						next.add(arr);	
					}
			}
			last = next;
		}
		return last;
	}
}
