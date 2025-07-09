package ch21;

import java.util.HashMap;

public class Ex14_HashMap {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		
		map.put("홍길동","010-2211-4454");
		map.put("전우치","010-4555-6666");
		map.put("손오공","010-2345-7777");
		
		System.out.println("홍길동 : " + map.get("홍길동"));
		System.out.println("전우치 : " + map.get("전우치"));
		System.out.println("손오공 : " + map.get("손오공"));
		
		map.remove("손오공");
		
		System.out.println("손오공 : " + map.get("손오공"));
	}
}
