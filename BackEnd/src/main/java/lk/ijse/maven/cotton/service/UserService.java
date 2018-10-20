package lk.ijse.maven.cotton.service;

/**
 * Created by Ireshika Chamini on 9/11/2018.
 */
public interface UserService {
    boolean canAuthenticate(String userName, String passWord);
}
