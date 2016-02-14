package junit.testfixtures;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
	/** 保有している本リスト */
	private List<Book> stock;

	public BookStore() {
		stock = init();
	}

	/**
	 * 引数で指定した本を在庫に追加する。
	 * 追加に成功した場合は現在の在庫リストを返す。
	 * @param book
	 * @return
	 */
	public List<Book> add(Book book){
		stock.add(book);
		return stock;
	}

	/**
	 * 在庫の合計価格を返す。
	 * @return
	 */
	public long getTotalPrice(){
		long totalPrice = 0;
		for(Book book : stock){
			totalPrice += book.getPrice();
		}
		return totalPrice;
	}

	/** 在庫の本情報を初期化する */
	List<Book> init(){
		return new ArrayList<Book>();
	}


}
