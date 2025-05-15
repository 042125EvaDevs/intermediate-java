package com.example.bridgepattern;

import com.example.bridgepattern.service.UserService;
import com.example.bridgepattern.service.UserServiceImpl;

public class BridgePattern {

  public static void main(String[] args) {

    UserService<?> service = new UserServiceImpl();

  }
}
