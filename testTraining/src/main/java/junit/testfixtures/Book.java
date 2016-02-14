package junit.testfixtures;

public class Book {
	private String title;
	private int price;
	private Author author;

	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title セットする title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price セットする price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return author
	 */
	public Author getAuthor() {
		return author;
	}

	/**
	 * @param author セットする author
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}

}
