/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zahra230922;

/**
 *
 * @author HP
 */
public class latihan_12 {
    public static void main( String[] args ){ 
  
     int number1 = 10;
  int number2 = 23;
  int number3 = 5;
  int answer = 23;
  int hasil;
  hasil = (number1>=number2)?number1:number2;
  hasil =(number3>=hasil)?number3:hasil;
 
 

  System.out.println("Number1 =" + number1);
  System.out.println("Number2 =" + number2);
  System.out.println("Number3 =" + number3);
  System.out.println("Nilai tertingginya adalah angka =" +hasil);
    }
}
