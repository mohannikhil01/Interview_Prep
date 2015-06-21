package ArraysAndStrings;

/*
 * Algorithm to replace the empty space with %20 in place.
 * Very important. See second implementation. First implementation is not in place. It takes new character array.
 * 
 * **/
public class ReplaceSpaces {

	public String replaceSpaces(char[] ch, int length){
		int newLength = 0, spaceCount = 0;
		for(int i=0;i<length;i++){
			if(ch[i]==' '){
				spaceCount++;
			}
		}
		
		newLength = length + spaceCount*2;
		char[] chNew = new char[newLength];
		for(int i=length-1;i>=0;i--){
			if(ch[i]==' '){
				chNew[newLength-1] = '0';
				chNew[newLength-2] = '2';
				chNew[newLength-3] = '%';
				newLength = newLength -3;
			}
			else{
				chNew[newLength-1] = ch[i];
				newLength = newLength-1;
			}
		}
		
		return new String(chNew);
	}
	
	//Original requirement
	public String replaceStringInPlace(char[] ch,int length){
		int newLength =0, spaceCount =0;
		for(int i=0;i<length;i++){
			if(ch[i]==' ')
				spaceCount ++;
		}
		
		newLength = length + spaceCount * 2;
		ch[newLength] ='\0';
		for(int i=length-1;i>=0;i--){
			if(ch[i]==' '){
				ch[newLength-1] = '0';
				ch[newLength-2] = '2';
				ch[newLength-3] = '%';
				newLength = newLength -3;
			}
			else{
				ch[newLength-1] = ch[i];
				newLength = newLength -1;
			}
		}
		return new String(ch);
	}

}
