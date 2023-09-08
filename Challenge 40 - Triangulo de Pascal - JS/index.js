/*
 * Enunciado: Crea una función que sea capaz de dibujar el "Triángulo de Pascal"
 * indicándole únicamente el tamaño del lado.
 *
 * - Aquí puedes ver rápidamente cómo se calcula el triángulo:
 *   https://commons.wikimedia.org/wiki/File:PascalTriangleAnimated2.gif
 */
const drawPascalTriangle = (size) => {

  const firstRow = [1]
  console.log(firstRow)

  const values = []
  for (let i = 0; i < size - 1; i++) {

    const newRow = [1, ...values, 1]

    values.length = 0
    for (let j = 0; j < i + 1; j++) {
      const newValue = newRow[j] + newRow[j + 1]
      values.push(newValue)
    }
    console.log(newRow)

  }
}

drawPascalTriangle(7)
