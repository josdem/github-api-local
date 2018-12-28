package com.jos.dem.springboot.github.service;

import java.util.List;

import com.jos.dem.springboot.github.model.SSHKey;
import com.jos.dem.springboot.github.model.PublicEmail;

public interface UserService {

  List<SSHKey> getKeys();
  List<PublicEmail> getEmails();

}
