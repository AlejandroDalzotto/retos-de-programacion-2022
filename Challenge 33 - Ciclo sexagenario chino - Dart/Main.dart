/*
 * Reto #33
 * CICLO SEXAGENARIO CHINO
 * Fecha publicación enunciado: 15/08/22
 * Fecha publicación resolución: 22/08/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea una función, que dado un año, indique el elemento y animal correspondiente
 * en el ciclo sexagenario del zodíaco chino.
 * - Información: https://www.travelchinaguide.com/intro/astrology/60year-cycle.htm
 * - El ciclo sexagenario se corresponde con la combinación de los elementos madera,
 *   fuego, tierra, metal, agua y los animales rata, buey, tigre, conejo, dragón, serpiente,
 *   caballo, oveja, mono, gallo, perro, cerdo (en este orden).
 * - Cada elemento se repite dos años seguidos.
 * - El último ciclo sexagenario comenzó en 1984 (Madera Rata).
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en https://retosdeprogramacion.com/semanales2022.
 *
 */

String chineseZodiac(int year) {
  List<String> animals = [
    "rat",
    "ox",
    "tiger",
    "rabbit",
    "dragon",
    "snake",
    "horse",
    "sheep",
    "monkey",
    "rooster",
    "dog",
    "pig"
  ];
  List<String> elements = ["wood", "fire", "earth", "metal", "water"];

  if (year < 604) {
    return "El ciclo sexagenario comenzó en el año 604.";
  }

  var sexagenaryYear = (year - 4) % 60;
  var element = elements[(sexagenaryYear % 10) ~/ 2];
  var animal = animals[sexagenaryYear % 12];

  return "$year: $animal $element";
}

void main(List<String> args) {
  print(chineseZodiac(1924));
  print(chineseZodiac(1925));
  print(chineseZodiac(1926));
  print(chineseZodiac(1927));
}
