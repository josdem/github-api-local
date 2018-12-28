package com.jos.dem.springboot.github.model;

public class PublicEmail {
  private String email;
  private boolean verified;
  private boolean primary;
  private String visibility;

  public PublicEmail(String email, boolean verified, boolean primary, String visibility){
    this.email = email;
    this.verified = verified;
    this.primary = primary;
    this.visibility = visibility;
  }

  public String getEmail(){
    return email;
  }

  public boolean isVerified(){
    return verified;
  }

  public boolean isPrimary(){
    return primary;
  }

  public String getVisibility(){
    return visibility;
  }

}

