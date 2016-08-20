package File.문제8;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
	public static void main(String[] args) {
		int count=0;
		try {
			count = Integer.parseInt(args[1]);
		} catch (Exception e) {
			System.out.println("잘못된 열 번호 입니다.");
		}
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(args[0]));
			
			while (true) {
				String line = in.readLine();
				if (line == null)
					break;
				String[] tokens = line.split("\\t");
				if(tokens.length > count){
					System.out.println(tokens[count]);
				}
			}
			in.close();
		} catch (Exception e) {
			System.out.println("잘못된 파일 명입니다.");
			e.printStackTrace();
		}

	}
}
