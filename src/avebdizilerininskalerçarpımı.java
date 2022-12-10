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

public class avebdizilerininskalerçarpımı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("dizilerin eleman sayısını girin:");
        int n = input.nextInt();
        int a[]=new int [n];// n elemanlı a dizisi
        int b[]=new int [n];// n elemanlı b dizisi
        for(int i=0;i<a.length;i++){
        System.out.println(i+"inci indexi giriniz:");
        a[i]=input.nextInt();
        }
        for(int i=0;i<b.length;i++){
        System.out.println(i+"inci indexi giriniz:");
        b[i]=input.nextInt();
        }
        int skaler = 0;
        for (int i =0; i<n; i++) {
         skaler +=a[i]*b[i];
        }
        System.out.println(skaler);

    }
}
