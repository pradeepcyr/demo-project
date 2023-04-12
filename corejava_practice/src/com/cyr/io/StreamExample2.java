package com.cyr.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamExample2 {
	public static void main(String[] args) throws IOException {
		InputStream input = new FileInputStream("D:\\Pradeep.txt");
		@SuppressWarnings("resource")
		DataInputStream inst = new DataInputStream(input);
		int count = input.available();
		byte[] ary = new byte[count];
		inst.read(ary);
		for (byte bt : ary) {
			char k = (char) bt;
			System.out.print(k + "-");
		}
	}
}
