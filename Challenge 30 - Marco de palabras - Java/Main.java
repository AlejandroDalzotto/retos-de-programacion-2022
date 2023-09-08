/*
 * Reto #30
 * MARCO DE PALABRAS
 * Fecha publicación enunciado: 26/07/22
 * Fecha publicación resolución: 01/08/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba un texto y muestre cada palabra en una línea, formando
 * un marco rectangular de asteriscos.
 * - ¿Qué te parece el reto? Se vería así:
 *   **********
 *   * ¿Qué   *
 *   * te     *
 *   * parece *
 *   * el     *
 *   * reto?  *
 *   **********
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
*/

public class Main {

    private static void draw(String text) {

        String[] str = new String[text.indexOf(" ")];
        Integer maxLength = 0;

        for (int i = 0; i < text.length(); i++) {
            str = text.split(" ");
        }

        for (int i = 0; i < str.length; i++) {
            if(maxLength < str[i].length()) {
                maxLength = str[i].length();
            }
        }

        String space = "*".repeat(maxLength + 4);
        System.out.println(space);

        for (String element : str) {
            System.out.println("* " + element + " ".repeat(maxLength - element.length()) + " *");
        }
        System.out.println(space);
    }

    public static void main(String[] args) {
        draw("Esto es un texto muy largo");
    }
}
