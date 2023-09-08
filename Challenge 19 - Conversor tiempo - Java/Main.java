/*
 * Reto #19
 * CONVERSOR TIEMPO
 * Fecha publicación enunciado: 09/05/22
 * Fecha publicación resolución: 16/05/22
 * Dificultad: FACIL
 *
 * Enunciado: Crea una función que reciba días, horas, minutos y segundos (como enteros) y retorne su resultado en milisegundos.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
*/

public class Main {

    private static long timeToMiliseconds(int days, int hours, int minutes, int seconds) {
        return (Math.abs(days) * 24 * 60 * 60 * 1000) + (Math.abs(hours) * 60 * 60 * 1000)
                + (Math.abs(minutes) * 60 * 1000) + (Math.abs(seconds) * 1000);
    }

    public static void main(String[] args) {
        System.out.println(timeToMiliseconds(0, 1, 0, 0));
        System.out.println(timeToMiliseconds(0, 0, 0, 1));
        System.out.println(timeToMiliseconds(0, 0, 1, 0));
        System.out.println(timeToMiliseconds(1, 0, 0, 0));
        System.out.println(timeToMiliseconds(-1, -1, -1, -1));
    }
}
