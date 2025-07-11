package Object;

public class Person {
	private String name;
	private String phoneNumber;
	
	private Person(Builder builder) {
		this.name = builder.name;
		this.phoneNumber = builder.phoneNumber;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

	public static class Builder {
		private String name;
		private String phoneNumber;
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder phoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
	}
}