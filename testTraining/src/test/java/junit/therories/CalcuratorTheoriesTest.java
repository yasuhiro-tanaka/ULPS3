package junit.therories;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import junit.tutorial.Calcurator;

@RunWith(Theories.class)
public class CalcuratorTheoriesTest {
	private Calcurator target;

	@Before
	public void setUp() throws Exception {
		target = new Calcurator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@DataPoints
	public static int[][] TEST_INPUT_VALUES = {
			// { arg1, arg2, expected }
			{ 0, 0, 0 },
			{ 0, 1, 1 },
			{ 1, 0, 1 },
			{ 3, 4, 7 }, };

	@Theory
	public void test_add(int[] inputValues) throws Exception {
		// SetUp
		int expected = inputValues[2];
		// Exercise
		int actual = target.add(inputValues[0], inputValues[1]);
		// Verify
		assertThat(actual, is(expected));
		System.out.println("test Calcurator.add( int x, int y )"
		+ "[ x = " + inputValues[0] + ", y = " + inputValues[1]
		+ ", actual = " + actual + " expected = " + expected + " ]");
		// TearDown

	}

}
