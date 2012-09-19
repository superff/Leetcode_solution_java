package questions100;
import java.util.*;

public class SpiralMatrix {
	
	public ArrayList<Integer> spiralOrder(int[][] matrix) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		if(matrix.length == 0)
		{
			return res;
		}
		int n = matrix[0].length;
		int m = matrix.length;
		int i, k = 0, l = 0;
	    /*  k - starting row index
	        m - ending row index
	        l - starting column index
	        n - ending column index
	        i - iterator
	    */
	 
	    while (k < m && l < n)
	    {
	        /* Print the first row from the remaining rows */
	        for (i = l; i < n; ++i)
	        {
	        	res.add(matrix[k][i]);
	        }
	        k++;
	 
	        /* Print the last column from the remaining columns */
	        for (i = k; i < m; ++i)
	        {
	            res.add(matrix[i][n-1]);
	        }
	        n--;
	 
	        /* Print the last row from the remaining rows */
	        if ( k < m)
	        {
	            for (i = n-1; i >= l; --i)
	            {
	                res.add(matrix[m-1][i]);
	            }
	            m--;
	        }
	 
	        /* Print the first column from the remaining columns */
	        if (l < n)
	        {
	            for (i = m-1; i >= k; --i)
	            {
	                res.add(matrix[i][l]);
	            }
	            l++;    
	        }        
	    }
	    
	    return res;
	}
}
