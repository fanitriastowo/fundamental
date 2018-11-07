/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanitriastowo.fundamenal.thread.evenoddthread.waitnotify;

/**
 * We will use the discussed concepts of synchronization and inter-thread communication to print odd
 * and even numbers in ascending order using two different threads.
 *
 * In the first step, we’ll implement the Runnable interface to define the logic of both threads. In
 * the run method, we check if the number is even or odd.
 *
 * If the number is even, we call the printEven method of the Printer class, else we call the
 * printOdd method:
 *
 * @author triastowo
 */
public class Printer {

  private volatile boolean isOdd;

  synchronized void printEven(int number) {
    while (!isOdd) {
      try {
        wait();
      } catch (InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
    }
    System.out.println(Thread.currentThread().getName() + ":" + number);
    isOdd = false;
    notify();
  }

  synchronized void printOdd(int number) {
    while (isOdd) {
      try {
        wait();
      } catch (InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
    }
    System.out.println(Thread.currentThread().getName() + ":" + number);
    isOdd = true;
    notify();
  }
}
