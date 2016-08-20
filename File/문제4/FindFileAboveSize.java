package File.문제4;

import java.io.File;

/**
 * 해당 디렉토리 아래의 모든 파일들 중 바이트 크기가 입력으로 주어진 파일 크기보다 큰 파일들에 대해, 절대경로와 크기를 출력하는 프로그램
 * 
 * @author 김지원
 *
 */
public class FindFileAboveSize {
	public static void main(String[] args) {
		// 0 = 파일경로 , 1==바이트크기
		int argSize = 0;
		try {
			argSize = Integer.parseInt(args[1]);
		} catch (Exception e) {
			System.out.println("잘못된 파라미터입니다.");
			System.out.println("기본경로로 탐색합니다 [ c:\\ , 0 ]");
		}
		File dir = new File("c:\\");

		for (File file : dir.listFiles()) {// 해당경로 아래에있는내용들을 리스트로 만들어줌
			if (file.isFile())// 파일이라면
				if (file.length() > argSize)
					System.out.println(file.getAbsolutePath() + "\t" + file.length());
		}
	}
}
