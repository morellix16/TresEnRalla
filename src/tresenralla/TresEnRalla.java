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
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean acabat = false;        
        
        System.out.println("Introduce el nombre del jugador 1:");
        player1.setName(read.next());
        System.out.println("Introduce el nombre del jugador 2:");
        player2.setName(read.next());
        inicializarTablero();
        while (!acabat) {
            count++;
            if (controlarTurno()) {
                System.out.println("Turno de " + player1.getName());
            }else{
               System.out.println("Turno de " + player2.getName()); 
            }
            imprimirTablero();
            colocarCasilla();
            
        }

    }

    public static void inicializarTablero() {
        for (int i = 0; i < tablero.getTablero().length; i++) {
            for (int j = 0; j < tablero.getTablero()[i].length; j++) {
                tablero.getTablero()[i][j] = String.valueOf(i)+ "," + j;
            }
        }
    }
    public static void colocarCasilla(){
        String entrada;
        String [] aux;
        while(true){
        try{
            System.out.println("Introduce las coordenadas (x,y): ");
            entrada = read.next();
            aux = entrada.split(",");            
            if(tablero.getTablero()[Integer.parseInt(aux[0])][Integer.parseInt(aux[1])].equals("X")||tablero.getTablero()[Integer.parseInt(aux[0])][Integer.parseInt(aux[1])].equals("O")){
                System.out.println("Ya está en uso");
            }else{
                if(controlarTurno()){
               tablero.getTablero()[Integer.parseInt(aux[0])][Integer.parseInt(aux[1])]= "X";
                }else{
                tablero.getTablero()[Integer.parseInt(aux[0])][Integer.parseInt(aux[1])]= "O";
                }
                return ;
            }
            
            }catch(NumberFormatException e){
                System.out.println("Formato incorrecto ");
            }
            
            catch(IndexOutOfBoundsException e){
                System.out.println("Coordenadas incorrectas");
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
        
        if (count % 2 == 0) {
            return true;
        }
        return false;
    }
}
