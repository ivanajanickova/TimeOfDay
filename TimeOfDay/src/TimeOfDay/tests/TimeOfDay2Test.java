package TimeOfDay.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import TimeOfDay.TimeOfDay;
import TimeOfDay.TimeOfDay2;

class TimeOfDay2Test {

	@Test
	void test() {
		TimeOfDay2 myTime = new TimeOfDay2(13, 45);
		assertEquals(13, myTime.getHours());
		assertEquals(45, myTime.getMinutes());
		myTime.setHours(12);
		assertEquals(12, myTime.getHours());
		myTime.setMinutes(50);
		assertEquals(50, myTime.getMinutes());
	}
}
