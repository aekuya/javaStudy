package File.����7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.RandomAccessFile;

public class Hi {

	public static void main(String[] args) {
		try {
			// 0= �ؽ�Ʈ���ϸ� , ���μ�
			BufferedReader in = new BufferedReader(new FileReader(args[0]));
			int count=0,num=0;
			try {
				num = Integer.parseInt(args[1]);
			} catch (Exception e) {
				System.out.println("�߸��� ���� �� �Դϴ�.");
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
			System.out.println("�߸��� ���ϸ��Դϴ�.");
		}
	}

}
