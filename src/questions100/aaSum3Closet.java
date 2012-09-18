package questions100;
import java.util.ArrayList;
import java.util.Arrays;


public class aaSum3Closet {
	public int threeSumClosest(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(num);
        int diff = Integer.MAX_VALUE;
        int minSum = 0;
        for(int i = 0; i< num.length - 2; i++)
        {
            if(i >0 && num[i] == num[i-1])
                continue;
            int j = i + 1;
            int z = num.length - 1;
            while(j < z)
            {
            	int sum = num[i] + num[j] + num[z] ;
            	int cur_diff = Math.abs(sum - target);  	
                if(sum == target)
                {
                	diff = 0;
                	break;
                }
                else if(sum < target)
                {
                	if (cur_diff < diff)
                	{
                		diff = cur_diff;
                		minSum = sum;
                	}
                    j ++;
                }
                else
                {
                	if (cur_diff < diff)
                	{
                		diff = cur_diff;
                		minSum = sum;
                	}
                    z--;   
                }
            }
            if(diff == 0)
            {
            	minSum = target;
            	break;
            }
            
        }
        return minSum;
    }
}
