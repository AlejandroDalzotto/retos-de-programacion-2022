import java.util.ArrayList;

/*
 * Reto #11
 * ELIMINANDO CARACTERES
 * Fecha publicación enunciado: 14/03/22
 * Fecha publicación resolución: 21/03/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba dos cadenas como parámetro (str1, str2) e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO estén presentes en str1.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
*/

public class Main {

    private static String printStringIfContainCharacter(String str1, String str2) {

        if (str1.isEmpty() || str2.isEmpty() || str1 == null || str2 == null) {
            return "Alguna de las cadenas es invalida";
        }

        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();

        String out1 = "", out2 = "";

        for (int i = 0; i < str1.length(); i++) {
            arr1.add(str1.substring(i, i + 1));
        }

        for (int i = 0; i < str2.length(); i++) {
            arr2.add(str2.substring(i, i + 1));
        }

        for (String symbol : arr1) {
            if (!arr2.contains(symbol)) {
                out1 += symbol;
            }
        }

        for (String symbol : arr2) {
            if (!arr1.contains(symbol)) {
                out2 += symbol;
            }
        }

        return ("Caracteres presentes en la str1 pero no presentes en str2: " + out1.toLowerCase() + "\nCaracteres presentes en la str2 pero no presentes en str1: " + out2.toLowerCase());

    }

    public static void main(String[] args) {
        System.out.println(printStringIfContainCharacter("Me gusta Java","Me gusta Kotlin"));
    }
}