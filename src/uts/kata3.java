/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author LENOVO
 */
public class kata3 {                     //calculateAverage
     public static double find_average(int[] array) {
    if (array.length == 0) {
      return 0; 
    }
    
    int sum = 0;
    for (int num : array) {
      sum += num; 
    }
    
    return (double) sum / array.length; 
  }
  
  public static void main(String[] args) {
   
    int[] numbers = {1, 2, 3, 4, 5, 6, 7};
    double average = find_average(numbers);
    System.out.println("Average: " + average);
  }
}


