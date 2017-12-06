import java.util.Date;

public class Patient {
    private int ID;
    private String fName;
    private String surname;
    private String phone;
    private Date dob;
    private String address;
    private String postcode;
    private String title;
    private int gpID = 0;
    private int dentistID = 0;
    private int schoolID = 0;
    private int opticianID = 0;

    public Patient(int ID, String fName, String surname, String phone, Date dob, String address, String postcode, String title) {
        this.ID = ID;
        this.title = title;
        this.fName = fName;
        this.surname = surname;
        this.phone = phone;
        this.dob = dob;
        this.address = address;
        this.postcode = postcode;
    }

    public Patient(String fName, String surname, String phone, Date dob, String address, String postcode, String title) {
        this.ID = -1;
        this.title = title;
        this.fName = fName;
        this.surname = surname;
        this.phone = phone;
        this.dob = dob;
        this.address = address;
        this.postcode = postcode;
    }


    /*
    public Patient(){
        this.ID = 0;
        this.title = "Mr";
        this.fName = "";
        this.surname = "";
        this.phone = "";
        this.dob = new Date();
        this.address = "";
        this.postcode = "";
    }
    */

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getGpID() {
        return gpID;
    }

    public void setGpID(int gpID) {
        this.gpID = gpID;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
