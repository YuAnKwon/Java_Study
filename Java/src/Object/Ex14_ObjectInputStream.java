package Object;

import java.io.*;

public class Ex14_ObjectInputStream {
	public static void main(String[] args) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Object.bin"))){
			Ex12_Unit unit1 = (Ex12_Unit) ois.readObject();
			System.out.println(unit1.getName());
			Ex12_Unit unit2 = (Ex12_Unit) ois.readObject();
			System.out.println(unit2.getName());
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
