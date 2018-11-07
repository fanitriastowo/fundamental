/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanitriastowo.fundamenal.thread.evenoddthread.waitnotify;

/**
 *
 * @author triastowo
 */
public class TaskEvenOdd implements Runnable {

  private int max;
  private Printer printer;
  private Boolean isEvenNumber;

  public TaskEvenOdd(Printer printer, int max, Boolean isEvenNumber) {
    this.max = max;
    this.printer = printer;
    this.isEvenNumber = isEvenNumber;
  }

  @Override
  public void run() {

    int number = isEvenNumber ? 2 : 1;
    while (number <= max) {
      if (isEvenNumber) {
        printer.printEven(number);
      } else {
        printer.printOdd(number);
      }
      number += 2;
    }

  }

}
