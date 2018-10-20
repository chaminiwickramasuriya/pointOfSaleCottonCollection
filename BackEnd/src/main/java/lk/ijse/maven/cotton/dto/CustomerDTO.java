package lk.ijse.maven.cotton.dto;

/**
 * Created by Ireshika Chamini on 8/29/2018.
 */
public class CustomerDTO {
    private String custId;
    private String custName;
    private  String email;
    private String address;
    private String age;
    private String contactNo;


    public CustomerDTO() {
    }

    public CustomerDTO(String custId, String custName, String address, String email, String age, String contactNo) {
        this.custId = custId;
        this.custName = custName;
        this.email = email;
        this.address = address;
        this.age = age;
        this.contactNo = contactNo;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

}
