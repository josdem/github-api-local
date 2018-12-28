package com.jos.dem.springboot.github.service.impl;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.jos.dem.springboot.github.model.SSHKey;
import com.jos.dem.springboot.github.model.PublicEmail;
import com.jos.dem.springboot.github.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  public List<SSHKey> getKeys(){
    return Arrays.asList(
        new SSHKey(1L, "Key1"),
        new SSHKey(2L, "Key2"),
        new SSHKey(3L, "Key3"),
        new SSHKey(4L, "Key4")
    );
  }

  public List<PublicEmail> getEmails(){
    return Arrays.asList(
      new PublicEmail("joseluis.delacruz@gmail.com", true, true, "public")
    );
  }

}
