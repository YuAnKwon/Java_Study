package ch24;

import java.io.*;

public class exam {
	public static void main(String[] args) {
		try (BufferedInputStream fis = new BufferedInputStream(
				new FileInputStream("C:/Users/codehows/Desktop/다운로드.jpg"));
				BufferedOutputStream fos = new BufferedOutputStream(
						new FileOutputStream("C:/Users/codehows/Desktop/cat.jpg"));) {
			long start = System.nanoTime();
			while (true) {
				int chunck = fis.read();
				if (chunck == -1)
					break;
				fos.write(chunck);
			}
			long end = System.nanoTime();
			System.out.println("걸린 시간 : " + (end - start));

		} catch (FileNotFoundException e) {
			System.err.println("해당 파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.err.println("입출력 중 문제 발생");
		}
	}
}