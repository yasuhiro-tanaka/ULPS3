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
	public void test_divide_3割る2は1点5() {
		double expected = 1.5d;
		double actual = target.divide(3, 2);
		assertThat(actual, is(expected));
	}

}
