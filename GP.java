
import java.sql.*;

/**
 * GP
 *
 */
public class GP {

    private int primaryID;
    private String surgeryName;
    private String address;
    private String postcode;
    private Boolean nhsORprivate;

    private int patientID = 0;
    private int dentistID = 0;
    private int schoolID = 0;
    private int opticianID = 0;

    public GP(int primaryID, String surgeryName, String address, String postcode, Boolean nhsORprivate) {
        this.primaryID = primaryID;
        this.surgeryName = surgeryName;
        this.address = address;
        this.postcode = postcode;
        this.nhsORprivate = nhsORprivate;
    }

    public int getID() {
        return primaryID;
    }

    public void setID(int primaryID) {
        this.primaryID = primaryID;
    }

    public String surgeryName() {
        return surgeryName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setnhsORprivate(Boolean nhsORprivate) {
        this.nhsORprivate = nhsORprivate;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getDentistID() {
        return dentistID;
    }

    public void setDentistID(int dentistID) {
        this.dentistID = dentistID;
    }

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public int getOpticianID() {
        return opticianID;
    }

    public void setOpticianID(int opticianID) {
        this.opticianID = opticianID;
    }

}
