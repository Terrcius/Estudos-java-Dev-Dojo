package Exercicios.LogicaDeProgramacao.Java;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sucessor = n + 1;
        int antecessor = n - 1;
        System.out.println("antecessor: "+ antecessor);
        System.out.println("sucessor: "+ sucessor);
    }
}
