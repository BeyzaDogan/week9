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

public class homework4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("dizinin eleman sayısını girin:");
        int n = input.nextInt();
        int[] A = new int[n];
        int p= 0;
        int neg= 0;
        int[]B=new int[n];
        int []C=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(i+".indixi giriniz:");
            A[i] = input.nextInt();
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
            B[p] = A[i];
            p++;
              
            }if (A[i] < 0) {
               
               C[neg] = A[i];
               neg++;
            }}
            for( int i=0;i<B.length;i++){
            System.out.println("pozitifler:"+B[i]);
            }
            for(int i=0;i<C.length;i++){
            System.out.println("negatifler:"+C[i]);
            }

        }

    }


