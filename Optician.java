
/**
 * Optician
 * 
 */
public class Optician {
  
  private int primaryID;
  private String opticianName;
  private String address;
  private String postcode;
  private String telephoneNo;
  private Boolean isNHS;
  
    private int gpID = 0;
    private int schoolID = 0;
    private int patientID = 0;
    private int dentistID = 0;

  
  public Optician(int primaryID, String opticianName, String address, String postcode, String telephoneNo, Boolean isNHS) {
    this.primaryID = primaryID;
    this.opticianName = opticianName;
    this.address = address;
    this.postcode = postcode;
    this.telephoneNo = telephoneNo;
    this.isNHS = isNHS;
 }
 
  public Optician(String opticianName, String address, String postcode, String phoneNumber, Boolean isNHS) {
    this.opticianName = opticianName;
    this.address = address;
    this.postcode = postcode;
    this.telephoneNo = telephoneNo;
    this.isNHS = isNHS;
  }
  
  public int getID() {
    return primaryID;
  }
  
  public void setID(int primaryID) {
    this.primaryID = primaryID;
  }
  
 public String getOpticianName() {
        return opticianName;
    }

    public void setOpticianName(String opticianName) {
        this.opticianName = opticianName;
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
    
    
    
 public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }
    
    public Boolean getnhsORprivate() {
        return isNHS;
    }
    public void setIsNHS(Boolean isNHS) {
        this.isNHS = isNHS;
    }
    
    
// Obtaining the ID data from other tables
    public int getGpID() {
        return gpID;
    }

    public void setGpID(int gpID) {
        this.gpID = gpID;
    }

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int dentistID) {
        this.schoolID = dentistID;
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

}