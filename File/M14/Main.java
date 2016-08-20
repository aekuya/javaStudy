package File.M14;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream(args[0]);
			FileOutputStream out = new FileOutputStream(args[0]+".copy");
			while(true){
				int data=in.read();
				if(data==-1) break;
				out.write((byte)data);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
