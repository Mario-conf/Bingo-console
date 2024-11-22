import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        jugarBingo();
    }

    //---------------------------------------------------------
    // Declarar la funcion printOnce que imprime el parametro solo la primera vez que le llega la orden no mas veces
    private static boolean printed = false; // Variable privada (permite ser usada solo dentro de la clase donde se declara) para controlar si ya se imprimió
    public static void printOnce(String message) {
        if (!printed) {
            System.out.println(message);
            printed = true; // Marcar como impreso
            }
        }
    //---------------------------------------------------------


    // Crear el cartón de bingo usando una matriz
    public static int[][] crearCarton() {
        int[][] carton = new int[3][9]; // Tres filas y nueve columnas

        // Inicializar el cartón con valores vacíos (-1 para representar vacío)
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                carton[i][j] = -1; // Vacío
            }
        }

        // Añadir 5 números aleatorios a cada fila
        for (int i = 0; i < carton.length; i++) {
            int numerosEnFila = 0;
            while (numerosEnFila < 5) {
                int col = (int) (Math.random() * carton[i].length); // Columna aleatoria
                if (carton[i][col] == -1) { // Si la columna está vacía
                    carton[i][col] = col * 10 + 1 + (int) (Math.random() * 10); // Valor aleatorio
                    numerosEnFila++;
                }
            }
        }
        return carton;
    }

    // Mostrar el cartón
    public static void imprimirCarton(int[][] carton) {
        System.out.println("\nCartón:");
        for (int i = 0; i < carton.length; i++) { // Filas
            for (int j = 0; j < carton[i].length; j++) { // Columnas
                if (carton[i][j] == -1) {
                    System.out.print("[  ] "); // Celda vacía
                } else if (carton[i][j] == -2) {
                    System.out.print("[x] "); // Número marcado
                } else {
                    System.out.printf("[%2d] ", carton[i][j]); // Número con formato
                }
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }

    // Jugar al bingo
    public static void jugarBingo() {
        int[][] carton = crearCarton();
        List<Integer> bolas = new ArrayList<>();
        for (int i = 1; i <= 90; i++) bolas.add(i);
        Collections.shuffle(bolas);

        Scanner scanner = new Scanner(System.in);
        printOnce("¡Comienza el Bingo!");
        imprimirCarton(carton);

        for (Integer bola : bolas) {
            System.out.println("\nNúmero sorteado: " + bola);

            // Marcar el número en el cartón si existe
            for (int i = 0; i < carton.length; i++) {
                for (int j = 0; j < carton[i].length; j++) {
                    if (carton[i][j] == bola) {
                        carton[i][j] = -2; // Marcar como [-]
                    }
                }
            }

            imprimirCarton(carton);

            // Verificar si hay línea
            for (int i = 0; i < carton.length; i++) {
                boolean linea = true; // Asumimos que la fila tiene línea
                for (int j = 0; j < carton[i].length; j++) { // Recorremos las columnas de la fila
                    if (carton[i][j] != -1 && carton[i][j] != -2) {
                        linea = false; // Si hay un número sin marcar, no hay línea
                        break;
                    }
                }
                if (linea) { // Si encontramos línea, terminamos el bucle
                    printOnce("\n¡Línea! ¡Felicidades!");
                    break;
                }
            }

            // Comprobar si hay bingo (todas las celdas están marcadas)
            boolean bingo = true;
            for (int i = 0; i < carton.length; i++) {
                for (int j = 0; j < carton[i].length; j++) {
                    if (carton[i][j] != -1 && carton[i][j] != -2) {
                        bingo = false;
                        break;
                    }
                }
            }
            if (bingo) {
                printOnce("\n¡Bingo! ¡Felicidades!");
                break;
            }
            System.out.println("Presiona Enter para continuar...");
            scanner.nextLine();
        }
        scanner.close();
    }
}
