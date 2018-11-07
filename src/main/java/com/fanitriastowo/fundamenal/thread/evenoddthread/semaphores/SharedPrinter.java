/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanitriastowo.fundamenal.thread.evenoddthread.semaphores;

import java.util.concurrent.Semaphore;

/**
 *
 * @author triastowo
 */
class SharedPrinter {

  private Semaphore semEven = new Semaphore(0);
  private Semaphore semOdd = new Semaphore(1);

  void printEvenNum(int num) {
    try {
      semEven.acquire();
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
    System.out.println(Thread.currentThread().getName() + num);
    semOdd.release();
  }

  void printOddNum(int num) {
    try {
      semOdd.acquire();
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
    System.out.println(Thread.currentThread().getName() + num);
    semEven.release();

  }
}

class Even implements Runnable {

  private SharedPrinter sp;
  private int max;

  public Even(SharedPrinter sp, int max) {
    this.sp = sp;
    this.max = max;
  }

  @Override
  public void run() {
    for (int i = 2; i <= max; i = i + 2) {
      sp.printEvenNum(i);
    }
  }
}

class Odd implements Runnable {

  private SharedPrinter sp;
  private int max;

  public Odd(SharedPrinter sp, int max) {
    this.sp = sp;
    this.max = max;
  }

  @Override
  public void run() {
    for (int i = 1; i <= max; i = i + 2) {
      sp.printOddNum(i);
    }
  }
}
