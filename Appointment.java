/*
 * Ronald W. Sudol III
 * SNHU CS320
 * Final Project
 * 06/11/2023
 */

package MobileAppClassesAndTests;

//import date tools
import java.util.Date;

//define appointment class
public class Appointment {
	
	//declare variables
	private String apptID;
	private Date apptDate;
	private String apptDescription;
	
	//constructor
	public Appointment(String id, Date date, String description) {
		
		//validate ID
		if (id == null || id.length() >  10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		//validate date
		if (date == null || date.before(new Date())) {
			throw new IllegalArgumentException("Invalid Date");
		}
		
		//validate description
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
		//if valid, then create
		apptID = id;
		apptDate = date;
		apptDescription = description;
	}
	
	//getters
	public String getId() {
		return apptID;
	}
	public Date getDate() {
		return apptDate;
	}
	public String getDescription() {
		return apptDescription;
	}

}

/*
 * Rip and Tear!
 */