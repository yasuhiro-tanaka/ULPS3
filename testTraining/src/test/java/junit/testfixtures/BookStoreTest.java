package junit.testfixtures;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

import util.TestResourceManager;

public class BookStoreTest {

	private BookStore target;

	@Before
	public void setUp() throws Exception {
		target = new BookStore();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_add_在庫がない場合に本Aを追加すると返却される在庫リストの要素は本Aのみ() throws Exception {
		//SetUp
		Book book_A = new Book();
		List<Book> expected = new ArrayList<Book>();
		expected.add(book_A);
		//Exercise
		List<Book> actual = target.add(book_A);
		//Verify
		assertThat(actual.size(), is(1));
		assertThat(actual, is(expected));
		//TearDown

	}

	@Test
	public void test_add_本Aが在庫に存在する場合に本Bを追加すると返却される在庫リストの要素は本Aと本B() throws Exception {
		//SetUp
		Book book_A = new Book();
		Book book_B = new Book();
		List<Book> expected = new ArrayList<Book>();
		expected.add(book_A);
		expected.add(book_B);
		//Exercise
		target.add(book_A);
		List<Book> actual = target.add(book_B);
		//Verify
		assertThat(actual.size(), is(2));
		assertThat(actual, is(expected));
		//TearDown

	}

//	@Test
//	public void test_getTotalPrice_本Aの価格が4500の場合は4500を返す() throws Exception {
//		//SetUp
//		Book book = (Book) new Yaml().loadAs(new InputStreamReader(
//				new FileInputStream(new File(TestResourceManager.getPath(
//						"/bookinfo/book_Refactoring.yaml"))), "Shift_JIS"), Book.class);
//		target.add(book);
//		long expected = 4500;
//		//Exercise
//		long actual = target.getTotalPrice();
//		//Verify
//		assertThat(actual, is(expected));
//		//TearDown
//	}

}
