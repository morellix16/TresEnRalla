package tresenralla;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Susana
 */
public class Tablero {
    
    
    private String[] [] tablero;

    public Tablero(String[][] tablero) {
        this.tablero = tablero;
    }

    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }
    
    
}
