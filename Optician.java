
import java.sql.*;

/**
* Optician
*
*/

public class Optician {
  
  private int ID;
  private String opticianName;
  private String address;
  private String postcode;
  private String phoneNumber;
  private Boolean nhsORprivate;
  
  public Optician(int ID, String opticianName, String address, String postcode, String phoneNumber, Boolean nhsORprivate) {
    this.ID = ID;
    this.opticianName = opticanName;
    this.address = address;
    this.postcode = postcode;
    this.phoneNumber = phoneNumber;
    this.nhsORprivate = nhsORprivate;
}
  
  public int getID() {
    return ID;
  }
  
  public void setID(int ID) {
    this.ID = ID;
  }
  
  public String opticanName() {
    return opticianName;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public String getPostcode() {
    return postcode;
  }
  
  public String getPhoneNumber() {
    return phoneNumber;
  }
  
  public void setnhsORprivate(Boolean nhsORprivate) {
    this.nhsORprivate = nhsORprivate;
  }
  
}
