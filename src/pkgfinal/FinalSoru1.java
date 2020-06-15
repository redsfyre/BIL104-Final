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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FinalSoru1 {
    
    public static void main(String[] args) {
        try{
            String file = "D:\\ogrenciler.txt";
            String[] words=null;
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            Scanner numaraScanner = new Scanner(System.in); 
            System.out.print("Öğrenci numarası giriniz: ");
            String numaraString = numaraScanner.nextLine();
            int sayac=0;
            String str;
            while((str = br.readLine()) !=null){
                words=str.split(" ");
                for(String word: words){
                    if (word.contains(numaraString)) {
                       sayac++;
                       String[] ogrenci = str.split(";");
                       String sozel = ogrenci[3];
                       System.out.println("Girilen numaraya ait sözel puan: " + sozel);               
                    }
                }
            }
            if(sayac==0){
                System.out.println("Bu öğrenci bulunamadı!");                
            }
            br.close();
        }
        catch (IOException e){
            System.out.println("Dosya okunamıyor!");
        }
    }
}
