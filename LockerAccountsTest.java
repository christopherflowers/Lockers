package uwstout.cs144.labs.lab07;

import static org.junit.Assert.*;

//import org.junit.Before;
import org.junit.Test;

/**
 * This class is used to test LockerAccounts
 * 
 * @author FlowersC
 * @version 2016-11-7
 */
public class LockerAccountsTest {

	/**
	 * This tests all of the functions in the other class.
	 * 
	 */
	@Test
	public void testLockerAccounts() {
		LockerAccounts test1 = new LockerAccounts(10);
		assertEquals(10, test1.getLockerCount());
		assertEquals(10, test1.getAvailableLockerCount());
		assertEquals(-1, test1.getDaysLeft(0));
		assertEquals(false, test1.isLockerRented(9));
		assertEquals(true, test1.rentLocker(9, 5));
		assertEquals(9, test1.getAvailableLockerCount());
		System.out.println(test1.toString());

		LockerAccounts test2 = new LockerAccounts(5);
		assertEquals(5, test2.getLockerCount());
		assertEquals(5, test2.getAvailableLockerCount());
		assertEquals(-1, test2.getDaysLeft(0));
		assertEquals(false, test2.isLockerRented(3));
		assertEquals(true, test2.rentLocker(0, 5));
		assertEquals(4, test2.getAvailableLockerCount());
		
		LockerAccounts test3 = new LockerAccounts(30);
		assertEquals(30, test3.getLockerCount());
		assertEquals(30, test3.getAvailableLockerCount());
		assertEquals(-1, test3.getDaysLeft(0));
		assertEquals(false, test3.isLockerRented(10));
		assertEquals(true, test3.rentLocker(0, 20));
		assertEquals(29, test3.getAvailableLockerCount());

	}

}
