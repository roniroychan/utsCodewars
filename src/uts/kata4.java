/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author LENOVO
 */
public class kata4 {            //if you can't sleep,just count sheep!!
    public static String countingSheep(int num) {
    StringBuilder sheepCount = new StringBuilder();
    for (int i = 1; i <= num; i++) {
      sheepCount.append(i).append(" sheep...");
    }
    return sheepCount.toString();
  }
  
  public static void main(String[] args) {
  
    System.out.println(countingSheep(3));
  }
}

