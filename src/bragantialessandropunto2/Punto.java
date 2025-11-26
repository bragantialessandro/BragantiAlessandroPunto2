/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 * costruttore
 */
    public Punto() {
      this.x = 1;
      this.y = 1;
    }
/**
 * costruttore parametrizzato
 * @param x
 * @param y 
 */
    public Punto(int x, int y) {
        this.x = Math.max(1, x);
        this.y = Math.max(1, y);
    }
    /**
     * 
     * @return restituisce coordinata x
     */
    public int getX() {
        return this.x;
    }
    /**
     * 
     * @return restituisce coordinata y
     */
    public int getY() {
        return this.y;
    }
    /**
     * 
     * @param x mette all'attributo x il valore del parametro x
     */
    public void setX(int x) {
        this.x = x;
    }
    /**
     * 
     * @param y mette all'attributo x il valore del parametro y
     */
    public void setY(int y) {
        this.y = y;
    }
    /**
     * 
     * @return la distanza dal punto all'origine
     */
    public double distanzaOrigine() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    /**
     * 
     * @param p punto n2 che si prende come estremo per del segmento di distanza
     * @return distanza da punto n1 al punto n2(parametro) 
     */
    public double distanzaAltroPunto(Punto p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }
    /**
     * 
     * @param nuovoX incremento coordinata x
     * @param nuovoY incremento coordinata y
     */
    public void spostamento(int nuovoX, int nuovoY) {
        this.x += nuovoX;
        this.y += nuovoY; this.x += nuovoX;
        this.y += nuovoY;
        // resta nel primo quadrante
        if (x < 1) x = 1;
        if (y < 1) y = 1;
    }
    /**
     * 
     * @return output della classe
     */
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
