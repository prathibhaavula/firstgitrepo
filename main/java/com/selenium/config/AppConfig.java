package com.selenium.config;

import main/java/com/selenium/config/Test.java;

@Config
public class AppConfig{

  @Autowired
  Test test;

  public static final String constant = db.get(FirestName);

  public void getMethod(){
      test.setFirstName(constant);
      test.getFirstName();
    }
}