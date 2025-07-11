package Object;

import java.io.*;
import java.util.*;

public class SaveAndLoad {
	public static void main(String[] args) {
		List<Person2> people = new ArrayList<>();
		
		while(true) {
			insertData(people);
			printData(people);
			saveData(people);
		}
	}
	private static void insertData(List<Person2> people) {
		Scanner sc = new Scanner(System.in);
		System.out.println("추가할 인원의 이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("추가할 인원의 전화번호를 입력하세요");
		String phoneNumber = sc.nextLine();
		people.add(new Person2(name, phoneNumber));
	}
	private static void saveData(List<Person2> people) {
		try(FileWriter writer = new FileWriter("peopleDB.txt")){
			for(Person2 p : people) {
				writer.write(p.getName() + "," + p.getPhoneNumber());
				writer.write(System.lineSeparator());
			}
			System.out.println("저장완료!");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void printData(List<Person2> people) {
		int i=1;
		for(Person2 p : people) {
			System.out.print(i );
			i++;
			System.out.println(p);
		}
	}
}
