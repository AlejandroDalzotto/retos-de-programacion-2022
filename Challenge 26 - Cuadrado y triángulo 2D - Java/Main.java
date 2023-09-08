/*
 * Reto #26
 * CUADRADO Y TRIÁNGULO 2D
 * Fecha publicación enunciado: 27/06/22
 * Fecha publicación resolución: 07/07/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que dibuje un cuadrado o un triángulo con asteriscos "*".
 * - Indicaremos el tamaño del lado y si la figura a dibujar es una u otra.
 * - EXTRA: ¿Eres capaz de dibujar más figuras?
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
*/

enum PolygonType {
    SQUARE, TRIANGLE, RECTANGLE
}

public class Main {

    private static void draw(int size, PolygonType type) {

        String square = "";
        String triangle = "";

        switch (type) {
            case SQUARE:

                for (int i = 0; i < size; i++) {
                    square += "*";
                }

                for (int i = 0; i < (size / 2); i++) {
                    System.out.println(square);
                }

                break;

            case TRIANGLE:

                for (int i = 0; i < size; i++) {
                    triangle += "*";
                    System.out.println(triangle);
                }

                break;

            case RECTANGLE:
                for (int i = 0; i < size; i++) {
                    square += "*";
                }

                for (int i = 0; i < (size / 4); i++) {
                    System.out.println(square);
                }
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        draw(20, PolygonType.TRIANGLE);
    }
}