package hugepark.study.puzzle.chapter01;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Puzzle01Test {

	@Test
	public void bad_negative() {
//		assertTrue(Puzzle01.bad.test(-1));
		assertFalse(Puzzle01.bad.test(-1));
		assertFalse(false);
		assertTrue(true);
		System.out.println("commit test");
		// comment
		// new comment
	}
	
	@Test
	public void bad_negative_even() {
		assertFalse(Puzzle01.bad.test(-2));
	}
	
	@Test
	public void bad_zero() {
		assertFalse(Puzzle01.bad.test(0));
	}
	
	@Test
	public void bad_positive() {
		assertTrue(Puzzle01.bad.test(1));
	}
	
	@Test
	public void bad_positive_even() {
		assertFalse(Puzzle01.bad.test(2));
	}
	
	@Test
	public void good_negative() {
		assertTrue(Puzzle01.good.test(-1));
	}
	
	@Test
	public void good_negative_even() {
		assertFalse(Puzzle01.good.test(-2));
	}
	
	@Test
	public void good_zero() {
		assertFalse(Puzzle01.good.test(0));
	}
	
	@Test
	public void good_positive() {
		assertTrue(Puzzle01.good.test(1));
	}
	
	@Test
	public void good_positive_even() {
		assertFalse(Puzzle01.good.test(2));
	}
	
	@Test
	public void better_negative() {
		assertTrue(Puzzle01.better.test(-1));
	}
	
	@Test
	public void better_negative_even() {
		assertFalse(Puzzle01.better.test(-2));
	}
	
	@Test
	public void better_zero() {
		assertFalse(Puzzle01.better.test(0));
	}
	
	@Test
	public void better_positive() {
		assertTrue(Puzzle01.better.test(1));
	}
	
	@Test
	public void better_positive_even() {
		assertFalse(Puzzle01.better.test(2));
	}
}
