package Object;

import java.io.*;
import java.util.*;

public class SaveAndLoad {
	static Scanner sc = new Scanner(System.in);
	static List<Person2> people = new LinkedList<>();

	public static void main(String[] args) {

		loadData();

		while (true) {
			System.out.println("-----------------------");
			System.out.println("1. 목록조회" + "\t" + "2.추가" + "\t" + "3. 수정" + "\t" + "4. 삭제" + "\t" + "5. 저장 및 종료");
			System.out.println("-----------------------");
			System.out.print("원하시는 기능을 선택해주세요 : ");
			int key = sc.nextInt();
			sc.nextLine(); // 줄바꿈.
			switch (key) {
			case 1:
				printData();
				break;
			case 2:
				insertData();
				break;
			case 3:
				updateData();
				break;
			case 4:
				deleteData();
				break;
			case 5:
				saveData();
				break;
			}
		}
	}

	private static void loadData() {
		System.out.println("저장된 데이터를 불러옵니다..");
		System.out.println("[전화번호부]");
		// 파일 읽어와서
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("peopleDB.bin"))) {
			while (true) {
				try {
					Object obj = ois.readObject();
					people.add((Person2) obj);
				} catch (EOFException e) {
					break;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			File file = new File("peopleDB.bin");
			try {
				file.createNewFile();
			}catch (IOException ex) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void insertData() {
		System.out.println("추가할 인원의 이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("추가할 인원의 전화번호를 입력하세요");
		String phoneNumber = sc.nextLine();
		people.add(new Person2(name, phoneNumber));
	}

	private static void saveData() {
		System.out.println("데이터를 저장하고 종료합니다 . . . ");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("peopleDB.bin"))) {
			for (Person2 p : people) {
				oos.writeObject(p);
			}
			System.out.println("저장완료!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void updateData() {
		// 목록을 보여준 다음
		printData();
		System.out.print("수정하고싶은 데이터의 번호를 입력하세요. : ");
		int num = sc.nextInt() - 1; // 수정할 객체 인덱스
		sc.nextLine();
		Person2 p = people.get(num);
		System.out.println("기존 정보 : " + p.toString());
		System.out.println("수정할 요소를 선택하세요. 1. 이름 2. 전화번호");
		System.out.print(">> ");
		int key = sc.nextInt();
		sc.nextLine();

		switch (key) {
		case 1:
			System.out.println("새로 저장할 이름을 입력하시오 : ");
			String newName = sc.nextLine();
			p.setName(newName);
			break;
		case 2:
			System.out.println("새로 저장할 전화번호를 입력하시오 : ");
			String newPhoneNum = sc.nextLine();
			p.setPhoneNumber(newPhoneNum);
			break;
		case 3:
			break;
		}

//		System.out.println("수정할 이름을 입력하세요 : ");
//		String name = sc.nextLine();
//		System.out.println("수정할 전화번호를 입력하세요 : ");
//		String phoneNumber = sc.nextLine();
//		people.set(num, new Person2(name, phoneNumber)); // 수정
		System.out.println("수정된 정보 : " + p.toString());
		System.out.println("수정완료");
	}

	private static void deleteData() {
		// 목록을 보여준 다음
		printData();
		System.out.print("삭제할 데이터의 번호를 입력하세요. : ");
		int num = sc.nextInt() - 1; // 수정할 객체 인덱스
		sc.nextLine();

		Person2 p = people.remove(num);
		System.out.println("삭제된 정보 :" + p);
		System.out.println("삭제완료.");
	}

	private static void printData() {
		int i = 1;
		for (Person2 p : people) {
			System.out.print(i + ". ");
			i++;
			System.out.println(p);
		}
	}
}
