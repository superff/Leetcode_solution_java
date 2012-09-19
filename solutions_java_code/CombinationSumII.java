package questions100;

import java.util.*;

public class CombinationSumII {
	public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> record = new ArrayList<Integer>();
		Arrays.sort(num);
		CombinationSumR(num,0,record, target,result); 
		return result;
	}

	public static void CombinationSumR(int[] num, int start,
			ArrayList<Integer> record, int sum,
			ArrayList<ArrayList<Integer>> result) {
		
		if(sum == 0)
		{
			ArrayList<Integer> NewR = new ArrayList<Integer>();
			NewR.addAll(record);
			result.add(NewR);
			return;
		}
		
		if(sum < 0 || start == num.length)
		{
			return;
		}
		
		
		int prev = -1;
		for(int i = start; i< num.length; i++)
		{
			//good code
			if(num[i] != prev)
			{
				record.add(num[i]);
				CombinationSumR(num,i+1,record,sum-num[i],result);
				record.remove(record.size() - 1);
				prev = num[i];
			}
		}
	}

}
