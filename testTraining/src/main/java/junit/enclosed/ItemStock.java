package junit.enclosed;

import java.util.ArrayList;
import java.util.List;

/**
 * 保有商品の情報を管理する
 * @author yasuhiro.tanaka
 *
 */
public class ItemStock {
	private List<String> items;

	public ItemStock() {
		items = new ArrayList<String>();
	}

	/**
	 * 引数で指定した商品の保有数を返す
	 *
	 * @return
	 */
	public long size(String item) {
		long numOfItem = 0;
		for (String elem : items) {
			if (elem.equals(item)) {
				numOfItem++;
			}
		}

		return numOfItem;
	}

	/**
	 * 引数で指定した商品を追加します。 追加に成功した場合は、追加後の全商品保有数を返します。
	 *
	 * @param item
	 * @return
	 */
	public long add(String item) {
		items.add(item);
		return items.size();
	}

	/**
	 * 引数で指定した商品を保有している場合はtrueを返す
	 *
	 * @param item
	 * @return
	 */
	public boolean contains(String item) {
		return items.contains(item);
	}

}
