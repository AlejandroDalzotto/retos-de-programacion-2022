import java.util.ArrayList;
import java.util.LinkedHashMap;

/*
 * Reto #10
 * EXPRESIONES EQUILIBRADAS
 * Fecha publicación enunciado: 07/03/22
 * Fecha publicación resolución: 14/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que comprueba si los paréntesis, llaves y corchetes de una expresión están equilibrados.
 * - Equilibrado significa que estos delimitadores se abren y cieran en orden y de forma correcta.
 * - Paréntesis, llaves y corchetes son igual de prioritarios. No hay uno más importante que otro.
 * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
 * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
*/

public class Main {

    private static Boolean isBalanced(String expression) {

        LinkedHashMap<String, String> symbols = new LinkedHashMap<>();
        symbols.put("{", "}");
        symbols.put("[", "]");
        symbols.put("(", ")");
        symbols.put("}", "{");
        symbols.put("]", "[");
        symbols.put(")", "(");

        ArrayList<String> exp = new ArrayList<>();
        ArrayList<String> stack = new ArrayList<>();

        for (int i = 0; i < expression.length(); i++) {
            exp.add(expression.substring(i, i + 1));
        }

        for (String symbol : exp) {

            boolean containsKey = symbols.containsKey(symbol);

            if (containsKey || symbols.containsValue(symbol)) {
                if (containsKey) {
                    stack.add(symbol);
                } else if (stack.isEmpty()) {
                    return false;
                }
            }
        }

        System.out.println(stack);

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(isBalanced("{ [ a * ( c + d )))))) ] - 5 }"));
    }
}