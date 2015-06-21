package ArraysAndStrings;


/**
 * 
 * Algorithm to compress a string given in the format "aaaaggggghhhhhcccccc". There is no requirement of sorting. Just casually did it.
 * 
 * */


class StringCompression{
	
	//Below method is a bad one as it takes O(n2) because string is immutable and every time new string is created. This is important.
	//In this method we have also not considered the compressed string being more than the original string size.
	public String stringComp(String s){
		int length = s.length();
		char[] ch = s.toCharArray();
		java.util.Arrays.sort(ch);
		char c = ch[0];
		int count=0;
		String str = "";
		for(int i=0;i<length;i++){
			if(ch[i]==c){
				count++;
				continue;
			}
			str = str + (String.valueOf(c)+String.valueOf(count));
			c = ch[i];
			count =1;
		}
		return str+c+count;
	}
	
	//Second method using StringBuffer
	public String stringCompressionUsingStringBuffer(String s){
		// Compare the size of the compressed string and original string
		if(checkSizeOfCompressedString(s))
			return s;
		char last = s.charAt(0);
		int count = 1;
		StringBuffer mystr = new StringBuffer();
		for(int i=1;i<s.length();i++){
			if(s.charAt(i) == last){
				count++;
			}
			else{
				mystr.append(last);
				mystr.append(String.valueOf(count));
				last = s.charAt(i);
				count = 1;
			}
		}
		
		mystr.append(last);
		mystr.append(count);
		return mystr.toString();
		
	}

	public boolean checkSizeOfCompressedString(String s){
		int orginalSize = s.length();
		int compressedSize = 0;
		char last = s.charAt(0);
		int count = 1;
		for(int i=1;i<s.length();i++){
			if(s.charAt(i) == last){
				count++;
			}
			else{
				compressedSize = compressedSize + String.valueOf(count).length() + 1;
				count = 1;
				last = s.charAt(i);
			}
		}
		
		compressedSize = compressedSize + String.valueOf(count).length() + 1; // This is for the last element which is not counted.
		System.out.println("Size of the compressed string : "+compressedSize);
		if(compressedSize > orginalSize)
			return true;
			
		return false;
	}
	
	// Third method to solve it using char array.
	public String compressUsingCharArray(String s){
		//Check if the compressed string is bigger than original string
		int originalSize = s.length();
		int compressedSize =  compressedStringSize(s);
		if(compressedSize > originalSize)
			return s;
		
		char[] newChar = new char[compressedSize];
		int count = 1;
		int newArrayCounter = 0;
		char last = s.charAt(0);
		char[] tempChar = new char[10];
		int temp = 0;
		
		for(int i=1;i<s.length();i++){
			if(s.charAt(i)==last){
				count++;
				temp = String.valueOf(count).length();
				tempChar = String.valueOf(count).toCharArray();
			}
			else{
				newChar[newArrayCounter] = last;
				if(temp==1)
					newChar[newArrayCounter+1] = tempChar[0];
				else{
					for(int j=0;j<temp;j++){
						newChar[newArrayCounter + 1] = tempChar[j];
					}
				}
				newArrayCounter = newArrayCounter +2;
				count = 1;
				last = s.charAt(i);
				
			}
		}
		
		newChar[newArrayCounter] = last;
		if(temp==1)
			newChar[newArrayCounter+1] = tempChar[0];
		else{
			for(int j=0;j<temp;j++){
				newChar[newArrayCounter + 1] = tempChar[j];
			}
		}
		
		return new String(newChar);
		
	}

	public int compressedStringSize(String s){
		int compressedSize = 0;
		char[] ch = s.toCharArray();
		char last = ch[0];
		int count = 1;
		for(int i=1;i<s.length();i++){
			if(ch[i]==last){
				count++;
			}
			else{
				compressedSize = compressedSize + String.valueOf(count).length() +1;
				count = 1;
				last = ch[i];
			}
		}
		
		compressedSize = compressedSize + String.valueOf(count).length() + 1; // This is for the last element.
		
		return compressedSize;
	}
}