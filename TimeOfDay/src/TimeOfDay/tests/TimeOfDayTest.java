package TimeOfDay.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import TimeOfDay.TimeOfDay;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay myTime = new TimeOfDay(13, 45);
		assertEquals(13, myTime.getHours());
		assertEquals(45, myTime.getMinutes());
	}

}
