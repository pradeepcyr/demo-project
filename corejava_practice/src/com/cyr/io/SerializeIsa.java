package com.cyr.io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeIsa {
	public static void main(String args[]) {
		try {
		Student4 s1 = new Student4(211, "ravi", "Engineering", 50000);
		FileOutputStream fout = new FileOutputStream("f.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.flush();
		out.close();
		System.out.println("success");
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
		Student4 s4 = (Student4) in.readObject();
		System.out.println(s4.id + " " + s4.name + " " + s4.course + " " + s4.fee);
		in.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}