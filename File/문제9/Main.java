package File.¹®Á¦9;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader[] ins = new BufferedReader[args.length];
		int[] readCount = new int[args.length];

		readCount[0] = 0;
		for (int i = 0; i < readCount.length; i++)
			readCount[i] = 1;

		ins[0] = null;
		for (int i = 0; i < args.length; i++) {
			try {
				BufferedReader in = new BufferedReader(new FileReader(args[i]));
				ins[i] = in;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		while (true) {
			String now = null;
			int sum = 0;

			for (int i : readCount)
				sum += i;

			if (sum == 0)
				break;

			for (int i = 0; i < args.length; i++) {
				try {
					now = ins[i].readLine();
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (now != null)
					System.out.print(now + "\t");
				else
					readCount[i] = 0;
			}
			System.out.println("\n");
		}
	}
}
