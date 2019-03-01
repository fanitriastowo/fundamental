/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanitriastowo.fundamenal.lambda;

import com.fanitriastowo.fundamenal.lambda.interfaces.Foo;

/**
 *
 * @author triastowo
 */
public class StandartFunctionalInterface {

  public String add(String string, Foo foo) {
    return foo.method(string);
  }

  public static void main(String[] args) {

    StandartFunctionalInterface blah = new StandartFunctionalInterface();
    Foo foo = parameter -> parameter + " from lambda";
    blah.add("Message", foo);
  }
}
