---

# Juego de Bingo - En Java

![logo](https://static.vecteezy.com/system/resources/thumbnails/021/948/784/small/bingo-lottery-balls-and-tickets-background-vector.jpg)


Este es un juego de Bingo sencillo implementado en Java. El juego simula un cartón de Bingo donde se sortean números aleatorios del 1 al 90, y el jugador marca los números en su cartón. El juego termina cuando el jugador obtiene un "Bingo" (es decir, todos los números del cartón están marcados).

## Características:
- El juego genera aleatoriamente un cartón de Bingo para el jugador con 3 filas y 9 columnas.
- Cada fila contiene 5 números aleatorios, y el resto están vacíos.
- Los números se sortean aleatoriamente y se marcan en el cartón del jugador.
- El juego verifica si se ha formado una "Línea" cuando una fila está completamente marcada.
- El juego verifica si se ha obtenido un "Bingo" cuando todos los números en el cartón están marcados.
- El programa asegura que ciertos mensajes, como el inicio del juego o cuando se logra una línea o Bingo, se impriman solo una vez.

## Cómo Jugar:
1. Cuando el juego comienza, se muestra el cartón de Bingo.
2. A medida que se sortean los números, se van marcando en el cartón si existen.
3. Observa las filas y columnas para ver si has completado una "Línea" o un "Bingo".
4. Presiona Enter para continuar sorteando números hasta que se logre un "Bingo".

---

## Desglose del Código

### 1. `printOnce(String message)`
Esta función asegura que un mensaje se imprima solo una vez durante el juego. Utiliza una variable booleana `printed` para verificar si el mensaje ya ha sido impreso.

### 2. `crearCarton()`
Esta función genera el cartón de Bingo. Inicializa una matriz de 3x9 (cartón), donde cada fila tiene 5 números aleatorios, y el resto de las columnas están vacías. Los números se asignan aleatoriamente al cartón.

### 3. `imprimirCarton(int[][] carton)`
Esta función imprime el cartón de Bingo en un formato amigable para el usuario, mostrando los números y marcando los que han sido sorteados (con `x`) y los espacios vacíos (`[ ]`).

### 4. `jugarBingo()`
Esta es la función principal que ejecuta el juego de Bingo. Ella:
- Crea e imprime el cartón de Bingo.
- Sortea números aleatorios entre 1 y 90.
- Marca los números en el cartón y verifica si se ha formado una fila completa ("Línea").
- Si todos los números están marcados, el juego anuncia "¡Bingo!" y termina.

---

## Requisitos
- **Java 8** o posterior instalado en tu sistema.

## Cómo Ejecutar:
1. Copia el código en un archivo llamado `Bingo.java`.
2. Abre tu terminal o línea de comandos.
3. Navega hasta el directorio donde guardaste el archivo `Bingo.java`.
4. Compila el programa ejecutando el siguiente comando:
   ```
   javac Bingo.java
   ```
5. Ejecuta el programa escribiendo:
   ```
   java Bingo
   ```

El juego comenzará y podrás interactuar con él a través de la consola.

---

## Ejemplo de Salida

```
¡Comienza el Bingo!

Cartón:
[ 7] [  ] [24] [  ] [  ] [ ] [53] [63] [ ] 
[  ] [  ] [13] [  ] [  ] [ ] [61] [ ] [73] 
[  ] [25] [  ] [43] [  ] [  ] [65] [72] [ ] 

Número sorteado: 55

Cartón:
[ 7] [  ] [24] [  ] [  ] [ ] [53] [63] [ ] 
[  ] [  ] [13] [  ] [  ] [ ] [61] [ ] [73] 
[  ] [25] [  ] [43] [  ] [  ] [65] [72] [ ] 

Presiona Enter para continuar...
```

---

### Únete a Nuestra Comunidad

¿Eres un fanático de los juegos de mesa o los juegos de Bingo? Conéctate con nosotros en [GitHub](https://github.com/mario.conf/) para acceder a nuestros últimos proyectos, colaboraciones y código abierto. Forma parte de una comunidad apasionada por la diversión y la creatividad en el mundo de los juegos.

### Conecta conmigo

Sigue nuestra travesía en el mundo de los juegos de Bingo y la diversión. Conéctate con nosotros en [Instagram](https://www.instagram.com/mario.conf/) para contenido exclusivo y emocionante. ¡Te esperamos en nuestra comunidad!

---




---

# Bingo Game - In Java

![logo](https://static.vecteezy.com/system/resources/thumbnails/021/948/784/small/bingo-lottery-balls-and-tickets-background-vector.jpg)


This is a simple Bingo game implemented in Java. The game simulates a Bingo card where numbers are randomly drawn from 1 to 90, and the player marks the numbers on their card. The game ends when the player gets a "Bingo" (i.e., all the numbers on the card are marked).

## Features:
- The game randomly generates a Bingo card for the player with 3 rows and 9 columns.
- Each row contains 5 random numbers, and the rest are empty.
- Numbers are drawn randomly and marked on the player's card.
- The game checks for a "Línea" (line) when a row is fully marked.
- The game checks for a "Bingo" when all numbers on the card are marked.
- The program ensures that certain messages, such as the start of the game or when a line or Bingo is achieved, are printed only once.

## How to Play:
1. When the game starts, the Bingo card is displayed.
2. As numbers are drawn, they are marked on the card if they exist.
3. Watch the rows and columns to see if you've completed a "Línea" or a "Bingo."
4. Press Enter to continue drawing numbers until a "Bingo" is achieved.

---

## Code Breakdown

### 1. `printOnce(String message)`
This function ensures that a message is printed only once during the game. It uses a boolean variable `printed` to check if the message has already been printed.

### 2. `crearCarton()`
This function generates the Bingo card. It initializes a 3x9 matrix (card), where each row has 5 random numbers, and the remaining columns are empty. The numbers are randomly assigned to the card.

### 3. `imprimirCarton(int[][] carton)`
This function prints the Bingo card in a user-friendly format, showing the numbers and marking the ones that have been drawn (with `x`) and the empty spaces (`[ ]`).

### 4. `jugarBingo()`
This is the main function that runs the Bingo game. It:
- Creates and prints the Bingo card.
- Randomly selects numbers between 1 and 90.
- Marks numbers on the card and checks if a complete row ("Línea") is achieved.
- If all numbers are marked, the game announces "Bingo!" and ends.

---

## Requirements
- **Java 8** or later installed on your system.

## How to Run:
1. Copy the code into a file named `Bingo.java`.
2. Open your terminal or command prompt.
3. Navigate to the directory where `Bingo.java` is saved.
4. Compile the program by running the following command:
   ```
   javac Bingo.java
   ```
5. Run the program by typing:
   ```
   java Bingo
   ```

The game will start, and you can interact with it through the console.

---

## Example Output

```
The Bingo game begins!

Card:
[ 7] [  ] [24] [  ] [  ] [ ] [53] [63] [ ] 
[  ] [  ] [13] [  ] [  ] [ ] [61] [ ] [73] 
[  ] [25] [  ] [43] [  ] [  ] [65] [72] [ ] 

Drawn number: 55

Card:
[ 7] [  ] [24] [  ] [  ] [ ] [53] [63] [ ] 
[  ] [  ] [13] [  ] [  ] [ ] [61] [ ] [73] 
[  ] [25] [  ] [43] [  ] [  ] [65] [72] [ ] 

Press Enter to continue...
```

---

### Join Our Community

Are you a fan of board games or Bingo? Connect with us on [GitHub](https://github.com/mario.conf/) to access our latest projects, collaborations, and open-source code. Become part of a community passionate about fun and creativity in the world of games.

### Connect with Me

Follow our journey in the world of Bingo games and fun. Connect with us on [Instagram](https://www.instagram.com/mario.conf/) for exclusive and exciting content. We look forward to having you in our community!

---

