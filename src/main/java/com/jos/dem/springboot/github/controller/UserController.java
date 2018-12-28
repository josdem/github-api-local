package com.jos.dem.springboot.github.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.jos.dem.springboot.github.model.SSHKey;
import com.jos.dem.springboot.github.model.PublicEmail;
import com.jos.dem.springboot.github.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("user")
public class UserController {

  @Autowired
  private UserService userService;

  private Logger log = LoggerFactory.getLogger(this.getClass());

  @RequestMapping(method = GET, value = "/josdem/keys")
  public List<SSHKey> getKeys(){
    log.info("Getting user keys");
    return userService.getKeys();
  }

  @RequestMapping(method = GET, value = "/public_emails")
  public List<PublicEmail> getEmails(){
    log.info("Getting user emails");
    return userService.getEmails();
  }

}
