import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/*
 * Reto #15
 * ¿CUÁNTOS DÍAS?
 * Fecha publicación enunciado: 11/04/22
 * Fecha publicación resolución: 18/04/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Crea una función que calcule y retorne cuántos días hay entre dos cadenas de texto que representen fechas.
 * - Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
 * - La función recibirá dos String y retornará un Int.
 * - La diferencia en días será absoluta (no importa el orden de las fechas).
 * - Si una de las dos cadenas de texto no representa una fecha correcta se lanzará una excepción.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
*/

public class Main {

    private static Integer diffBetweenDays(String date1, String date2) throws ParseException {

        if (date1.isEmpty() || date2.isEmpty() || date1 == null || date2 == null) {
            throw new Error("¡Fecha no valida!");
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date firstDate = dateFormat.parse(date1);
        Date secondDate = dateFormat.parse(date2);

        long sourceDuration = firstDate.getTime() - secondDate.getTime();

        return (int) Math.abs(TimeUnit.DAYS.convert(sourceDuration, TimeUnit.MILLISECONDS));
    }

    public static void main(String[] args) {
        try {
            System.out.println(diffBetweenDays("18/05/2022", "15/04/2022"));
        } catch (ParseException e) {
            System.err.println("Error");
        }

    }
}