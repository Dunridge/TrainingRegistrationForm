package com.max.training.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.max.training.dto.UserDTO;
import com.max.training.service.LoginFormService;
import com.max.training.service.RegFormService;

@Slf4j
@RestController
@RequestMapping(value = "/")
public class LoginFromController {
    private final LoginFormService loginFormService;

    @Autowired
    public LoginFromController(LoginFormService loginFormService) {
        this.loginFormService = loginFormService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public void loginFromController(UserDTO user) {
        //you haven't set up lombok correctly
        log.info("{}", user);
    }
}
