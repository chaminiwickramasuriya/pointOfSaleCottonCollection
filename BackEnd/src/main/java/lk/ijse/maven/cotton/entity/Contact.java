package lk.ijse.maven.cotton.entity;

import javax.persistence.*;

/**
 * Created by Ireshika Chamini on 10/2/2018.
 */
@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int mailId;
    private String email;
    private String subject;
    private String message;

    public Contact() {
    }


    public Contact(int mailId, String email, String subject, String message) {
        this.mailId=mailId;
        this.email = email;
        this.subject = subject;
        this.message = message;
    }

    public Contact(String email, String subject, String message) {
        this.email = email;
        this.subject = subject;
        this.message = message;
    }

    public Contact(String email, String message) {
        this.email = email;
        this.message = message;
    }


    public int getMailId() {
        return mailId;
    }

    public void setMailId(int mailId) {
        this.mailId = mailId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "mailId=" + mailId +
                ", email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
