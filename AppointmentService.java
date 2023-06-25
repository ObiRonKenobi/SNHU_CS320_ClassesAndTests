/*
 * Ronald W. Sudol III
 * SNHU CS320
 * Final Project
 * 06/11/2023
 */

package MobileAppClassesAndTests;


//import arrays for storing and searching appointments
import java.util.ArrayList;

//define appointment service class
public class AppointmentService {
	
	// Holds the list of appointments
    private final ArrayList<Appointment> apptList;
    
    //construct new appointment list
    public AppointmentService() {
        
    	// Initialize the appointment list array
        apptList = new ArrayList<>();
    }
    
    // define method for adding appointment if doesn't already exist
    public boolean addAppointment(Appointment appointment) {
       
    	//initialize bool as false, assumes appointment does not exist
    	boolean apptExists = false;
        
    	// check if appointment already exists
        for (Appointment apptObject : apptList) {
            
        	// if appointment in array, return true
            if (apptObject.getId().equals(appointment.getId())) {
            	apptExists = true;
                
            	break;
            }
        }
        
        // If the appointment is not in the array, add it
        if (!apptExists) {
        	apptList.add(appointment);
            
        	// Returns true if the appointment was added
            return true;
        }
        
        // Returns false if the appointment was not added
        return false;
    }
    
 // searches for apppointment by id number
    public Appointment getAppointment(String id) {
        for (Appointment apptObject : apptList) {
            
        	// if object found, return it
            if (apptObject.getId().equals(id)) {
                return apptObject;
            }
        }
        // else return null
        return null;
    }
    
    // Method to delete an appointment by id
    public boolean deleteAppointment(String id) {
        Appointment apptObject = getAppointment(id);
        
        // if appointment found, delete it and return true
        if (apptObject != null) {
            apptList.remove(apptObject);
            return true;
        }
        // else return false
        return false;
    }
	       
}

/*
 * Rip and Tear!
 */