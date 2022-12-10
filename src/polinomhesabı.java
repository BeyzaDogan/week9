/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Excalibur
 */
import java.util.Scanner;

public class polinomhesabı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner(System.in);
      System.out.println("polinom derecesini girin:");
      int n=input.nextInt();
      double a[]=new double[n+1];//polinomlarda n+1 tane terim var
      System.out.println("hesaplanacak x(b)değerini girin:");
      double b=input.nextInt();//math.pow için
      for(int i=0;i<a.length;i++){
      System.out.println(i+"inci indexi girin:");
      a[i]=input.nextDouble();
      }
      double t=a[0];
      for(int i=1;i<a.length;i++){
      t+=a[i]*Math.pow(b,i);}
      System.out.println("polinom sonucu:"+t);
   
      

    
    
}
    }   