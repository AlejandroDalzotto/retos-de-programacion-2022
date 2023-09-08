/*
 * Enunciado: Crea una función que calcule el valor del parámetro perdido
 * correspondiente a la ley de Ohm.
 * - Enviaremos a la función 2 de los 3 parámetros (V, R, I), y retornará
 *   el valor del tercero (redondeado a 2 decimales).
 * - Si los parámetros son incorrectos o insuficientes, la función retornará
 *   la cadena de texto "Invalid values".
 */


/* V = R * I */
function ohm(v = null, r = null, i = null) {

  if (v !== null && r !== null && i === null) return `I = ${(v / r).toFixed(2)}`
  if (v !== null && r === null && i !== null) return `R = ${(v / i).toFixed(2)}`
  if (v === null && r !== null && i !== null) return `V = ${(r * i).toFixed(2)}`
  return "Invalid values"

}

console.log(ohm())
console.log(ohm(v = 5.0, null, null))
console.log(ohm(v = 5.0, r = 4.0, null))
console.log(ohm(v = 5.0, null, i = 4.0))
console.log(ohm(null, r = 5.0, i = 4.0))
console.log(ohm(v = 5.125, r = 4.0, null))
console.log(ohm(v = 5.0, null, i = 4.125))
console.log(ohm(null, r = 5.0, i = 4.125))
console.log(ohm(v = 5.0, r = 0.0, null))
console.log(ohm(v = 5.0, null, i = 0.0))
console.log(ohm(null, r = 5.0, i = 0.0))
console.log(ohm(v = 5.0, r = 4.0, i = 3.0))