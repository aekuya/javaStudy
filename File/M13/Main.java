package File.M13;

import java.io.FileReader;

public class Main {
	public static void main(String[] args) {
		int lineCount=0;
		int tokenCount=1;
		int charCount=0;
		int data=0;
		int oldData=-1;
		
		try {
			FileReader in = new FileReader(args[0]);
			
			while(true){
				oldData = data;
				data = in.read();
				if(data == -1){
					//글자가 없다면
					if(oldData == -1) tokenCount=0;
				
					break;
				}
				char ch = (char)data;
				charCount++;
				
				if(Character.isSpaceChar(ch));{
					if(Character.isWhitespace(oldData)) tokenCount++;
					if(ch =='\n'){
						//\n을 2글자로 읽음
						tokenCount--;
						charCount--;
						lineCount++;
					}
				}
				
			}
			in.close();
		} catch (Exception e) {
		}
		System.out.println(lineCount+" "+tokenCount+" "+charCount);
	}
}