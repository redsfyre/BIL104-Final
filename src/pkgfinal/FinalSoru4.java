/*
 * Copyright (C) 2020 Yasin İsa YILDIRIM
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package pkgfinal;

import java.util.Scanner;

public class FinalSoru4 {
    public static void main(String[] args) {
        Scanner sayiScanner = new Scanner(System.in); //Yeni bir Scanner nesnesi oluştur
        System.out.print("Lütfen pozitif bir doğal sayı giriniz: "); 
        int sayi = sayiScanner.nextInt(); //kuvvetHesapla fonksiyonuna gidecek sayıyı gir
        
        Scanner kuvvetScanner = new Scanner(System.in); //Yeni bir Scanner nesnesi oluştur
        System.out.print("Lütfen kuvvet için pozitif bir doğal sayı giriniz: ");
        int kuvvet = kuvvetScanner.nextInt(); //kuvvetHesapla fonksiyonuna gidecek kuvveti gir
        
        System.out.println(kuvvetHesapla(sayi, kuvvet)); //Fonksiyondan dönen değeri konsola bas
    }
    
    public static int kuvvetHesapla(int sayi, int kuvvet) { 
        int temp; 
        if(kuvvet == 0) 
            return 1; 
        temp = (int) kuvvetHesapla(sayi, kuvvet/2); 
        if (kuvvet%2 == 0) 
            return temp*temp; 
        else
            return sayi*temp*temp; 
    } 
}
