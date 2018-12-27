package com.jos.dem.springboot.github.util;

import org.springframework.stereotype.Component;
import com.jos.dem.springboot.github.LabelResponse;

@Component
public class LabelResponseCreator {

  private LabelResponse labelResponse = new LabelResponse(
      1173744717L,
      "MDU6TGFiZWwxMTczNzQ0NzE3",
      "http://localhost:8080/repos/josdem/retrofit-workshop/labels/cucumber",
      "cucumber",
      "ed14c5",
      false);

  public LabelResponse create(){
    return labelResponse;
  }

}
