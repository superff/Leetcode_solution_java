package questions100;
import java.util.*;

public class AaSum3Solution {
	public static void main(String[] args)
	{
		
	}
	
	public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function  
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(num);
        for(int i = 0; i< num.length - 2; i++)
        {
            if(i >0 && num[i] == num[i-1])
                continue;
            int j = i + 1;
            int z = num.length - 1;
            while(j < z)
            {
                if( num[i] + num[j] + num[z] == 0)
                {
                    ArrayList<Integer> li = new ArrayList<Integer>();
                    li.add(num[i]);
                    li.add(num[j]);
                    li.add(num[z]);
                    if(!result.contains(li))
                        result.add(li);
                    j ++;
                    z --;
                }
                else if(num[i] + num[j] + num[z] < 0)
                {
                    j ++;
                }
                else
                {
                    z--;   
                }
            }
        }
        return result;
    }
}
