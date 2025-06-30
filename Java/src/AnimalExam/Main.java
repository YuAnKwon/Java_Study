package AnimalExam;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("바둑이", 10);
		Cat cat = new Cat("나비");
		
		dog.cry();
		dog.sleep();
		cat.cry();
		dog.sleep();
	}
}
