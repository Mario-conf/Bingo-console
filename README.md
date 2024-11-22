---

# Bingo Game - Java Implementation

This is a simple Bingo game implemented in Java. The game simulates a Bingo card where numbers are drawn randomly from 1 to 90, and the player marks the numbers on their card. The game ends when the player gets a "Bingo" (i.e., all numbers on the card are marked).

## Features:
- The game randomly generates a Bingo card for the player with 3 rows and 9 columns.
- Each row contains 5 random numbers, and the rest are empty.
- Numbers are drawn randomly and marked on the player's card.
- The game checks for "Línea" (line) when a full row is marked.
- The game checks for "Bingo" when all numbers on the card are marked.
- The program ensures that certain messages, like the start of the game or when a line or Bingo is achieved, are only printed once.

## How the Game Works:
1. A Bingo card with 3 rows and 9 columns is generated. Each row has 5 random numbers, and the remaining cells are empty.
2. The program starts drawing random numbers from 1 to 90.
3. Whenever a drawn number matches one on the Bingo card, it gets marked with an `x`.
4. The program checks if any row has been fully marked (i.e., a "Línea").
5. Once all numbers on the card are marked, the program announces "Bingo!" and ends the game.
6. After each number is drawn, the player is prompted to press Enter to continue to the next number.

## How to Play:
1. When the game starts, the Bingo card is displayed.
2. As numbers are drawn, they are marked on the card if they exist.
3. Keep an eye on the rows and columns to see if you've completed a "Línea" or a "Bingo".
4. Press Enter to continue drawing numbers until a "Bingo" is achieved.

---

## Code Breakdown

### 1. `printOnce(String message)`
This function ensures that a message is printed only once during the game. It uses a boolean variable `printed` to check if the message has already been printed.

### 2. `crearCarton()`
This function generates the Bingo card. It initializes a 3x9 matrix (cartón), where each row has 5 random numbers, and the remaining columns are empty. The numbers are randomly assigned to the card.

### 3. `imprimirCarton(int[][] carton)`
This function prints the Bingo card in a user-friendly format, showing the numbers and marking the ones that have been drawn (with `x`) and the empty spaces (`[ ]`).

### 4. `jugarBingo()`
This is the main function that runs the Bingo game. It:
- Creates and prints the Bingo card.
- Randomly selects numbers between 1 and 90.
- Marks numbers on the card and checks if there is a complete row ("Línea").
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

## License:
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

This README should give a comprehensive overview of the program, explain how it works, and provide instructions for running the game.
