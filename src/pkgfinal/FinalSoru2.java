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

import java.util.Random;
import java.util.Scanner;

public class FinalSoru2 {

    public static void main(String[] args) {
        
        boolean run = true;
        
        while (run) {
            Random rand = new Random();
            int sayi = rand.nextInt(6);
            while (sayi<=1) {            
                sayi = rand.nextInt(6);
            }
            int kuvvet = rand.nextInt(5);
            while (kuvvet<=1) {            
                kuvvet = rand.nextInt(5);
            }
            System.out.println(sayi + " üssü " + kuvvet + " kaçtır? ");
            Scanner cevapScanner = new Scanner(System.in); 
            System.out.print(""); 
            int cevap = cevapScanner.nextInt(); 
            if(cevap == (Math.pow(sayi, kuvvet))){
                System.out.println("Tebrikler bildiniz :) ");
            }
            else{
                System.out.println("Bilemediniz :( ");
            }
            System.out.print("Tekrar oynamak istiyor musunuz(e/E)? ");
            Scanner tekrarScanner = new Scanner(System.in);
            String tekrar = tekrarScanner.nextLine();
            
            if(!tekrar.equals("E") & !tekrar.equals("e")){
                run = false;
            }
        
        }

        
    }
    
}
