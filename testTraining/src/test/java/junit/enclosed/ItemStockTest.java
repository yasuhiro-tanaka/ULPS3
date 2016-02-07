package junit.enclosed;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class ItemStockTest {

	public static class 保有商品が0個の場合 {
		ItemStock target;

		@Before
		public void setUp() throws Exception {
			target = new ItemStock();
		}

		@After
		public void tearDown() throws Exception {
		}

		@Test
		public void test_size_0を返す() throws Exception {
			// SetUp
			long expected = 0;
			// Exercise
			long actual = target.size("A");
			// Verify
			assertThat(actual, is(expected));
			// TearDown
		}

		@Test
		public void test_add_商品Aを追加すると1を返す() throws Exception {
			// SetUp
			long expected = 1;
			// Exercise
			long actual = target.add("A");
			// Verify
			assertThat(actual, is(expected));
			// TearDown
		}

		@Test
		public void test_contains_Falseを返す() throws Exception {
			//SetUp
			boolean expected = false;
			//Exercise
			boolean actual = target.contains("A");
			//Verify
			assertThat(actual, is(expected));
			//TearDown

		}
	}

	public static class 商品Aを1個保有している場合 {
		private ItemStock target;

		@Before
		public void setUp() throws Exception {
			target = new ItemStock();
			//商品Aを追加
			target.add("A");
		}

		@After
		public void tearDown() throws Exception {
		}

		@Test
		public void test_size_1を返す() throws Exception {
			//SetUp
			long expected = 1;
			//Exercise
			long actual = target.size("A");
			//Verify
			assertThat(actual, is(expected));
			//TearDown
		}

		@Test
		public void test_add_商品Bを追加すると2を返す() throws Exception {
			//SetUp
			long expected = 2;
			//Exercise
			long actual = target.add("B");
			//Verify
			assertThat(actual, is(expected));
			//TearDown
		}

		@Test
		public void test_contains_商品Aの保有を確認した場合はTrue() throws Exception {
			//SetUp
			boolean expected = true;
			//Exercise
			boolean actual = target.contains("A");
			//Verify
			assertThat(actual, is(expected));
			//TearDown
		}

		@Test
		public void test_contains_商品Bの保有を確認した場合はFalse() throws Exception {
			//SetUp
			boolean expected = false;
			//Exercise
			boolean actual = target.contains("b");
			//Verify
			assertThat(actual, is(expected));
			//TearDown
		}
	}

}
