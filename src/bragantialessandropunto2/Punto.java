/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bragantialessandropunto2;

/**
 * 
 * @author braganti.alessandro
 */
public class Punto {
    protected int x;
    protected int y;

    /**
     * Costruttore di default 
     */
    public Punto() {
        this.x = 1;
        this.y = 1;
    }

    /**
     * Costruttore parametrizzato
     */
    public Punto(int x, int y) {
        this.x = Math.max(1, x);
        this.y = Math.max(1, y);
    }

    /**
     * Getter coordinata x
     */
    public int getX() {
        return x;
    }

    /**
     * Getter coordinata y
    */
    public int getY() {
        return y;
    }

    /**
     * Setter coordinata x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**Setter coordinata y 
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Distanza dall'origine 
     */
    public double distanzaOrigine() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    /**
     * Distanza da un altro punto
     */
    public double distanzaAltroPunto(Punto p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }

    /**
     * Sposta il punto di un incremento specificato
     * Resta nel primo quadrante
     */
    public void spostamento(int nuovoX, int nuovoY) {
        this.x += nuovoX;
        this.y += nuovoY;

        if (x < 1) x = 1;
        if (y < 1) y = 1;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
