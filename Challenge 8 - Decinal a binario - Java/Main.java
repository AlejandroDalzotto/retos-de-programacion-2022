/*
 * Reto #8
 * DECIMAL A BINARIO
 * Fecha publicación enunciado: 18/02/22
 * Fecha publicación resolución: 02/03/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que se encargue de transformar un número decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

public class Main {

    private static String toBinary(Integer num) {

        String result = "";
        Integer reminder = 0;

        while (num != 0) {
            reminder = num % 2;
            num /= 2;
            result = reminder + result;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(toBinary(75));
        System.out.println(toBinary(42));
        System.out.println(toBinary(55));
        System.out.println(toBinary(33));
        System.out.println(toBinary(443));
    }
}