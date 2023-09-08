/*
 * Reto #38
 * BINARIO A DECIMAL
 * Fecha publicación enunciado: 19/09/22
 * Fecha publicación resolución: 27/09/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa se encargue de transformar un número binario a decimal sin utilizar
 * funciones propias del lenguaje que lo hagan directamente.
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */

import 'dart:math' as math;

String reverseNumber(int number) {
  String reversed = number.toString().split('').reversed.join();

  return reversed;
}

int toDecimal(int binary) {
  if (binary.toString().contains(RegExp(r"[2-9]"))) {
    throw "El número solo debe contener unos y ceros.";
  }

  num result = 0;

  String binaryReversed = reverseNumber(binary);

  for (var i = 0; i < binaryReversed.length; i++) {
    if (binaryReversed.toString()[i] == "1") {
      result += math.pow(2, i);
    }
  }

  return result.toInt();
}

void main(List<String> args) {
  try {
    print(toDecimal(101)); // Return: 5
    print(toDecimal(110)); // Return: 6
    print(toDecimal(10)); // Return: 2
    print(toDecimal(101010)); // Return: 42
    print(toDecimal(102)); // Throw: Error
  } catch (e) {
    print(e);
  }
}
