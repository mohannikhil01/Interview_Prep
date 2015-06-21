package ArraysAndStrings;

public class Test {
	
	public static void main(String as[]){
		
		//testUniqueChar("qwertyuiopasdfghjklzxcvbnm.,/1234567890-=`QWERTYUIOPASDFGHJKLZXCVBNM<>?{}");
		//testCheckPermutation();
		//testReplaceSpaces();
		//testStringCompression();
		//testRotateMatrix();
		//testMakeMatrixZero();
		testCheckSubstring();
	}
	
	public static void testUniqueChar(String a){
		UniqueChar u = new UniqueChar();
		System.out.println(u.checkUniqueCharacters(a));
	}
	
	public static void testCheckPermutation(){
		CheckPermutation c = new CheckPermutation();
		System.out.println(c.checkPermutation("  as df gh", "  hgdf  as"));
		System.out.println(c.checkPermutationUsingArray("  as df gh", "  hgdf  as"));
	}
	
	public static void testReplaceSpaces(){
		ReplaceSpaces s = new ReplaceSpaces();
		System.out.println(s.replaceSpaces("s dc sdv sd".toCharArray(), 11));
		System.out.println(s.replaceStringInPlace("s dc sdv sd        ".toCharArray(), 11));
	}
	
	public static void testStringCompression(){
		StringCompression s = new StringCompression();
		System.out.println(s.stringComp("aaadddfffeeeeerrr"));
		System.out.println(s.stringCompressionUsingStringBuffer("aaadddfffeeeeerrr"));
		System.out.println(s.compressUsingCharArray("aaadddfffeeeeerrr"));
	}
	
	public static void testRotateMatrix(){
		RotateMatrix r = new RotateMatrix();
		r.rotateMatric(4);
	}
	
	public static void testMakeMatrixZero(){
		MakeMatrixZero m = new MakeMatrixZero();
		int[][] matrix = new int[4][5];
		int count =1;
		for(int i=0;i<4;i++){
			for(int j=0;j<5;j++){
				matrix[i][j]=count;
				if(i==2 && j==2 || i==3 && j==3){
					matrix[i][j] = 0;
				}
			}
		}
		m.makeMatrixZero(matrix);
		for(int i=0;i<4;i++){
			for(int j=0;j<5;j++){
					System.out.print(matrix[i][j]);
				}
			System.out.println();
			}
		
	}
	
	public static void testCheckSubstring(){
		CheckSubstring c = new CheckSubstring();
		System.out.println(c.checkSubStrings("qwertyuio","yuioqwert"));
	}

}
