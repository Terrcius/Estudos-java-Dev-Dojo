package Exercicios.LogicaDeProgramacao.Java;
import java.util.Scanner;
import java.util.function.Function;

public class Exercicio02 {
    public static void parOuImpar (double numero) {
        if (numero % 2 == 0) {
            System.out.println("é um número par");
        }
        else {
            System.out.println("è um número impar");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if (num>=0) {
            parOuImpar(num);
            System.out.println("E ele é um número positivo");
        }
        else {
            parOuImpar(num);
            System.out.println("E ele é um número negativo");
        }
    }
}
