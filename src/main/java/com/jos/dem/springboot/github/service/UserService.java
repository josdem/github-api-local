package com.jos.dem.springboot.github.service;

public interface UserService {

  List<SSHKey> getKeys();
  List<PublicEmail> getEmails();

}
