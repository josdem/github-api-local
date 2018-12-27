package com.example.springbootsetup.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.builder.ToStringBuilder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.springbootsetup.model.Label;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class DemoController {

  private Logger log = LoggerFactory.getLogger(this.getClass());

  @GetMapping("/")
  public String index(){
    return "Hello World!";
  }

  @RequestMapping(method = POST, value = "repos/josdem/retrofit-workshop/labels")
  public String create(@RequestBody Label label, HttpServletRequest request){
    log.info("Label:" + ToStringBuilder.reflectionToString(label));
    log.info("Authorization: " + request.getHeader("Authorization"));
    log.info("Content Type: " + request.getHeader("Content-Type"));
    return "Hello World!";
  }

}
