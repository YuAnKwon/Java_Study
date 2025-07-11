package ch24;

import java.io.*;

public class Ex04_FileRead {
	public static void main(String[] args)
    {
    	//한글 내용
        try (InputStream in = new FileInputStream("text.txt"))
        {
            while(true) {
            	int dat = in.read();
            	if(dat == -1) break;
            	System.out.print((char)dat);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
