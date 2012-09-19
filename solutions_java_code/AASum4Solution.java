package questions100;
import java.util.*;

public class AaSum4Solution {
	
	public static void main(String[] args)
	{
		
	}
	
	public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
		// Start typing your Java solution below
        // DO NOT write main() function  
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Set<ArrayList<Integer>> test = new HashSet<ArrayList<Integer>>();
        Arrays.sort(num);
        for(int i = 0; i< num.length - 3; i++)
        {
        	for(int j = i+1; j< num.length - 2;j++ )
        	{
        		int k = j+1;
        		int z = num.length -1;
        		while(k < z)
        		{
        			int sum = num[i] + num[j] + num[k] + num[z];
        			if(sum == target)
        			{
        				ArrayList<Integer> li = new ArrayList<Integer>();
                        li.add(num[i]);
                        li.add(num[j]);
                        li.add(num[k]);
                        li.add(num[z]);
                        if(!test.contains(li))
                        	test.add(li);
                            result.add(li);
                        k ++;
                        z --;
        			}
        			else if(sum > target)
        				z --;
        			else
        				k ++;
        		}
        	}
        }   
        return result; 
    }
}
