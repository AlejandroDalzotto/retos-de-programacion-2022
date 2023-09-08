/*
 * Reto #37
 * LOS LANZAMIENTOS DE "THE LEGEND OF ZELDA"
 * Fecha publicación enunciado: 14/09/22
 * Fecha publicación resolución: 19/09/22
 * Dificultad: MEDIA
 *
 * Enunciado: ¡Han anunciado un nuevo "The Legend of Zelda"! Se llamará "Tears of the Kingdom"
 * y se lanzará el 12 de mayo de 2023.
 * Pero, ¿recuerdas cuánto tiempo ha pasado entre los distintos "The Legend of Zelda" de la historia?
 * Crea un programa que calcule cuántos años y días hay entre 2 juegos de Zelda que tú selecciones.
 * - Debes buscar cada uno de los títulos y su día de lanzamiento (si no encuentras el día exacto
 *   puedes usar el mes, o incluso inventártelo)
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */

String differenceBetweenTwoDates(DateTime first, DateTime second) {
  final difference = second.difference(first).inDays;

  final years = (difference / 365).floor();
  final months = ((difference % 365) / 30).floor();
  final weeks = ((difference % 365) % 30) ~/ 7;
  final days = ((difference % 365) % 30) % 7;

  // Construir la cadena de texto con la diferencia
  String result = "La diferencia es de ";
  if (years > 0) {
    result += "$years ${years == 1 ? 'año' : 'años'} ";
  }
  if (months > 0) {
    result += "$months ${months == 1 ? 'mes' : 'meses'} ";
  }
  if (weeks > 0) {
    result += "$weeks ${weeks == 1 ? 'semana' : 'semanas'} ";
  }
  if (days > 0) {
    result += "y $days ${days == 1 ? 'día' : 'días'} ";
  }

  return result.trim();
}

void main(List<String> args) {
  print(differenceBetweenTwoDates(new DateTime.now(), new DateTime(2025)));
}
