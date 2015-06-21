package ArraysAndStrings;

/**
 * Algorithm to decide if one is a permutation of another string.
 * */
public class CheckPermutation {
	
	public boolean checkPermutation(String s1, String s2){
		if(s1.length() != s2.length())
			return false;
		return (sortString(s1).equals(sortString(s2)));
	}
	
	public String sortString(String s){
		char[] c = s.toCharArray();
		java.util.Arrays.sort(c);
		/**
		 * The reason that your arr.toString() method returns something like [Cf4e6d is that Object.toString returns
		 * getClass().getName() + '@' + Integer.toHexString(hashCode()). So always use new String(array). And also dont use "==" as it will
		 * test the memory location which is different for two strings as they are immutable.
		 * */
		return new String(c);
	}
	
	
	public boolean checkPermutationUsingArray(String s1,String s2){
		if(s1.length()!=s2.length())
			return false;
		int[] array = new int[128];
		for(int i=0;i<s1.length();i++){
			int val = s1.charAt(i);
			array[val] = array[val] + 1;
		}
		
		for(int i=0;i<s2.length();i++){
			int val = s2.charAt(i);
			if(--array[val]<0)
				return false;
		}
		return true;
	}

}
