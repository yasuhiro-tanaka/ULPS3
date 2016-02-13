package junit.parameterized;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.tutorial.Calcurator;

@RunWith(Parameterized.class)
public class CalcuratorParameterizedTest {
	private Calcurator target;

	@Before
	public void setUp() throws Exception {
		target = new Calcurator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Parameters(name="test_add_{0}足す{1}は{2}")
	public static Iterable<Object[]> testData(){
		return Arrays.asList(new Object[][]{
			//{ x, y, expected}
			{ 0, 0, 0},
			{ 1, 0, 1},
			{ 0, 1, 1},
			{ 3, 4, 7},
		});
	}

	private final int arg1;
	private final int arg2;
	private final int expected;

	public CalcuratorParameterizedTest(int arg1, int arg2, int expected) {
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.expected = expected;
	}

	@Test
	public void test_add() throws Exception {
		//SetUp
		//Exercise
		int actual = target.add(arg1, arg2);
		//Verify
		assertThat(actual, is(expected));
		//TearDown

	}
}
