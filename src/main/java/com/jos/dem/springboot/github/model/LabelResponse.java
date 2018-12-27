package com.jos.dem.springboot.github.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LabelResponse {
  private Long id;

  @JsonProperty("node_id")
  private String nodeId;

  private String url;
  private String name;
  private String color;

  @JsonProperty("default")
  private boolean status;

  public LabelResponse(Long id, String nodeId, String url, String name, String color, boolean status){
    this.id = id;
    this.nodeId = nodeId;
    this.url = url;
    this.name = name;
    this.color = color;
    this.status = status;
  }

  public String getColor(){
    return color;
  }

  public String getName(){
    return name;
  }

}


