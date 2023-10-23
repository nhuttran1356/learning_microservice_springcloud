package com.nhuttran.microservice_2.ui.controller;

import com.nhuttran.microservice_2.ui.model.CreateUserResponeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private Environment env;

    @GetMapping("/status/check")
    public String status(){
        return "Working on port" + env.getProperty("local.server.port");
    }

//    public ResponseEntity<CreateUserResponeModel> createUser(@RequestBody CreateUserResponeModel userDetails)
//    {
//        ModelMapper modelMapper = new ModelMapper();
//        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//
//        UserDto userDto = modelMapper.map(userDetails, UserDto.class);
//
//        UserDto createdUser = usersService.createUser(userDto);
//
//        CreateUserResponseModel returnValue = modelMapper.map(createdUser, CreateUserResponseModel.class);
//
//        return ResponseEntity.status(HttpStatus.CREATED).body(returnValue);
//    }
}
