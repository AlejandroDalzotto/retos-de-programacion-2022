import java.util.ArrayList;
import java.util.List;

/*
 * Reto #22
 * CONJUNTOS
 * Fecha publicación enunciado: 01/06/22
 * Fecha publicación resolución: 07/06/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba dos array, un booleano y retorne un array.
 * - Si el booleano es verdadero buscará y retornará los elementos comunes de los dos array.
 * - Si el booleano es falso buscará y retornará los elementos no comunes de los dos array.
 * - No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
*/

public class Main {

    private static List<Integer> calculateSet(List<Integer> first, List<Integer> second, boolean common) {

        ArrayList<Integer> commonResult = new ArrayList<>();

        if (first.isEmpty() || second.isEmpty()) {
            System.out.println("Alguno de los arrays está vacío");
            return null;
        }

        if (common) {
            for (int i = 0; i < first.size(); i++) {
                if (second.contains(first.get(i))) {
                    commonResult.add(first.get(i));
                }
            }
        } else {
            for (int i = 0; i < first.size(); i++) {
                if (!second.contains(first.get(i))) {
                    commonResult.add(first.get(i));
                }
            }

            for (int i = 0; i < second.size(); i++) {
                if (!first.contains(second.get(i))) {
                    commonResult.add(second.get(i));
                }
            }
        }

        return commonResult;

    }

    public static void main(String[] args) {

        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        first.add(1);
        first.add(2);
        first.add(3);
        first.add(4);
        first.add(5);
        first.add(6);
        first.add(7);

        second.add(5);
        second.add(6);
        second.add(7);
        second.add(8);
        second.add(9);
        second.add(10);

        System.out.println(calculateSet(first, second, false));
    }
}