/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author LENOVO
 */
public class kata5 {          //Are You Playing Banjo?
    
public static String areYouPlayingBanjo(String name) {
    
    if (name.startsWith("R") || name.startsWith("r")) {
      return name + " plays banjo";
    } else {
      return name + " does not play banjo";
    }
  }
  
  public static void main(String[] args) {
    
    System.out.println(areYouPlayingBanjo("Robert"));
    System.out.println(areYouPlayingBanjo("alice"));
  }
}

