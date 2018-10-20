package lk.ijse.maven.cotton.dto;

/**
 * Created by Ireshika Chamini on 10/3/2018.
 */
public class ContactDTO {
    private int mailId;
    private String email;
    private String subject;
    private String message;

    public ContactDTO() {
    }

    public ContactDTO(int mailId, String email, String subject, String message) {
        this.mailId = mailId;
        this.email = email;
        this.subject = subject;
        this.message = message;
    }
    public ContactDTO(int mailId, String email, String message) {
        this.mailId = mailId;
        this.email = email;
        this.message = message;
    }
    public ContactDTO(String email, String subject, String message) {
        this.email = email;
        this.subject = subject;
        this.message = message;
    }
    public ContactDTO(String email, String message) {
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
}
