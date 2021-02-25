package TimeOfDay;


/**
 * Each instance represents the time of the day as two separate integers: hours and minutes.
 * @immutable
 * 
 * @invar The hours integer cannot exceed 24.
 * 		| getHours() <= 24
 * @invar The hours must be non-negative.
 * 		| getHours() >= 0
 * @invar The minutes integer cannot exceed 60.
 * 		| getMinutes() <= 60
 * @invar minutes must be non-negative.
 * 		| getMinutes() >= 0
 */

public class TimeOfDay {

	
	int hours;
	int minutes;
	
	/**
	 * @post The result is not null
	 * 		| result != 0
	 */
	public int getHours() {
		return this.hours;
	}
	 
	 /**
		 * @post The result is not null
		 * 		| result != 0
		 */
	public int getMinutes() {
		return this.minutes;
	}
	
	/**
	 * @basic
	 */
	public boolean isAfternoon() {
		return this.hours>12 ? true : false;
	}
	
	/**
	 * Initializes this object so that it represents the time of the day
	 * @post This interval's lower bound equals the given lower bound.
	 * 		| getHours() == hours
	 * @post This interval's upper bound equals the given lower bound.
	 * 		| getMinutes() == minutes
	 */
	public TimeOfDay(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}
	
	
}

