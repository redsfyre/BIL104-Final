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


public class FinalSoru3 {

    public static String dortIslemHesapla(String ...islem) {
        for (String s : islem) {
            String sayi1 = "", sayi2 = "";
            int count = 0;
            char operation = 'x';

            for(int i = 0; i < s.length(); i++) {
                if (count == 0) {
                    if (s.charAt(i) != '+' && s.charAt(i) != '-' && s.charAt(i) != '*'
                            && s.charAt(i) != '/') {
                        sayi1 += s.charAt(i);
                    } else {
                        operation = s.charAt(i);
                        count ++;
                    }
                }

                else {
                    sayi2 += s.charAt(i);
                }
            }
            int sayi11 = Integer.parseInt(sayi1);
            int sayi22 = Integer.parseInt(sayi2);

            switch(operation) {
                case '+':
                    System.out.println(sayi1 + " " + operation + " " + sayi2 + " = " + (sayi11 + sayi22));
                    break;
                case '-':
                    System.out.println(sayi1 + " " + operation + " " + sayi2 + " = " + (sayi11 - sayi22));
                    break;
                case '*':
                    System.out.println(sayi1 + " " + operation + " " + sayi2 + " = " + (sayi11 * sayi22));
                    break;
                case '/':
                    System.out.println(sayi1 + " " + operation + " " + sayi2 + " = " + (sayi11 / sayi22));
            }

        }

        return "";
    }

    public static void main(String[] args) {
        dortIslemHesapla("10+20", "50-90", "1000-1");

    }
}