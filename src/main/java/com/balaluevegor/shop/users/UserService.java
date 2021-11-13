package com.balaluevegor.shop.users;

import com.balaluevegor.shop.rest.dto.orderReq.User;

public interface UserService {
    UserEntity addUser(User user);
}
