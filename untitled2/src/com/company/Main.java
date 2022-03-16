package com.company;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        if ( ( 50 < q ) & ( q < 100 ) ){
            System.out.println("Число:" + q + " міститься в проміжку (50; 100)");
        }else{
            System.out.println("Число:"+ q +" не міститься в проміжку (50; 100)");
        }
    }
}