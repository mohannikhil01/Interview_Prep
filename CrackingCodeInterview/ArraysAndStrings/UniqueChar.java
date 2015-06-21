package ArraysAndStrings;

/**
 * Algorithm to determine if a string has all unique characters.
 * 
 * */
public class UniqueChar {
	
	public static void main(String as[]){
		
		checkUniqueCharacters(as[1]);
	}
	
	public static boolean checkUniqueCharacters(String s){
		if(s.length() > 128)
			return false;
		int[] array = new int[128];
		for(int i=0;i<s.length();i++){
			int val = s.charAt(i);
			if(array[val]==1)
				return false;
			else{
				array[val]=1;
			}
		}
		return true;
	}

}
