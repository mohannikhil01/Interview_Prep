package ArraysAndStrings;

public class MakeMatrixZero {
	
	public int[][] makeMatrixZero(int[][] matrix){
		int[] storeRow = new int[matrix.length];
		int[] storeColumn = new int[matrix[0].length];
		
		for(int i=0;i<matrix.length;i++){						// We cannot directly make elements zero during our first traversal because that would
																// eventually make the whole matrix zero.
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j] == 0){
					storeRow[i] = 1;
					storeColumn[j]=1;
				}
			}
		}
		
		for(int i=0;i<matrix.length;i++){
			if(storeRow[i]==1){
				matrix = makeRowZero(matrix,i);
			}
		}
			
		for(int j=0;j<matrix[0].length;j++){
			if(storeColumn[j]==1){
				matrix = makeColumnZero(matrix,j);
			}
		}
		return matrix;
	}

	public int[][] makeRowZero(int[][] matrix, int zero){
		for(int i=0;i<matrix[0].length;i++){    			// You can be mistaken here by writing matrix.length for row. 
															// But check that it is the row you are considering but the change is actually made to column values.
			matrix[zero][i]=0;
		}
		return matrix;
	}

	public int[][] makeColumnZero(int[][] matrix, int zero){
		for(int i=0;i<matrix.length;i++){						// Same here. Be careful.
			matrix[i][zero]=0;
		}
		return matrix;
	}

}
