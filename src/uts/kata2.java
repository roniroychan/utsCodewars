/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author LENOVO
 */
public class kata2 {                      //Will You Make It
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
    double maxDistance = mpg * fuelLeft; 
    return maxDistance >= distanceToPump; 
  }
  
  public static void main(String[] args) {
    double distanceToPump = 50.0; 
    double mpg = 25.0; 
    double fuelLeft = 2.0; 

    
    boolean canReachPump = zeroFuel(distanceToPump, mpg, fuelLeft);
    
    
    if (canReachPump) {
      System.out.println("It is possible to get to the pump!");
    } else {
      System.out.println("It is not possible to get to the pump.");
    }
  }
}

