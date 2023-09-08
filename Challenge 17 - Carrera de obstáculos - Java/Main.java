import java.util.ArrayList;

/*
 * Reto #17
 * LA CARRERA DE OBSTÁCULOS
 * Fecha publicación enunciado: 25/04/22
 * Fecha publicación resolución: 02/05/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea una función que evalúe si un/a atleta ha superado correctamente una
 * carrera de obstáculos.
 * - La función recibirá dos parámetros:
 *      - Un array que sólo puede contener String con las palabras "run" o "jump"
 *      - Un String que represente la pista y sólo puede contener "_" (suelo) o "|" (valla)
 * - La función imprimirá cómo ha finalizado la carrera:
 *      - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla) será correcto y no
 *        variará el símbolo de esa parte de la pista.
 *      - Si hace "jump" en "_" (suelo), se variará la pista por "x".
 *      - Si hace "run" en "|" (valla), se variará la pista por "/".
 * - La función retornará un Boolean que indique si ha superado la carrera.
 * Para ello tiene que realizar la opción correcta en cada tramo de la pista.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
*/

enum AthleteState {
    RUN, JUMP
}

public class Main {

    private static Boolean checkRace(ArrayList<AthleteState> athlete, ArrayList<String> track) {

        if (athlete == null || track == null || athlete.isEmpty() || track.isEmpty()) {
            throw new IllegalArgumentException("Hay un problema con alguno de los argumentos");
        }

        for (int i = 0; i < athlete.size(); i++) {
            if (athlete.get(i).equals(AthleteState.RUN) && !(track.get(i) == "_")) {
                track.set(i, "/");
            } else if (athlete.get(i).equals(AthleteState.JUMP) && track.get(i) == "_") {
                track.set(i, "x");
            }
        }

        System.out.println("Resultado de la pista:\n" + track);

        return !track.contains("/") && !track.contains("x");
    }

    public static void main(String[] args) {

        ArrayList<AthleteState> athlete = new ArrayList<>();
        ArrayList<String> track = new ArrayList<>();

        athlete.add(AthleteState.RUN);
        athlete.add(AthleteState.RUN);
        athlete.add(AthleteState.RUN);
        athlete.add(AthleteState.JUMP);
        athlete.add(AthleteState.RUN);

        track.add("_");
        track.add("_");
        track.add("_");
        track.add("|");
        track.add("_");

        System.out.println(checkRace(athlete, track));
    }
}