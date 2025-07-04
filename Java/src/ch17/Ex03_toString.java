package ch17;

public class Ex03_toString {
	public static void main(String[] args) {
		Book3 myBook = new Book3();
		Book3 myBook2 = new Book3();

		myBook.author = "홍길동";
		myBook.title = "홍길동전";
		myBook.store = "교보문고";

		myBook2.author = "홍길동";
		myBook2.title = "홍길동전";
		myBook2.store = "예스24";
		System.out.println(myBook.author);
		if(myBook.equals(myBook2)) {
			System.out.println("같은 책입니다.");
		}
	}
}

class Book3 {
	String author;
	String title;
	String store;

	@Override
	public String toString() {
		return author;
	}

	/* Book3 타입은 저자(author)와 제목(title)이 같으면 같은걸로 본다. */
	@Override
	public boolean equals(Object obj) {
		Book3 other = (Book3) obj;
		if (this.title.equals(other.title) && this.author.equals(other.author)) {
			return true;
		}
		return false;
	}
}
