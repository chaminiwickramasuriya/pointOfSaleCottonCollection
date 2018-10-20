package lk.ijse.maven.cotton.controller;

import lk.ijse.maven.cotton.dto.UserDTO;
import lk.ijse.maven.cotton.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ireshika Chamini on 9/11/2018.
 */
@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "api/v1/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public  boolean canAuthenticate(@RequestBody UserDTO user){
        return userService.canAuthenticate(user.getUserName(),user.getPassWord());
    }
}
