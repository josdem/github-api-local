package com.jos.dem.springboot.github.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.builder.ToStringBuilder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jos.dem.springboot.github.model.Label;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class LabelController {

  private Logger log = LoggerFactory.getLogger(this.getClass());

  @RequestMapping(method = POST, value = "repos/josdem/retrofit-workshop/labels")
  public String create(@RequestBody Label label, HttpServletRequest request){
    log.info("Creating new Label:" + ToStringBuilder.reflectionToString(label));
    log.info("Authorization: " + request.getHeader("Authorization"));
    return "Hello World!";
  }

}
