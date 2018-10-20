package lk.ijse.maven.cotton.dto;

/**
 * Created by Ireshika Chamini on 9/11/2018.
 */
public class UserDTO {

    private  String userName;
    private String passWord;

   public UserDTO() {
    }

    public UserDTO(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


}
