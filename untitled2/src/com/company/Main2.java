package com.company;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int w = q %10;
        int r =(q %100- w)/10;
        q = (q - w - r *10)/100;
        if ((w > q) & (w > r)) {
            System.out.println(w);
        }else if (r > q){
            System.out.println(r);
        }else System.out.println(q);
    }
}