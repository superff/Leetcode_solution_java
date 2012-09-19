package questions100;

public class EditDistance {
	
	public int minDistance(String word1, String word2) {
        // Start typing your Java solution below
        // DO NOT write main() function
		
		
        int[][] matrix = new int[word2.length()+1][word1.length()+1];
        
        matrix[0][0] = 0;
        for(int i =1; i<= word1.length();i++)
        	matrix[0][i] = i;
        
        for(int i =1; i<= word2.length();i++)
        	matrix[i][0] = i;
        
        for(int i = 1; i<= word2.length();i++)
        {
        	for(int j = 1; j<= word1.length() ;j++)
        	{
        		int min = Math.min(matrix[i-1][j-1] + (word1.charAt(j-1) == word2.charAt(i-1)?0 :1), matrix[i-1][j] +1);
        		min = Math.min(min,matrix[i][j-1] +1);
        		matrix[i][j] = min;
        	}
        }
        
        return matrix[word2.length()][word1.length()];
    }
}
