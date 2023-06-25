/*
 * Ronald W. Sudol III
 * SNHU CS320
 * Final Project
 * 06/11/2023
 */

package MobileAppClassesAndTests;

//import tools
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;

//define class
class AppointmentServiceTest {

	//declare date variables
	Date today = new Date();
	Date future = new Date(today.getTime() + 6048000);
	Date past = new Date(today.getTime() - 6048000);
	
	//add test
	@Test
	void test() {
		
		//Initialize a appointment list
		AppointmentService aList = new AppointmentService();
				
		//create test appointments
		Appointment appt1 = new Appointment("123", future, "This description describes things");
		Appointment appt2 = new Appointment("420", future, "This description is less descriptive");

		// add appointments to list and test for returns true
        assertTrue(aList.addAppointment(appt1));
        assertTrue(aList.addAppointment(appt2));
        
     // tests for return false when trying to add an appointment that already exists
        assertFalse(aList.addAppointment(appt1));
	}
	
	//test for deleting tasks
		@Test
		void testDeleteAppointment() {
			
			//Initialize a task list
			AppointmentService aList = new AppointmentService();
					
			//create test tasks
			Appointment appt1 = new Appointment("123", today, "This description describes things");
			Appointment appt2 = new Appointment("420", today, "This description is less descriptive");
			
			// add test tasks to array
			aList.addAppointment(appt1);
			aList.addAppointment(appt2);
			
			//delete existing task and test for returns true
			assertTrue(aList.deleteAppointment("420"));
			
			//try to delete nonexistent task and test for returns false
			assertFalse(aList.deleteAppointment("1986"));
			
		}

}

/*
 * Rip and Tear!
 */