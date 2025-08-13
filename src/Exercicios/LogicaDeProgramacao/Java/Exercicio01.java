package Exercicios.LogicaDeProgramacao.Java;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int soma = A+B;
        if (soma < C) {
            System.out.println("A soma de A + B é: " + soma + " e a soma é menor que C");
        }
        else {
            System.out.println("A soma de A + B é: " + soma + " e a soma é maior ou igual a C");
        }
    }
}
