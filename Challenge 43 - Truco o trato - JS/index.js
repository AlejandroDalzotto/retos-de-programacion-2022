/*
 * Enunciado: Este es un reto especial por Halloween.
 * Deberemos crear un programa al que le indiquemos si queremos realizar "Truco
 * o Trato" y un listado (array) de personas con las siguientes propiedades:
 * - Nombre de la niña o niño
 * - Edad
 * - Altura en centímetros
 *
 * Si las personas han pedido truco, el programa retornará sustos (aleatorios)
 * siguiendo estos criterios:
 * - Un susto por cada 2 letras del nombre por persona
 * - Dos sustos por cada edad que sea un número par
 * - Tres sustos por cada 100 cm de altura entre todas las personas
 * - Sustos: 🎃 👻 💀 🕷 🕸 🦇
 *
 * Si las personas han pedido trato, el programa retornará dulces (aleatorios)
 * siguiendo estos criterios:
 * - Un dulce por cada letra de nombre
 * - Un dulce por cada 3 años cumplidos hasta un máximo de 10 años por persona
 * - Dos dulces por cada 50 cm de altura hasta un máximo de 150 cm por persona
 * - Dulces: 🍰 🍬 🍡 🍭 🍪 🍫 🧁 🍩
 */

class YoungBoy {

  name = ""
  age = 0
  height = 0

  constructor(name, age, height) {
    this.name = name
    this.age = age
    this.height = height
  }
}

/**
 * 
 * @param {YoungBoy[]} boys 
 */
function trickOrTreating(boys = [], choice = "trick") {

  const candies = ["🍬", "🍰", "🍡", "🍭", "🍪", "🍫", "🧁", "🍩"]
  const scaries = ["🎃", "👻", "💀", "🕷", " 🕸", "🦇"]

  let randomResult = ""
  if (choice !== "trick" && choice !== "treating") return "Invalid value"

  if (choice === "treating") {
    boys.forEach(boy => {
      randomResult += `\n${boy.name}\n`
      let cont = 0
      while (cont < boy.name.length) {
        const randomCandy = candies[Math.floor(Math.random() * candies.length)]
        randomResult += randomCandy
        cont++
      }

      randomResult += "\nAños:\n"

      for (let i = 0; i < Math.floor(boy.age / 3) && i < 10; i++) {
        const randomCandy = candies[Math.floor(Math.random() * candies.length)]
        randomResult += randomCandy
      }

      randomResult += "\nAltura:\n"

      for (let i = 0; i < Math.floor(boy.height / 50) && i < 3; i++) {
        const randomCandies = candies[Math.floor(Math.random() * candies.length)] + candies[Math.floor(Math.random() * candies.length)]
        randomResult += randomCandies
      }

    })
    return randomResult
  }

  boys.forEach(boy => {
    randomResult += `\n${boy.name}\n`
    let cont = 2
    while (cont < boy.name.length) {
      const randomScary = scaries[Math.floor(Math.random() * scaries.length)]
      randomResult += randomScary
      cont += 2
    }

    randomResult += "\nAños:\n"

    for (let i = 0; i < Math.floor(boy.age / 2); i++) {
      const randomScary = scaries[Math.floor(Math.random() * scaries.length)] + scaries[Math.floor(Math.random() * scaries.length)]
      randomResult += randomScary
    }

    randomResult += "\nAltura:\n"

    for (let i = 0; i < Math.floor(boy.height / 100); i++) {
      const randomScaries = scaries[Math.floor(Math.random() * scaries.length)]
        + scaries[Math.floor(Math.random() * scaries.length)]
        + scaries[Math.floor(Math.random() * scaries.length)]
      randomResult += randomScaries
    }

  })
  return randomResult
}

const boy1 = new YoungBoy("Pedro", 38, 180)
const boy2 = new YoungBoy("Ana", 8, 145)
const boy3 = new YoungBoy("María", 37, 149)

// console.log(trickOrTreating([boy1, boy2, boy3], "treating"))
console.log(trickOrTreating([boy1, boy2], "trick"))
