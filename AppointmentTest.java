/*
 * Ronald W. Sudol III
 * SNHU CS320
 * Final Project
 * 06/11/2023
 */

package MobileAppClassesAndTests;

// import tools
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//import date tools
import java.util.Date;

//define test class
class AppointmentTest {
	
	//declare date variables
	Date today = new Date();
	Date future = new Date(today.getTime() + 6048000);
	Date past = new Date(today.getTime() - 6048000);
	
	//define tests
	@Test
	void testAppointment() {
		
		//initialize testable object
		Appointment testAppointment = new Appointment("123", future, "This description describes things");
		
		//test object creation
		assertTrue(testAppointment.getId().equals("123"));
		assertTrue(testAppointment.getDate().equals(future));
		assertTrue(testAppointment.getDescription().equals("This description describes things"));
				
	}
	
	//null tests
	@Test
	void testApptIdNull() {
		//test for null id
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Appointment(null, future, "This description describes things");
		});
	}
	
	@Test
	void testApptDateNull() {
		//test for null date
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Appointment("123", null, "This description describes things");
		});
	}
	
	@Test
	void testApptDescriptionNull() {
		//test for null description
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Appointment("123", future, null);
		});
	}
	
	//too long tests
	@Test
	void testApptIdTooLong() {
		//test for too long id
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Appointment("1234567890987654321", future, "This description describes things");
		});
	}
	
	@Test
	void testApptDescriptionTooLong() {
		//test for too long description
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Appointment("123", future, "This description describes things but it does it with "
					+ "way too many words... like WAY too many words. Certainly a number of words "
					+ "that would be far too long to fit in a 50 character description.");
		});
	}
	
	//invalid date test
	void testApptDateTooLate() {
		//test for past date
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Appointment("123", past, "This description describes things");
		});
	}
	
}

/*
 * Rip and Tear!
 */