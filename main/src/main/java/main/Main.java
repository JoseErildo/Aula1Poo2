package main;

import java.util.Scanner;

public class Main {

    
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("À partir de qual termo?");

        
        Fibonacci fibo = new Fibonacci();
        System.out.println(fibo.getAtual());
    }
}