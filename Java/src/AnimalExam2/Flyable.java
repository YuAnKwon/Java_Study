package AnimalExam2;

public interface Flyable {
	void fly();
	default void hello() {
		System.out.println("hi");
	}
}
