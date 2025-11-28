/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package bragantialessandropunto2;

/**
 * 
 * @author braganti.alessandro
 */
public class Cerchio extends Punto {
    private int raggio;

    public Cerchio(int x, int y, int raggio) {
        super(x, y);
        this.raggio = raggio;
    }

    /**
     * Distanza del bordo del cerchio dall'origine
     */
    public double distanzaOrigineCerchio() {
        return super.distanzaOrigine() - this.raggio;
    }

    /**
    * Getter raggio 
    */
    public int getRaggio() {
        return raggio;
    }

    /**
     * Setter raggio 
     */
    public void setRaggio(int raggio) {
        this.raggio = raggio;
    }

    /**
     * Controlla se questo cerchio si interseca con un altro cerchio
     */
    public boolean interseca(Cerchio c) {
        double distanzaCentri = this.distanzaAltroPunto(c);
        int sommaRaggi = this.raggio + c.raggio;
        int diffRaggi = Math.abs(this.raggio - c.raggio);
        return distanzaCentri <= sommaRaggi && distanzaCentri >= diffRaggi;
    }
}
