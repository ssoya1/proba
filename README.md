package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


System.out.println(788);
Scanner scanner = new Scanner(System.in);
System.out.println(788);
int dlina, shirina;
System.out.println("A-1, B-2, C-3, D-4, E-5, F-6, G-7, H-8");
System.out.println(" Уведіть координати початкового положення: ");
int x1 = scanner.nextInt();
int y1 = scanner.nextInt();
System.out.println(" Уведіть координати кінцевого положення: ");
int x2 = scanner.nextInt();
int y2 = scanner.nextInt();
dlina = Math.abs(x2 - x1);
shirina = Math.abs(y2 - y1);
if (dlina == 2 && shirina == 1) {
System.out.println(true);
} else if (dlina == 1 && shirina == 2) {
System.out.println(true);
} else {
System.out.println(false);
}
}
}
