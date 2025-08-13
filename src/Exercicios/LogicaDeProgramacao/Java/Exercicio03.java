package Exercicios.LogicaDeProgramacao.Java;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;

        if (a == b){
            c = a + b;
            System.out.println(c);
        }
        else{
            c = a * b;
            System.out.println(c);
        }
    }
}
