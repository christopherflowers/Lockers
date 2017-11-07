package uwstout.cs144.labs.lab07;

import java.util.Arrays;

/**
 * This class tracks a set of lockers and records which of them are rented and
 * for how many more days.
 * 
 * @author FlowersC
 * @version 2016-11-7
 */
public class LockerAccounts {

	private int[] days;

	/**
	 * This constructor creates an array of LockerAccounts.
	 * 
	 * @param numLockers
	 *            this is the amount of lockers
	 */
	public LockerAccounts(int numLockers) {
		if (numLockers < 1) {
			numLockers = 1;
		}
		days = new int[numLockers];
		Arrays.fill(days, -1);
	}

	/**
	 * This getter gets the length of the array.
	 * 
	 * @return the length of the array
	 */
	public int getLockerCount() {
		return days.length;
	}

	/**
	 * This method gets the number of days left on a locker.
	 * 
	 * @param pos
	 *            the position that you want to check
	 * @return how many days left
	 */
	public int getDaysLeft(int pos) {
		if (pos >= 0 && pos < days.length) {
			return days[pos];
		}
		return -1;
	}

	/**
	 * This method checks to see if a specific locker is available.
	 * 
	 * @param pos
	 *            the position that you want to check
	 * @return if the locker is rented or not
	 */
	public boolean isLockerRented(int pos) {
		return pos >= 0 && pos < days.length && days[pos] >= 0;
	}

	/**
	 * This method checks to see if you rent a locker or not.
	 * 
	 * @param pos
	 *            the position that you want to check
	 * @param numDays
	 *            the number of days you want to rent it
	 * @return if you can rent the locker or not
	 */
	public boolean rentLocker(int pos, int numDays) {
		if (pos >= 0 && pos < days.length && numDays >= 1 && days[pos] == -1) {
			days[pos] = numDays;
			return true;

		}

		return false;
	}

	/**
	 * This method updates the days left on each locker.
	 * 
	 */
	public void updateRentals() {

		for (int i = 0; i < days.length; i++) {
			if (days[i] != -1) {
				days[i] -= 1;
			}
		}
	}

	/**
	 * This method gets the number of available lockers.
	 * 
	 * @return the number of available lockers
	 */
	public int getAvailableLockerCount() {
		int lockers = 0;
		for (int i = 0; i < days.length; i++) {
			if (days[i] == -1) {
				lockers++;
			}
		}
		return lockers;
	}

	// WHAT DO I USE FOR THE CONSTRUCTORS PARAMETERS HERE???
	// SOMETHING IS NOT RIGHT WITH THIS WHEN I TEST IT???
	// ADD IN A LINE FEED /N
	/**
	 * This method prints out your results for each locker.
	 * 
	 * @return the information as a string
	 */
	public String toString() {
		String data = "";
		LockerAccounts result;
		result = new LockerAccounts(days.length);

		for (int i = 0; i < days.length; i++) {
			data += "Locker: " + i;
			if (result.isLockerRented(days[i])) {
				data += result.getDaysLeft(days[i]);
			} else {
				data += " Available \n";
			}
		}

		return data;
	}

}
