import java.util.LinkedList;

/*
 * Reto #14
 * ¿ES UN NÚMERO DE ARMSTRONG?
 * Fecha publicación enunciado: 04/04/22
 * Fecha publicación resolución: 11/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Escribe una función que calcule si un número dado es un número de Amstrong (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información al respecto.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
*/

public class Main {

    private static Boolean isArmstrong(int num) {

        int number = num;
        int result = 0;
        int digitos = (int) Math.floor(Math.log10(Math.abs(num)) + 1);

        LinkedList<Integer> stack = new LinkedList<>();

        while (number > 0) {
            stack.push(number % 10);
            number /= 10;
        }

        for (int i = 0; i < stack.size(); i++) {
            result += Math.pow(stack.get(i), digitos);
        }

        return result == num;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}