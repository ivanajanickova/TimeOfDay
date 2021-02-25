package TimeOfDay;

/**
 * Each instance represents the time of the day as two separate integers: hours and minutes.
 * @mutable
 * 
 * @invar The hours integer cannot exceed 24.
 * 		| getHours() <= 24
 * @invar The hours must be non-negative.
 * 		| getHours() >= 0
 * @invar The minutes integer cannot exceed 60.
 * 		| getMinutes() <= 60
 * @invar minutes must be non-negative.
 * 		| getMinutes() >= 0
 * 
 */
public class TimeOfDay2 {
	
	
	int minutesSinceMidnight;
	
	/**
	 * @post The result is not null
	 * 		| result != 0
	 */
	public int getHours() {
		return minutesSinceMidnight/60;
	}
	 
	 /**
	  * @post The result is not null		
  * 		| result != 0
	  */
	 
	public int getMinutes() {
		return minutesSinceMidnight - (getHours()*60);
	}
	
	/**
	 * @basic
	 */
	public boolean isAfternoon() {
		return getHours() >12 ? true : false;
	}
	
	/**
	 * @pre The hours are non-negative and not greter than 24.
	 * 		| hours >= 0 && hours <= 24  
	 */
	public void setHours(int hours) {
		minutesSinceMidnight = getMinutes() + hours*60;
	}
	
	/**
	 * @pre The minutes are non-negative and not greater than 60.
	 * 		| minutes >= 0 && minutes <= 60
	 */
	public void setMinutes(int minutes) {
		minutesSinceMidnight = getHours()*60 + minutes;
	}
	/**
	 * Initializes this object so that it represents the time of the day. Internally it is represented by minutes since midnight. 
	 * @post This interval's lower bound equals the given lower bound.
	 * 		| getHours() == hours
	 * @post This interval's upper bound equals the given lower bound.
	 * 		| getMinutes() == minutes
	 */
	public TimeOfDay2(int hours, int minutes) {
		minutesSinceMidnight = hours*60 + minutes;
	}
}
