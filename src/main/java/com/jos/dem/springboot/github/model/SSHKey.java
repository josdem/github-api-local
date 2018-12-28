package com.jos.dem.springboot.github.model;

public class SSHKey {
  Long id;
  String key;

  public SSHKey(Long id, String key){
    this.id = id;
    this.key = key;
  }

  public Long getId(){
    return id;
  }

  public String getKey(){
    return key;
  }

}

