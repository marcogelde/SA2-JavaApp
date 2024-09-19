package exerciciosa2;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o numero de horas: ");
        int horas = leitor.nextInt();
        int segundos = horas * 3600;

        System.out.println(horas + " horas são iguais a " + segundos + " segundos.");
        leitor.close();
    }
}
