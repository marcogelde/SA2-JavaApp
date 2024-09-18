package exerciciosa2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] num = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o "+(i+1)+ "º número: ");
            num[i] = leitor.nextDouble();
        }

        double media = Arrays.stream(num).average().orElse(Double.NaN);
        String texto = (media > 1) ? "Positivo": "Negativo";

        System.out.println(texto);

        leitor.close();
    }
}
