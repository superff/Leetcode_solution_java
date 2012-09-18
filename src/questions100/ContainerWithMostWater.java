package questions100;

public class ContainerWithMostWater {
	 public int maxArea(int[] height) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	        int a = 0;
	        int b = height.length -1;
	        int max_area =0;
	        
	        
	        while(a < b)
	        {
	        	int cur_area =  Math.min(height[a], height[b])*(b-a);
	        	
	        	if(cur_area> max_area)
	        		max_area = cur_area;
	        	
	        	if(height[a] > height[b])
	        	{
	        		while(height[--b] > height[b]);
	        	}
	        	else
	        	{
	        		while(height[++a] > height[a]);
	        	}
	        }
	        
	        return max_area;
	    }

}
