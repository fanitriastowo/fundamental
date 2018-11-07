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
public class Main {

  /**
   * The first thread will be the odd thread, hence we pass false as the value of the parameter
   * isEvenNumber. For the second thread, we pass true instead. We set the maxValue to 10 for both
   * threads, so that only the numbers from 1 through 10 are printed. We then start both the threads
   * by calling the start() method. This will invoke the run() method of both threads as defined
   * above wherein we check if the number is odd or even and print them.
   *
   * When the odd thread starts running, the value of the variable number will be 1. Since it is
   * less than the maxValue and the flag isEvenNumber is false, printOdd() is called. In the method,
   * we check if the flag isOdd is true and while it is true we call wait(). Since isOdd is false
   * initially, wait() is not called, and the value is printed.
   *
   * We then set the value of isOdd to true, so that the odd thread goes into the wait state and
   * call notify() to wake up the even thread. The even thread then wakes up and prints the even
   * number since the odd flag is false. It then calls notify() to wake up the odd thread.
   *
   * The same process is carried out until the value of the variable number is greater than the
   * maxValue.
   */
  public static void main(String[] args) {
    Printer printer = new Printer();
    Thread t1 = new Thread(new TaskEvenOdd(printer, 10, false), "Odd");
    Thread t2 = new Thread(new TaskEvenOdd(printer, 10, true), "Even");
    t1.start();
    t2.start();
  }
}
