/*
 * Enunciado: Implementa uno de los algoritmos de ordenación más famosos:
 * el "Quick Sort", creado por C.A.R. Hoare.
 * - Entender el funcionamiento de los algoritmos más utilizados de la historia
 *   Nos ayuda a mejorar nuestro conocimiento sobre ingeniería de software.
 *   Dedícale tiempo a entenderlo, no únicamente a copiar su implementación.
 * - Esta es una nueva serie de retos llamada "TOP ALGORITMOS",
 *   donde trabajaremos y entenderemos los más famosos de la historia.
*/

/**
 * 
 * @param {number[]} arr 
 * @returns {number[]}
 */
const quickSort = (arr = []) => {

  if (arr.length <= 1) return arr

  const left = []
  const right = []
  const pivot = arr[0];

  for (let i = 1; i < arr.length; i++) {

    if (pivot > arr[i]) left.push(arr[i])
    if (pivot < arr[i]) right.push(arr[i])

  }

  return [quickSort(left), pivot, quickSort(right)].flat()

}

console.log(quickSort([2, 4, 1, 3]))
console.log(quickSort([2, 4, 1, 3, 8, 10, 5, 6]))
console.log(quickSort([4, 3, 2, 1]))
