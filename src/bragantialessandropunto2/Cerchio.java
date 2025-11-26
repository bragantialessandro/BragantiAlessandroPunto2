/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bragantialessandropunto2;

/**
 *
 * @author braganti.alessandro
 */
public class Cerchio extends Punto {
    private int r;
    
    public Cerchio(int x,int y,int r){
        super(x,y);
        this.r=r;
    }
    public double calcolaDistanzaOrigineCerchio(){
        return super.distanzaOrigine()-this.r;
    }
}
