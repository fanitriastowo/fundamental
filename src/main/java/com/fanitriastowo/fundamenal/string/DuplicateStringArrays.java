/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanitriastowo.fundamenal.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author triastowo
 * 
 * check wheter there is any duplication or not
 */
public class DuplicateStringArrays {

  public static void main(String[] args) {

    // String arrays
    String[] stringArrays = {
      "Slipknot",
      "Toolband",
      "Avenged Sevenfold",
      "Metallica",
      "Halloween",
      "Korn",
      "Bullet for my valentine"
    };

    // First convert to List
    List<String> list = Arrays.asList(stringArrays);

    // then convert to Set
    Set<String> set = new HashSet<>(list);

    // check String Arrays length and HashSet size
    int stringArrayLength = stringArrays.length;
    int setSize = set.size();

    if (stringArrayLength >= setSize) {
      System.out.println("Duplicate element/objects"
              + " present in original String Arrays");
    } else {
      System.out.println("There are NO duplicates"
              + " in original String Arrays");
    }
  }
}
