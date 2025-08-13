package Exercicios.LogicaDeProgramacao.Java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double salarioMin = 1293.20;
        double salarioUsuario = sc.nextInt();
        double conta = salarioUsuario / salarioMin;
        System.out.println(df.format(conta));
    }
}
