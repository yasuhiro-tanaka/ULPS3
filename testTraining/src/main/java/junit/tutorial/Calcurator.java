package junit.tutorial;

/**
 * 数値演算を行う
 * @author yasuhiro.tanaka
 *
 */
public class Calcurator {

	/**
	 * x と yの加算結果を返します。
	 * @param x
	 * @param y
	 * @return
	 */
	public int add(int x, int y){
		return x + y;
	}

	/**
	 * x と y の乗算結果を返します。
	 *
	 * @param x
	 * @param y
	 * @return x*y
	 */
	public int multiply(int x, int y) {
		return x * y;
	}

	/**
	 * x と y の除算結果を返します。
	 *
	 * @param x
	 * @param y
	 * @return x/y
	 * @throws Throwable
	 */
	public double divide(double x, double y) throws IllegalArgumentException {
		if (y == 0) {
			throw new IllegalArgumentException("ゼロ除算です。[y=" + y + "]");
		}
		return x / y;
	}

}
