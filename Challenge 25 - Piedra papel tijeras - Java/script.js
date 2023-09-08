/*
 * Reto #25
 * PIEDRA, PAPEL, TIJERA
 * Fecha publicación enunciado: 20/06/22
 * Fecha publicación resolución: 27/06/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que calcule quien gana más partidas al piedra, papel, tijera.
 * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
 * - La función recibe un listado que contiene pares, representando cada jugada.
 * - El par puede contener combinaciones de "R" (piedra), "P" (papel) o "S" (tijera).
 * - Ejemplo. Entrada: [("R","S"), ("S","R"), ("P","S")]. Resultado: "Player 2".
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
*/

//@ts-check

const game_rules = {
    'R': {
        'S': true,
        'P': false,
    },
    'P': {
        'R': true,
        'S': false,
    },
    'S': {
        'P': true,
        'R': false,
    },
};

let points_p1 = 0;
let points_p2 = 0;

/**
 * @param {string} player_1 
 * @param {string} player_2 
 * @returns {string | undefined}
 */
function play(player_1, player_2) {

    if (player_1 == player_2) {
        return "Tie" + "\nPuntuación p1: " + points_p1 + "\nPuntuación p2: " + points_p2;
    }

    if (!game_rules[player_1][player_2]) {
        points_p2++;
        return "Player 2 win" + "\nPuntuación p1: " + points_p1 + "\nPuntuación p2: " + points_p2;;
    } else {
        points_p1++;
        return "Player 1 win" + "\nPuntuación p1: " + points_p1 + "\nPuntuación p2: " + points_p2;;
    }

}

console.log(play('R', 'S')); // Player 1 win
console.log(play('R', 'S')); // Player 1 win
console.log(play('S', 'S')); // Tie
console.log(play('S', 'R')); // Player 2 win
console.log(play('R', 'P')); // Player 2 win
console.log(play('S', 'P')); // Player 1 win
