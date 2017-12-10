/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenralla;

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
    public static void main(String[] args) {
        // TODO code application logic here
       inicializarTablero();
       imprimirTablero();
    }

    public static void inicializarTablero() {
        for (int i = 0; i < tablero.getTablero().length; i++) {
            for (int j = 0; j < tablero.getTablero()[i].length; j++) {
                tablero.getTablero()[i][j] = "A";
            }
        }
    }
    
    public static void imprimirTablero() {
        for (int i = 0; i < tablero.getTablero().length; i++) {
            System.out.println("");
            for (int j = 0; j < tablero.getTablero()[i].length; j++) {
                System.out.print(tablero.getTablero()[i][j] + " ");
            }
        }
    }
}
