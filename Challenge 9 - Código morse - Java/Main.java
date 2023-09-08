import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Reto #9
 * CÓDIGO MORSE
 * Fecha publicación enunciado: 02/03/22
 * Fecha publicación resolución: 07/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que sea capaz de transformar texto natural a código morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

public class Main {

    private static Map<String, String> getMapMorse() {
        Map<String, String> codes = new HashMap<>();
        codes.put("A", ".-");
        codes.put("B", "-...");
        codes.put("C", "-.-.");
        codes.put("CH", "----");
        codes.put("D", "-..");
        codes.put("E", ".");
        codes.put("F", "..-.");
        codes.put("G", "--.");
        codes.put("H", "....");
        codes.put("I", "..");
        codes.put("J", ".---");
        codes.put("K", "-.-");
        codes.put("L", ".-..");
        codes.put("M", "--");
        codes.put("N", "-.");
        codes.put("Ñ", "--.--");
        codes.put("O", "---");
        codes.put("P", ".--.");
        codes.put("Q", "--.-");
        codes.put("R", ".-.");
        codes.put("S", "...");
        codes.put("T", "-");
        codes.put("U", "..-");
        codes.put("V", "...-");
        codes.put("W", ".--");
        codes.put("X", "-..-");
        codes.put("Y", "-.--");
        codes.put("Z", "--..");
        codes.put("0", "-----");
        codes.put("1", ".----");
        codes.put("2", "..---");
        codes.put("3", "...--");
        codes.put("4", "....-");
        codes.put("5", ".....");
        codes.put("6", "-....");
        codes.put("7", "--...");
        codes.put("8", "---..");
        codes.put("9", "----.");
        codes.put(".", ".-.-.-");
        codes.put(",", "--..--");
        codes.put(":", "---...");
        codes.put("?", "..--..");
        codes.put("'", ".----.");
        codes.put("-", "-....-");
        codes.put("/", "-..-.");
        codes.put("\"", ".-..-.");
        codes.put("@", ".--.-.");
        codes.put("=", "-...-");
        codes.put("!", "-.-.--");
        codes.put(" ", "/");

        return codes;
    }

    private static Map<String, String> getMapAcsii() {
        Map<String, String> codes = new HashMap<>();
        codes.put(".-", "A");
        codes.put("-...", "B");
        codes.put("-.-.", "C");
        codes.put("----", "CH");
        codes.put("-..", "D");
        codes.put(".", "E");
        codes.put("..-.", "F");
        codes.put("--.", "G");
        codes.put("....", "H");
        codes.put("..", "I");
        codes.put(".---", "J");
        codes.put("-.-", "K");
        codes.put(".-..", "L");
        codes.put("--", "M");
        codes.put("-.", "N");
        codes.put("--.--", "Ñ");
        codes.put("---", "O");
        codes.put(".--.", "P");
        codes.put("--.-", "Q");
        codes.put(".-.", "R");
        codes.put("...", "S");
        codes.put("-", "T");
        codes.put("..-", "U");
        codes.put("...-", "V");
        codes.put(".--", "W");
        codes.put("-..-", "X");
        codes.put("-.--", "Y");
        codes.put("--..", "Z");
        codes.put("-----", "0");
        codes.put(".----", "1");
        codes.put("..---", "2");
        codes.put("...--", "3");
        codes.put("....-", "4");
        codes.put(".....", "5");
        codes.put("-....", "6");
        codes.put("--...", "7");
        codes.put("---..", "8");
        codes.put("----.", "9");
        codes.put(".-.-.-", ".");
        codes.put("--..--", ",");
        codes.put("---...", ":");
        codes.put("..--..", "?");
        codes.put(".----.", "'");
        codes.put("-....-", "-");
        codes.put("-..-.", "/");
        codes.put(".-..-.", "\"");
        codes.put(".--.-.", "@");
        codes.put("-...-", "=");
        codes.put("-.-.--", "!");
        codes.put("/", " ");

        return codes;
    }

    private static String toMorse(String phraseNormal) {

        if (phraseNormal == null || phraseNormal == "") {
            return "";
        }

        String phraseMorse = "";
        Map<String, String> map = getMapMorse();

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < phraseNormal.length(); i++) {
            list.add(phraseNormal.substring(i, i + 1));

        }

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i))) {
                phraseMorse += map.get(list.get(i)) + " ";
            }
        }

        return phraseMorse;
    }

    private static String toAcsii(String phraseMorse) {
        if (phraseMorse == null || phraseMorse == "") {
            return "";
        }

        String phraseNormal = "";
        Map<String, String> map = getMapAcsii();

        String[] list = phraseMorse.toUpperCase().split(" ");

        for (int i = 0; i < list.length; i++) {
            if (map.containsKey(list[i])) {
                phraseNormal += map.get(list[i]);
            }
        }

        return phraseNormal;
    }

    public static void main(String[] args) {
        System.out.println(toMorse("Hello, World!"));
        System.out.println(toAcsii(".... . .-.. .-.. --- --..-- / .-- --- .-. .-.. -.. -.-.--"));
    }
}