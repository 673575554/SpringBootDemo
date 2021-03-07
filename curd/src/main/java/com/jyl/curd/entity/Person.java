package com.jyl.curd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

  private String username;
  private String name;
  private long age;
  private String teleno;
  
}
