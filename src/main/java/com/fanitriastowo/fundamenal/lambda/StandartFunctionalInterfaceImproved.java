/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanitriastowo.fundamenal.lambda;

import java.util.function.Function;

/**
 *
 * @author triastowo
 */
public class StandartFunctionalInterfaceImproved {

  public String add(String string, Function<String, String> fn) {
    return fn.apply(string);
  }

  public static void main(String[] args) {
    Function<String, String> fn = parameter -> parameter + " from lambda";

    StandartFunctionalInterfaceImproved blah = new StandartFunctionalInterfaceImproved();
    blah.add("Message", fn);
  }
}
