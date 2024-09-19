package exerciciosa2;

import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
        List<Object> elementos = List.of("Marco", 123, 85.88, true);
        imprimirLista(elementos);
    }
    public static <T> void imprimirLista(List<T> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ": " + lista.get(i));
        }
    }
}
