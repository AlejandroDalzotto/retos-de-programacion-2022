/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

//@ts-check

class Square {

    base;

    /**
     * 
     * @param {number} base 
     */
    constructor(base) {
        this.base = base;
    }
}

class Triangle {

    base;
    height;

    /**
     * 
     * @param {number} base 
     * @param {number} height 
     */
    constructor(base, height) {
        this.base = base;
        this.height = height;
    }
}

class Rectangle {

    base;
    height;

    /**
     * 
     * @param {number} base 
     * @param {number} height 
     */
    constructor(base, height) {
        this.base = base;
        this.height = height;
    }
}

/**
 * 
 * @param {Rectangle | Triangle | Square} poligono 
 * @returns {number}
 */
function calcPerimeter(poligono) {

    let result = null;

    if (poligono instanceof Rectangle) {
        result = poligono.base * poligono.height;
        return result;
    }

    if (poligono instanceof Triangle) {
        result = (poligono.base * poligono.height) / 2;
        return result;
    }

    result = Math.pow(poligono.base, 2);
    return result;

}

const rectangle = new Rectangle(10, 6);
const triangle = new Triangle(10, 5);
const square = new Square(10);

console.log(calcPerimeter(rectangle)); // return = 60
console.log(calcPerimeter(triangle)); // return = 25
console.log(calcPerimeter(square)); // return = 100

