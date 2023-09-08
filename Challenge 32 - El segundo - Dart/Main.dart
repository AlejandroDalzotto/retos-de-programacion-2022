/*
 * Reto #32
 * EL SEGUNDO
 * Fecha publicación enunciado: 08/08/22
 * Fecha publicación resolución: 15/08/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Dado un listado de números, encuentra el SEGUNDO más grande.
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en https://retosdeprogramacion.com/semanales2022.
 *
 */

int findSecondGreater(List<int> numbers) {
  if (numbers.isEmpty) {
    return 0;
  }

  numbers.sort();
  int greater = numbers[numbers.length - 2];

  return greater;
}

void main(List<String> args) {
  print(findSecondGreater([4, 6, 1, 8, 2])); // Return: 6
  print(findSecondGreater([4, 6, 8, 8, 6])); // Return: 8
  print(findSecondGreater([4, 4])); // Return: 4
  print(findSecondGreater([])); // Return: 0
  print(findSecondGreater([1, 2, 3, 6, 1, 2, 5])); // Return: 5
  print(findSecondGreater([-1, -2, -5])); // Return: -2
}
