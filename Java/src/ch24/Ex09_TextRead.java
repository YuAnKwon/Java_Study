package ch24;

import java.io.*;

public class Ex09_TextRead {
	public static void main(String[] args) {
		try(Reader in = new FileReader("text.txt")){
			int ch;
			
			while(true) {
				ch = in.read();
				if(ch==-1)
					break;
				System.out.print((char)ch);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
