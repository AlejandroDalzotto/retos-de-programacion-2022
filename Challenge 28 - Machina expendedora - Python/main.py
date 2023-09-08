#
#  Reto #28
#  MÁQUINA EXPENDEDORA
#  Fecha publicación enunciado: 11/07/22
#  Fecha publicación resolución: 18/07/22
#  Dificultad: MEDIA
#
#  Enunciado: Simula el funcionamiento de una máquina expendedora creando una operación
#  que reciba dinero (array de monedas) y un número que indique la selección del producto.
#  - El programa retornará el nombre del producto y un array con el dinero de vuelta (con el menor
#    número de monedas).
#  - Si el dinero es insuficiente o el número de producto no existe, deberá indicarse con un mensaje
#    y retornar todas las monedas.
#  - Si no hay dinero de vuelta, el array se retornará vacío.
#  - Para que resulte más simple, trabajaremos en céntimos con monedas de 5, 10, 50, 100 y 200.
#  - Debemos controlar que las monedas enviadas estén dentro de las soportadas.
#
#  Información adicional:
#  - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
#  - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
#  - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
#  - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
#

from enum import IntEnum

class Money(IntEnum):
    FIVE = 5,
    TEN = 10,
    FIFTY = 50,
    ONEHUNDRED = 100,
    TWOHUNDRED = 200


commodity = {"ensalada": 100, "carne": 125, "pescado": 110, "fideos": 90}


def buy(product, coins):

    total_money = 0

    if len(coins) == 0 or not product in list(commodity.keys()):
        return "valores de parametro invalidos"

    for i in range(len(coins)):
        total_money += coins[i]

    cost_product = list(commodity.values())[
        list(commodity.keys()).index(product)]

    if cost_product > total_money:
        print("No tienes dinero suficiente")
        return coins
    else:
        rest = total_money - cost_product
        if rest == 0:
            print("Compra de", product, "hecha con exito")
            return []
        else:
            coins_change = list()
            change = abs(total_money - cost_product)
            while change >= 5:
                if change >= 200:
                    coins_change.append(Money.TWOHUNDRED.value)
                    change -= 200
                elif change >= 100 and change < 200:
                    coins_change.append(Money.ONEHUNDRED.value)
                    change -= 100
                elif change >= 50 and change < 100:
                    coins_change.append(Money.FIFTY.value)
                    change -= 50
                elif change >= 10 and change < 50:
                    coins_change.append(Money.TEN.value)
                    change -= 10
                elif change >= 5 and change < 10:
                    coins_change.append(Money.FIVE.value)
                    change -= 5
                else:
                    break
            
            return "Compra de " + str(product) + " hecha con exito" + "\nCambio: " + str(coins_change)

print(buy("fideos", [Money.ONEHUNDRED.value, Money.TEN.value, Money.TEN.value, Money.TEN.value]))
print(buy("carne", [Money.ONEHUNDRED.value, Money.TEN.value, Money.TEN.value, Money.TEN.value]))
