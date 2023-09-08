#
#  Reto #29
#  ORDENA LA LISTA
#  Fecha publicación enunciado: 18/07/22
#  Fecha publicación resolución: 26/07/22
#  Dificultad: FÁCIL
#
#  Enunciado: Crea una función que ordene y retorne una matriz de números.
#  - La función recibirá un listado (por ejemplo [2, 4, 6, 8, 9]) y un parámetro adicional
#    "Asc" o "Desc" para indicar si debe ordenarse de menor a mayor o de mayor a menor.
#  - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
#
#  Información adicional:
#  - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
#  - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
#  - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
#  - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
#

def sort_list(sort_method, list):

    if len(list) == 0:
        return []

    if sort_method != "Asc" and sort_method != "Desc":
        return "Método de ordenamiento invalido"

    if sort_method == "Asc":
        swap = True
        while swap:
            swap = False
            for i in range(len(list) - 1):
                if list[i] > list[i + 1]:
                    list[i], list[i+1] = list[i+1], list[i]
                    swap = True
    else:
        swap = True
        while swap:
            swap = False
            for i in range(len(list) - 1):
                if list[i] < list[i + 1]:
                    list[i], list[i+1] = list[i+1], list[i]
                    swap = True
    return list


print(sort_list("Asc", [3, 4, 1, 2]))
print(sort_list("Desc", [3, 4, 1, 2]))
# print(sort_list("Asc", [3, 4, 1, "2"])) # Error
