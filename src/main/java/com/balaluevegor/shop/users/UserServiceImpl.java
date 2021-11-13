package com.balaluevegor.shop.users;

import com.balaluevegor.shop.rest.dto.orderReq.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Autowired
    private UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity addUser(User user) {
        if(!userRepository.existsByNumber(user.getNumber())){
            UserEntity userEntity = new UserEntity();
            userEntity.setName(user.getName());
            userEntity.setNumber(user.getNumber());
            userRepository.saveAndFlush(userEntity);
        }
        return userRepository.findUserEntityByNumber(user.getNumber());
    }
}
