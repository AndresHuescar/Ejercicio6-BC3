import java.util.*;

public class ListaNombres {

    public static void main(String[] args) {

        // Creo una lista con varios nombres (algunos están repetidos)
        List<String> nombres = Arrays.asList("Ana", "Luis", "Ana", "Carlos", "Luis");

        // Creo un TreeSet a partir de la lista
        // Uso TreeSet porque elimina los elementos duplicados y además los ordena automáticamente
        Set<String> resultado = new TreeSet<>(nombres);

        // Muestro el resultado final por pantalla
        // Aquí veré los nombres sin repetir y ordenados alfabéticamente
        System.out.println(resultado);
    }
}
