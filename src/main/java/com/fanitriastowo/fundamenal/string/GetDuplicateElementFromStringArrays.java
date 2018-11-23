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
 */
public class GetDuplicateElementFromStringArrays {

  public static void main(String[] args) {
    // String arrays
    String[] stringArrays = {
      "Slipknot",
      "Toolband",
      "Avenged Sevenfold",
      "Metallica",
      "Halloween",
      "Korn",
      "Bullet for my valentine",
      "Korn"
    };

    // convert to List first
    List<String> list = Arrays.asList(stringArrays);

    // empty HashSet object
    Set<String> set = new HashSet<>();

    for (String element : list) {
      boolean flagForDuplication = set.add(element);

      if (!flagForDuplication) {
        System.out.println(element + " is duplicate element");
      }

    }
  }

}
