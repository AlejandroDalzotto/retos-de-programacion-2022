/*
 * Reto #34
 * LOS NÚMEROS PERDIDOS
 * Fecha publicación enunciado: 22/08/22
 * Fecha publicación resolución: 29/08/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Dado un array de enteros ordenado y sin repetidos, crea una función que calcule
 * y retorne todos los que faltan entre el mayor y el menor.
 * - Lanza un error si el array de entrada no es correcto.
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */

List<int> lostNumbers(List<int> numbers) {
  numbers.sort();

  if (numbers.length < 2) {
    throw "El array debe tener mínimo 2 valores.";
  }

  if (numbers.length != numbers.toSet().length) {
    throw "El array contiene repetidos.";
  }

  List<int> arrComplete = [];

  for (int i = numbers.first; i <= numbers.last; i++) {
    arrComplete.add(i);
  }

  return arrComplete;
}

void main(List<String> args) {
  try {
    print(lostNumbers([1, 2, 3, 10]));
    // print(lostNumbers([1, 2, 3, 5, 5]));
    print(lostNumbers([1, 2, 3, 7, 5]));
    print(lostNumbers([1, 2, 9, 5, -3]));
  } catch (e) {
    print(e);
  }
}
