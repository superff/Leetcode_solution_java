package questions100;

public class RemoveDuplicatesfromSortedArray {
	
	//O(n) time
	public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
		if(A == null)
			return 0;
		
		if(A.length == 0 || A.length ==1)
			return A.length;
			
		int newIndex = 1;
		int prev = A[0];
		
		for(int i = 1; i< A.length; i++)
		{
			if(A[i] != prev)
			{
				prev = A[i];		
				if(newIndex != i)
				{
					int tmp = A[i];
					A[i] = A[newIndex];
					A[newIndex] = tmp;
				}
				newIndex++;
			}
		}
		return newIndex;
    }
}
