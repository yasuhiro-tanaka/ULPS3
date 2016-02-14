package junit.categories;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SlowAndFastTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_fastTest_01() throws Exception {
		//SetUp
		//Exercise
		//Verify
		//TearDown

	}

	@Test
	@Category(SlowTests.class)
	public void test_slowTest_01() throws Exception {
//		fail();

	}

	@Test
	@Category(SlowTests.class)
	public void test_slowTest_02() throws Exception {
//		fail();

	}
}
