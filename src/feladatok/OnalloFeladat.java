/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feladatok;

import java.util.Random;
import java.util.Scanner;


public class OnalloFeladat {

    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in, "latin2");
    
    public static void main(String[] args) {
        System.out.println("1. Feladat");
        int randSzam = rnd.nextInt(3, 11);
        System.out.println("Generált szám: " + randSzam);
        
        System.out.println("");
        
        System.out.println("2. Feladat");
        System.out.print("Adjon meg egy tetszőleges betűt: ");
        String betu = sc.nextLine();
        System.out.println("Tetszőleges betű: " + betu);
        
        System.out.println("");
        
        System.out.println("3. Feladat");
        while (betu.length() > 1) {
            System.out.print("Ez nem egy karakter, adjon meg egy betűt: ");
            betu = sc.nextLine();
        }
        System.out.println("Ez egy karakterű betű!");
        
        System.out.println("");
        
        System.out.println("4. Feladat");
        System.out.println("2. feladat betűje az 1. feladat generált számaszor!");
        for (int i = 0; i < randSzam; i++) {
            if (i < randSzam-1){
                System.out.print(betu + ",");
            } else if (i < randSzam){
                System.out.println(betu + "");
            }
        }
        
        System.out.println("");
        
        System.out.println("5. Feladat");
        System.out.println("Valós tömb elemei: ");
        double[] valosak = new double[5];
        valosak[0] = Math.PI;
        valosak[1] = Math.E;
        
        for (int i = 0; i < valosak.length; i++) {
            System.out.println(valosak[i]);
        }
        
        System.out.println("");
        
        System.out.println("6. Feladat");
        System.out.println("Tömb érték > 0: ");
        valosak[2] = 1.0/3;
        for (int i = 0; i < valosak.length; i++) {
            if ( valosak[i] > 0){
                System.out.println(valosak[i]);
            }
        }
        
        System.out.println("");
        
        System.out.println("7. Feladat");
        System.out.println("Tömb maradék helyek kitöltése: ");
        for (int i = 0; i < valosak.length; i++) {
            valosak[3] = rnd.nextDouble(10.11, 19.51);
            valosak[4] = rnd.nextDouble(10.11, 19.51);
            System.out.println(valosak[i]);
        }
    }
    
}
