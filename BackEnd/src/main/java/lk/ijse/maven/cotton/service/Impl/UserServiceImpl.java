package lk.ijse.maven.cotton.service.Impl;

import lk.ijse.maven.cotton.entity.User;
import lk.ijse.maven.cotton.repository.UserRepository;
import lk.ijse.maven.cotton.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ireshika Chamini on 9/11/2018.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean canAuthenticate(String userName, String passWord) {
        boolean exists= userRepository.existsById(userName);
        if(!exists){
            return false;
        }
        User user=userRepository.findById(userName).get();
        return user.getPassWord().equals(passWord);

    }
}
