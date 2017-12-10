/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenralla;

import java.util.Scanner;

/**
 *
 * @author ait98
 */
public class TresEnRalla {

    /**
     * @param args the command line arguments
     */
    static Tablero tablero = new Tablero(new String[3][3]);
    static Player player1 = new Player("player 1");
    static Player player2 = new Player("player 2");
    static int count = -1;

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        boolean acabat = false;
        int entrada;
        System.out.println("Introduce el nombre del jugador 1:");
        player1.setName(read.next());
        System.out.println("Introduce el nombre del jugador 2:");
        player2.setName(read.next());
        inicializarTablero();
        while (!acabat) {
            if (controlarTurno()) {
                System.out.println("Turno de " + player1.getName());
            }else{
               System.out.println("Turno de " + player2.getName()); 
            }
            imprimirTablero();
            entrada = read.nextInt();
            
        }

    }

    public static void inicializarTablero() {
        for (int i = 0; i < tablero.getTablero().length; i++) {
            for (int j = 0; j < tablero.getTablero()[i].length; j++) {
                tablero.getTablero()[i][j] = String.valueOf(i)+ "," + j;
            }
        }
    }

    public static void imprimirTablero() {
        for (int i = 0; i < tablero.getTablero().length; i++) {
            System.out.println("");
            System.out.println("");
            for (int j = 0; j < tablero.getTablero()[i].length; j++) {

                System.out.print(tablero.getTablero()[i][j] + "   ");
            }
        }
    }
    
    public static boolean controlarTurno(){
        count++;
        if (count % 2 == 0) {
            return true;
        }
        return false;
    }
}
