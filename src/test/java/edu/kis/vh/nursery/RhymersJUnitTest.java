package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RhymersJUnitTest {

	DefaultCountingOutRhymer rhymer;
	int testValue;
	int result;

	@Before
	public void setUp (){
		rhymer = new DefaultCountingOutRhymer();
		testValue=4;
	}

	@Test
	public void testCountIn() {

		rhymer.countIn(testValue);

		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		boolean result = rhymer.callCheck();
		Assert.assertEquals(true, result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertEquals(false, result);
			rhymer.countIn(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeekaboo() {
		final int EMPTY_STACK_VALUE = -1;

		result = rhymer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		rhymer.countIn(testValue);

		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
		final int EMPTY_STACK_VALUE = -1;

		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);


		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
}
