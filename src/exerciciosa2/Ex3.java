package exerciciosa2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] num = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o "+(i+1)+ "º número: ");
            num[i] = leitor.nextInt();
        }

        System.out.println("A média é: ");
        Arrays.stream(num).average().ifPresent(System.out::println);
        System.out.println("Maior valor é: ");
        Arrays.stream(num).max().ifPresent(System.out::println);
        System.out.println("Menor valor é: ");
        Arrays.stream(num).min().ifPresent(System.out::println);

        leitor.close();
    }
}
