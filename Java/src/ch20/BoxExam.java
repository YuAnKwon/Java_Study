package ch20;

class Box<T> {
	private T value;
	private String nameTag;

	public Box(T value, String nameTag) {
		this.value = value;
		this.nameTag = nameTag;
	}

	public T getValue() {
		return value;
	}
	
	public String getNameTag() {
		return nameTag;
	}

}

public class BoxExam {
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<Integer>(10,"숫자상자1"); //T가 Integer로 다 바뀌는거임.
		Box<Double> box2 = new Box<Double>(1.23,"숫자상자2"); // String이 안오면 오류 ! Object는 오류같은거 안줌.
		Box<Long> box3 = new Box<Long>(10L,"숫자상자3"); 
		Box<String> box4 = new Box<String>("10","숫자상자4"); 
		
		doSomething(box1);
		System.out.println(add(10,12.3));
	}
	
	static void doSomething(Box<? extends Number> box) {
		
	}
	
	static <T extends Number> double add(T o1, T o2) {
		return o1.doubleValue() + o2.doubleValue();
	}
}
