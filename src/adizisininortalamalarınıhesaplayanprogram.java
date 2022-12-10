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

public class adizisininortalamalarınıhesaplayanprogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        Scanner input = new Scanner(System.in);
        System.out.println("dizinin eleman sayısını girin:");
        int n = input.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < A.length; i++) {
        System.out.println(i+"inci indexi girin:");
        A[i] =input.nextInt();}
        int t = 0;//toplam için
        int c = 1;//çarpım için
        int t1 = 0;// a[i]nin karelerinin toplamı için
        int h = 0;//a[i] nin 1 ile bölümü şeklindeki durumunun toplamı için
        for (int i = 0; i < A.length; i++) {
            t += A[i];
            c *= A[i];
            h += 1 / A[i];
            t1 += A[i] * A[i];
        }
        double ao = t / n;
        double go = Math.pow(c,1/n);
        double ho = n / h;
        double kho = t1 / t;
        System.out.println("aritmetik ortalaması:" + ao + " geometrik ortalaması:" + go + " harmonik ortalaması:" + ho + " kontraharmonik ortalaması:" + kho);
    }

}
