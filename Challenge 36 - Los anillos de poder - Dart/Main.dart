/*
 * Reto #36
 * LOS ANILLOS DE PODER
 * Fecha publicación enunciado: 06/09/22
 * Fecha publicación resolución: 14/09/22
 * Dificultad: MEDIA
 *
 * Enunciado: ¡La Tierra Media está en guerra! En ella lucharán razas leales a Sauron
 * contra otras bondadosas que no quieren que el mal reine sobre sus tierras.
 * Cada raza tiene asociado un "valor" entre 1 y 5:
 * - Razas bondadosas: Pelosos (1), Sureños buenos (2), Enanos (3), Númenóreanos (4), Elfos (5)
 * - Razas malvadas: Sureños malos (2), Orcos (2), Goblins (2), Huargos (3), Trolls (5)
 * Crea un programa que calcule el resultado de la batalla entre los 2 tipos de ejércitos:
 * - El resultado puede ser que gane el bien, el mal, o exista un empate. Dependiendo de la
 *   suma del valor del ejército y el número de integrantes.
 * - Cada ejército puede estar compuesto por un número de integrantes variable de cada raza.
 * - Tienes total libertad para modelar los datos del ejercicio.
 * Ej: 1 Peloso pierde contra 1 Orco, 2 Pelosos empatan contra 1 Orco, 3 Pelosos ganan a 1 Orco.
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */

enum KindRaces { HAIRY, GOODSOUTHERNERS, DWARVES, NUMENOREANS, ELVES }

enum EvilRaces { BADSOUTHERNERS, ORCS, GOBLINS, WARGS, TROLLS }

Map<KindRaces, int> getKindBravery() {
  Map<KindRaces, int> bravery = {
    KindRaces.HAIRY: 1,
    KindRaces.GOODSOUTHERNERS: 2,
    KindRaces.DWARVES: 3,
    KindRaces.NUMENOREANS: 4,
    KindRaces.ELVES: 5
  };

  return bravery;
}

Map<EvilRaces, int> getEvilBravery() {
  Map<EvilRaces, int> bravery = {
    EvilRaces.BADSOUTHERNERS: 2,
    EvilRaces.ORCS: 2,
    EvilRaces.GOBLINS: 2,
    EvilRaces.WARGS: 3,
    EvilRaces.TROLLS: 5
  };

  return bravery;
}

String battleForTheMiddleEarth(
    Map<KindRaces, int> kindArmy, Map<EvilRaces, int> evilArmy) {
  Map<KindRaces, int> kindBravery = getKindBravery();
  Map<EvilRaces, int> evilBravery = getEvilBravery();

  int totalKindPoints = 0;
  int totalEvilPoints = 0;

  kindArmy.forEach((entity, amount) {
    totalKindPoints += kindBravery[entity]! * amount;
  });

  evilArmy.forEach((entity, amount) {
    totalEvilPoints += evilBravery[entity]! * amount;
  });

  if (totalKindPoints == totalEvilPoints) {
    return "¡Empate!";
  }

  return totalKindPoints > totalEvilPoints
      ? "¡Las Razas bondadosas ganan!"
      : "¡Las Razas malvadas ganan!";
}

void main(List<String> args) {
  print(battleForTheMiddleEarth(
      {KindRaces.HAIRY: 5}, {EvilRaces.TROLLS: 1})); // Return: Empate
  print(battleForTheMiddleEarth({KindRaces.HAIRY: 1, KindRaces.DWARVES: 2},
      {EvilRaces.TROLLS: 2})); // Return: Evil ganan
  print(battleForTheMiddleEarth(
      {KindRaces.HAIRY: 6}, {EvilRaces.TROLLS: 1})); // Return: Kind ganan
}
