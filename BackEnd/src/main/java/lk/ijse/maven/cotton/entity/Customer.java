package lk.ijse.maven.cotton.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Ireshika Chamini on 8/29/2018.
 */
@Entity
public class Customer {
    @Id
    private String custId;
    private String custName;
    private String email;
    private String address;
    private String age;
    private String contactNo;

    public Customer() {
    }

    public Customer(String custId, String custName, String email, String address, String age, String contactNo) {
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



    @Override
    public String toString() {
        return "Customer{" +
                "custId='" + custId + '\'' +
                ", custName='" + custName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                ", contactNo='" + contactNo + '\'' +
                '}';
    }
}
