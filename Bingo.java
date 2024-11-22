import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        jugarBingo();
    }

    //---------------------------------------------------------
    private static boolean printed = false; 
    public static void printOnce(String message) {
        if (!printed) {
            System.out.println(message);
            printed = true; 
            }
        }
    //---------------------------------------------------------

    public static int[][] crearCarton() {
        int[][] carton = new int[3][9]; 
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                carton[i][j] = -1; // Vacío
            }
        }
        for (int i = 0; i < carton.length; i++) {
            int numerosEnFila = 0;
            while (numerosEnFila < 5) {
                int col = (int) (Math.random() * carton[i].length); 
                if (carton[i][col] == -1) { 
                    carton[i][col] = col * 10 + 1 + (int) (Math.random() * 10); 
                    numerosEnFila++;
                }
            }
        }
        return carton;
    }
    public static void imprimirCarton(int[][] carton) {
        System.out.println("\nCartón:");
        for (int i = 0; i < carton.length; i++) { 
            for (int j = 0; j < carton[i].length; j++) { 
                if (carton[i][j] == -1) {
                    System.out.print("[  ] "); 
                } else if (carton[i][j] == -2) {
                    System.out.print("[x] "); 
                } else {
                    System.out.printf("[%2d] ", carton[i][j]); 
                }
            }
            System.out.println(); 
        }
    }
    
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
            for (int i = 0; i < carton.length; i++) {
                for (int j = 0; j < carton[i].length; j++) {
                    if (carton[i][j] == bola) {
                        carton[i][j] = -2; 
                    }
                }
            }
            imprimirCarton(carton);
            for (int i = 0; i < carton.length; i++) {
                boolean linea = true; 
                for (int j = 0; j < carton[i].length; j++) {
                    if (carton[i][j] != -1 && carton[i][j] != -2) {
                        linea = false;
                        break;
                    }
                }
                if (linea) {
                    printOnce("\n¡Línea! ¡Felicidades!");
                    break;
                }
            }
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
