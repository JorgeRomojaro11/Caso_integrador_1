# Caso_integrador_1

https://github.com/JorgeRomojaro11/Caso_integrador_1.git


1.ejercicioPlaneta: Este módulo se encarga de simular el tiempo en un planeta específico. Crea una instancia de un planeta y un cronómetro cósmico, luego convierte el tiempo de la Tierra a tiempo del planeta y viceversa. El desafio más grande de este código es la creación de distintas clases, y al estas usar distintas mediciones, se complica el uso al poder confundirlas.

2.ejercicioRecursos: Este módulo se encarga de la gestión de recursos. Crea una lista de recursos y un monitor de recursos y calcula el consumo de recursos y muestra las estadísticas de los recursos. El mayor problema del código es la utilización de nivel y consumo, que no había utilizado antes.

3.ejercicioMonitoreo: Este módulo se encarga del monitoreo ambiental. Crea una lista de variables ambientales y un monitor ambiental y monitorea las variables ambientales. El mayor desafío fue que no funcionaba previamente debido a la creación de las variables dentro de una clase externa.

4.ejercicioTareas: Este módulo se encarga de la asignación de tareas. Crea una lista de miembros de la tripulación y tareas, y un administrador de tareas, luego asigna tareas a los miembros de la tripulación y ajusta la asignación si es necesario. El mayor desafío es la creación de un array para la repartición de tareas entre la tripulación.

5.ejercicioRutas: Este módulo se encarga de la planificación de rutas. Crea un mundo y un simulador, simula el terreno y los obstáculos, luego planifica y optimiza una ruta. El mayor problema del código fue la creación de la clase Ruta, al no coordinarse con el código del main al principio.

6.ejercicioMensaje: Este módulo se encarga de la comunicación. Crea un comunicador y un mensaje, envía el mensaje y recibe un mensaje. Fue el código que menos problemas dió, pero costó hacer que funcionase para entregar el mensaje de vuelta al ejecutar el main

El mayor desafío encontrado al completar el proyecto fue la creación de tests con junit5, una herramienta que no había usado nunca antes, y que me complicó el trabajo ya realizado al intentar testear las clases que contenia el main. Para esto, cree un test de junit5 al main, que permite poder probar cada uno de los módulos por separado al gusto para comprobar que son totalmente funcionales por si mismos, y no como en el main, que se ejecutan todos al mismo tiempo.

Las instrucciones para probar esto sería ir a la carpeta "testeo", que junto con la carpeta main, se encuentra dentro del src. Dentro, encontrarás el test realizado a java, encontrando dentro un test conjunto de todos los módulos y un test individual a cada módulo, que puede ejecutarse clicando las flechas de tets encontradas a la izquierda de cada módulo. 
