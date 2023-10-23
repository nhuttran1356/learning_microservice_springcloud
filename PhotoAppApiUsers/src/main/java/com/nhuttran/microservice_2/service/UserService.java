package com.nhuttran.microservice_2.service;

import com.nhuttran.microservice_2.shared.UserDTO;

public interface UserService {
    UserDTO createUser(UserDTO userDetails);
}
