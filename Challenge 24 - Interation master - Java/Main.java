/*
 * Reto #24
 * ITERATION MASTER
 * Fecha publicación enunciado: 13/06/22
 * Fecha publicación resolución: 20/06/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Quiero contar del 1 al 100 de uno en uno (imprimiendo cada uno). ¿De cuántas maneras eres capaz de hacerlo? Crea el código para cada una de ellas.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
*/

public class Main {

    private static void iterateMethodOne() {

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + ", ");
        }
    }

    private static void iterateMethodTwo(int number) {

        if (number <= 100) {
            System.out.print(number + ", ");
            iterateMethodTwo(number + 1);
        }
    }

    private static void iterateMethodThree() {

        int number = 1;

        while (number <= 100) {
            System.out.print(number + ", ");
            number++;
        }
    }

    private static void iterateMethodFour() {

        int number = 0;

        do {
            number++;
            System.out.print(number + ", ");
        } while (number < 100);
    }

    public static void main(String[] args) {

        System.out.println("\n------- 1 -------");
        iterateMethodOne();

        System.out.println("\n------- 2 -------");
        iterateMethodTwo(1);

        System.out.println("\n------- 3 -------");
        iterateMethodThree();

        System.out.println("\n------- 4 -------");
        iterateMethodFour();

        // Al parecer de 4 maneras, que paja, soy un asco :/
    }
}