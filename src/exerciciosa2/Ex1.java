package exerciciosa2;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] numeros = {5, 7, 2, 9, 4, 1, 3};
        System.out.println("Tamanho da lista: " + numeros.length);
        System.out.print("Maior numero: ");
        Arrays.stream(numeros).max().ifPresent(System.out::println);
        System.out.print("Menor numero: ");
        Arrays.stream(numeros).min().ifPresent(System.out::println);
        System.out.println("A soma de todos os elementos: " + Arrays.stream(numeros).sum());
        System.out.print("A lista em ordem crescente: ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.print("\nA lista em ordem decrescente: ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }

}