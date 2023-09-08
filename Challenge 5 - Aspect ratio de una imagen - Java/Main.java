import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;

/*
 * Reto #5
 * ASPECT RATIO DE UNA IMAGEN
 * Fecha publicación enunciado: 01/02/22
 * Fecha publicación resolución: 07/02/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Crea un programa que se encargue de calcular el aspect ratio de una imagen a partir de una url.
 * - Nota: Esta prueba no se puede resolver con el playground online de Kotlin. Se necesita Android Studio.
 * - Url de ejemplo: https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una imagen de 1920*1080px.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

public class Main {

    private static Integer mcd(Integer a, Integer b) {
        if (b == 0)
            return a;
        return mcd(b, a % b);
    }

    public static void main(String[] args) {

        try {
            URL url = new URL("https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png");
            BufferedImage img = ImageIO.read(url);

            Integer width = img.getWidth();
            Integer height = img.getHeight();

            Integer mcd = mcd(width, height);

            String ratio = width / mcd + ":" + height / mcd;
            System.out.println("Dimensions: " + width + "x" + height + "px");
            System.out.println("Aspect ratio: " + ratio);

        } catch (Exception e) {
            System.out.println("Ocurrió un error " + e.getMessage());
        }

    }

}