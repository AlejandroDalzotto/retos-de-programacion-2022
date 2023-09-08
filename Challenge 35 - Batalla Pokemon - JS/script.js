console.clear();

const PokemonType = ['water', 'fire', 'grass', 'electric'];

const typeChart = {
    'fire': {
        'grass': true,
        'water': false,
        'fire': false,
    },
    'water': {
        'fire': true,
        'grass': false,
        'water': false,
    },
    'grass': {
        'water': true,
        'fire': false,
        'grass': false,
    },
    'electric': {
        'water': true,
        'grass': false,
        'electric': false,
    },
};

function battle(attacker, defender, attack, defense) {

    let efectividad = 1.0;

    if (!PokemonType.includes(attacker) || !PokemonType.includes(defender)) {
        throw new Error('Entrada invalida');
    }

    if (attack < 0 || attack > 100 || defense < 0 || defense > 100) {
        throw new Error('Valor del ataque o defensa invalidos');
    }

    if (typeChart[attacker][defender]) {
        efectividad = 2.0;
        console.log('Es súper efectivo')
    }
    else if (typeChart[attacker][defender] === undefined) {
        console.log('Es neutro');
    } else if (!typeChart[attacker][defender]) {
        efectividad = 0.5;
        console.log('No es muy efectivo');
    }

    return 50 * (attack / defense) * efectividad;
}

console.log(battle('water', 'fire', 50, 30));
