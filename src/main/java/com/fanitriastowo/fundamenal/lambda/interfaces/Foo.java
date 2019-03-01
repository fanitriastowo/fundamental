/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanitriastowo.fundamenal.lambda.interfaces;

/**
 * use @FunctionalInterface annotation to prevent adding new more method to this class by accident
 *
 * the compiler will tells that this class has more than one method
 *
 * @author triastowo
 */
@FunctionalInterface
public interface Foo {

  String method(String string);
}
