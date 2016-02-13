package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalcuratorTest {
	private Calcurator target;

	@Before
	public void setUp() throws Exception {
		target = new Calcurator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_add_0足す0は0() throws Exception {
		// SetUp
		int expected = 0;
		// Exercise
		int actual = target.add(0, 0);
		// Verify
		assertThat(actual, is(expected));
		// TearDown

	}

	@Test
	public void test_add_0足す1は1() throws Exception {
		// SetUp
		int expected = 1;
		// Exercise
		int actual = target.add(0, 1);
		// Verify
		assertThat(actual, is(expected));
		// TearDown

	}

	@Test
	public void test_add_1足す0は1() throws Exception {
		// SetUp
		int expected = 1;
		// Exercise
		int actual = target.add(1, 0);
		// Verify
		assertThat(actual, is(expected));
		// TearDown

	}

	@Test
	public void test_add_3足す4は7() throws Exception {
		// SetUp
		int expected = 7;
		// Exercise
		int actual = target.add(3, 4);
		// Verify
		assertThat(actual, is(expected));
		// TearDown

	}

	@Test
	public void test_multiply_3掛ける4は12() {
		int expected = 12;
		int actual = target.multiply(3, 4);
		assertThat(actual, is(expected));
	}

	@Test
	public void test_multiply_5掛ける7は35() {
		int expected = 35;
		int actual = target.multiply(5, 7);
		assertThat(actual, is(expected));
	}

	@Test
	public void test_divide_3割る2は1ドット5() throws Throwable {
		double expected = 1.5d;
		double actual = target.divide(3, 2);
		assertThat(actual, is(expected));
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_divide_ゼロ除算はIllegalArgumentException() throws Throwable {
		target.divide(3, 0);
	}

}
