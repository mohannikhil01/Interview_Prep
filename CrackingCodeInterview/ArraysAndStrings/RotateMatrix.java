package ArraysAndStrings;


/**
 * Algorithm to rotate the matrix 90 degress in place.
 * 
 * */
public class RotateMatrix {
	
	public void rotateMatric(int n){
		int[][] matrix = new int[n][n];
		int count = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				matrix[i][j] = count;
				count++;
			}
		}
		
		for(int layer=0;layer < n/2;++layer){
			int first = layer;
			int last = n - 1 - layer;
			for(int i=first; i< last; ++i){
				int offset = i - first;
				
				//save top
				int top = matrix[first][i];
				
				// Move left to top
				matrix[first][i] = matrix[last-offset][first];
				
				//Move bottom to left
				matrix[last-offset][first] = matrix[last][last-offset];
				
				//Move right to bottom
				matrix[last][last-offset] = matrix[i][last];
				
				matrix[i][last] = top;
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
