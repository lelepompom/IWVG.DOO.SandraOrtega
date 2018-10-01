# Práctica Análisis y Diseño OO
#### Asignatura: *Ingeniería Web: Visión General*
#### [Máster en Ingeniería Web por la U.P.M.](http://miw.etsisi.upm.es)


### Descripción
Permite al usuario jugar al Master Mind:
▫ https://es.wikipedia.org/wiki/Mastermind con las
siguientes variaciones en la aplicación:
• Solicitará al usuario por consola si desea jugar contra la
máquina (partida) o que juegue la máquina sola (demo)
• En cualquier caso, generará automáticamente el código
secreto
• Para la partida, solicitará al usuario por consola la
combinación que desea intentar y mostrará
automáticamente el número de muertos (acierto en posición
y color) y de heridos (acierto en color y no en posición)
• Para la demo, se generarán intentos automáticos
aleatoriamente
• Cuando termine la partida tras 10 intentos fallidos o victoria
al coincidir el intento con el secreto, preguntará si desea
continuar

Interfaz de texto parecido a:
1. Partida
2. Demo
Opicón? 1<enter>
Secreto: ****
Intento? [cuatro letras de entre A-amarillo, R-rojo, V-verde, Z-azul,
B-blanco, N-negro] AARR<enter>
0 muertos y 2 heridos
Intento? [cuatro letras de entre A-amarillo, R-rojo, V-verde, Z-azul,
B-blanco, N-negro] NBAA<enter>
4 muertos!!! Victoria

Interfaz de texto parecido a:
1. Partida
2. Demo
Opicón? 2<enter>
Secreto: ****
Intento: [cuatro letras de entre A-amarillo, R-rojo, V-verde, Z-azul,
B-blanco, N-negro] AARR
0 muertos y 2 heridos
Intento: [cuatro letras de entre A-amarillo, R-rojo, V-verde, Z-azul,
B-blanco, N-negro] NBAA
4 muertos!!! Victoria
