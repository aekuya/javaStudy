package File.문제7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.RandomAccessFile;

public class Hi {

	public static void main(String[] args) {
		try {
			// 0= 텍스트파일명 , 라인수
			BufferedReader in = new BufferedReader(new FileReader(args[0]));
			int count=0,num=0;
			try {
				num = Integer.parseInt(args[1]);
			} catch (Exception e) {
				System.out.println("잘못된 라인 수 입니다.");
			}
			
			while (in.readLine() != null)
				count++;
			
			in.close();
			in = new BufferedReader(new FileReader(args[0]));
			
			for(int i=0; i<(count-num); i++)
				in.readLine();
			
			while(true){				
				String line = in.readLine();
				if(line==null) break;
				System.out.println(line);
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("잘못된 파일명입니다.");
		}
	}

}
