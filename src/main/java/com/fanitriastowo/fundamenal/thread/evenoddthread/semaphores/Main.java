/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanitriastowo.fundamenal.thread.evenoddthread.semaphores;

/**
 *
 * @author triastowo
 */
public class Main {

  public static void main(String[] args) {
    SharedPrinter sp = new SharedPrinter();
    Thread odd = new Thread(new Odd(sp, 10), "Odd");
    Thread even = new Thread(new Even(sp, 10), "Even");
    odd.start();
    even.start();
  }
}
