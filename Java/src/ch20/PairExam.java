package ch20;

class Pair<K,V> {
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return this.key;
	}
	
	public V getValue() {
		return this.value;
	}
	
	@Override
	public String toString() {
		return "Pair[key=" + this.key
				+ ", value=" + this.value + "]";
	}
	
}
public class PairExam {
	public static void main(String[] args) {
		Pair<String, Double> pair1 = new Pair<>("PI", 3.14);
		Pair<Integer, String> pair2 = new Pair<>(1, "One");
		
		System.out.println(pair2);
	}
}