/*
 * Enunciado: Crea una función que transforme grados Celsius en Fahrenheit
 * y viceversa.
 *
 * - Para que un dato de entrada sea correcto debe poseer un símbolo "°" 
 *   y su unidad ("C" o "F").
 * - En caso contrario retornará un error.
 * - ¿Quieres emplear lo aprendido en este reto?
 *   Revisa el reto mensual y crea una App: 
 *   https://retosdeprogramacion.com/mensuales2022
 */

function convertTo(x) {

  const regex = /^-?\d+(\.\d+)?[°][CF]$/

  if (!regex.test(x)) return "Invalid value"

  const numb = Number(x.split("°")[0])
  const degree = x.split("°")[1]

  if (degree === "C") {
    return `${((numb * (9 / 5)) + 32).toFixed(2)}°F`
  }
  return `${((numb - 32) * (5 / 9)).toFixed(2)}°C`
}

console.log(convertTo("10000°F"))
console.log(convertTo("-100.50°F"))
console.log(convertTo("100°C"))
console.log(convertTo("1°D"))
console.log(convertTo("34.2°C"))
