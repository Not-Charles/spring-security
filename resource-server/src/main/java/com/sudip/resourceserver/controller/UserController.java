package com.sudip.resourceserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.attribute.UserPrincipal;

@RestController
@RequestMapping("/users")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping
    @PreAuthorize("isAuthenticated()")
    public ResponseEntity<String> getUsers(){
        displayUserName();
        return new ResponseEntity<>("All User",HttpStatus.OK);
    }

    private void displayUserName() {
        logger.info("displaName() : START");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String principal = (String) authentication.getPrincipal();
        System.out.println(principal.toString());
    }

    @GetMapping("/error")
    public ResponseEntity<Void> checkErrorHandeling(){
        int a = 10 /0;
        return null;
    }

    @GetMapping("/secured")
    public ResponseEntity<?>  securedReurce(){
        return new ResponseEntity<>("hy",HttpStatus.OK);
    }
}
