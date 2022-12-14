package com.generator.randomusersgenerator.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/secured", consumes = "application/json")
public class SecuredController {
    @GetMapping
    public String secured(Authentication authentication) {
        return "Principal name -> " + authentication.getName() + ", authorities -> " + authentication.getAuthorities();
    }
}