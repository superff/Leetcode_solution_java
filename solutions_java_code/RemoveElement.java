package questions100;

public class RemoveElement {
	/*
	 * Given an array and a value, remove all instances of that value in place
	 * and return the new length.
	 * 
	 * The order of elements can be changed. It doesn't matter what you leave
	 * beyond the new length.
	 */
	
	public int removeElement(int[] A, int elem) {
		// Start typing your Java solution below
		// DO NOT write main() function
		
		if(A == null)
		{
			return 0;
		}
		
		if(A.length == 0)
		{
			return 0;
		}
		
		int newIndex =0;
		
		for(int i =0; i < A.length; i++)
		{
			if(A[i] != elem)
			{
				if(newIndex != i)
				{
					int tmp = A[newIndex];
					A[newIndex] = A[i];
					A[i] = tmp;
				}
				newIndex ++;
			}
		}
		
		return newIndex ;
	}
}
