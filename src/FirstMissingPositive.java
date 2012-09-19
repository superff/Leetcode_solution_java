package questions100;

import java.util.BitSet;

public class FirstMissingPositive {
	public int firstMissingPositive(int[] A) {
		// Start typing your Java solution below
		// DO NOT write main() function

		BitSet bs = new BitSet(A.length + 1);
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] >= 0 && A[i] <= A.length )
			{
				bs.set(A[i]);
			}
		}
		
		for(int i = 1; i<= A.length; i++)
		{
			if(!bs.get(i))
				return i;
		}	
		return A.length+1;
	}
}
