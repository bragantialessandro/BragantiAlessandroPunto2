/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bragantialessandropunto2;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author braganti.alessandro
 */
public class Test {
    private Punto p1;
    private Punto p2;
    private Cerchio c1;
    private Cerchio c2;
    private Scanner s = new Scanner(System.in);
    private Random random = new Random();

    /**
     * Metodo principale per avviare il test
     */
    public void avviaTest() {
        creaPuntiCasuali();
        creaCerchiCasuali();

        stampaInfoPunti();
        stampaInfoCerchi();

        gestisciSpostamenti();
        controllaIntersezioneCerchi();
    }

    /** 
     * due punti casuali 
     */
    private void creaPuntiCasuali() {
        p1 = new Punto(random.nextInt(20) + 1, random.nextInt(20) + 1);
        p2 = new Punto(random.nextInt(20) + 1, random.nextInt(20) + 1);
    }

    /**
     * Crea due cerchi casuali
     */
    private void creaCerchiCasuali() {
        int raggio1 = random.nextInt(7) + 1;
        int raggio2 = random.nextInt(7) + 1;
        c1 = new Cerchio(p1.getX(), p1.getY(), raggio1);
        c2 = new Cerchio(p2.getX(), p2.getY(), raggio2);
    }

    /** 
     * Stampa informazioni sui punti 
     */
    private void stampaInfoPunti() {
        System.out.println("Punto p1: " + p1 + " | Distanza dall'origine: " + p1.distanzaOrigine());
        System.out.println("Punto p2: " + p2 + " | Distanza dall'origine: " + p2.distanzaOrigine());
        System.out.println("Distanza tra p1 e p2: " + p1.distanzaAltroPunto(p2));
    }

    /** 
     * informazioni sui cerchi
     */
    private void stampaInfoCerchi() {
        System.out.println("Cerchio c1: centro " + c1 + ", raggio " + c1.getRaggio() +
                ", distanza bordo dall'origine: " + c1.distanzaOrigineCerchio());
        System.out.println("Cerchio c2: centro " + c2 + ", raggio " + c2.getRaggio() +
                ", distanza bordo dall'origine: " + c2.distanzaOrigineCerchio());
    }

    /**
     * Gestisce gli spostamenti del punto p1 
     */
    private void gestisciSpostamenti() {
        String risposta = "s"; // forzato per entrare nel ciclo iniziale
        while (risposta.equalsIgnoreCase("s")) {
            System.out.print("Vuoi spostare il punto p1? (s/n): ");
            risposta = s.nextLine();
            if (risposta.equalsIgnoreCase("s")) {
                int deltaX = random.nextInt(5) - 2; // -2..2
                int deltaY = random.nextInt(5) - 2;
                p1.spostamento(deltaX, deltaY);
                System.out.println("Nuova posizione del punto p1: " + p1);
            }
        }
    }

    /**
     * Controlla e stampa se i cerchi si intersecano 
     */
    private void controllaIntersezioneCerchi() {
        if (c1.interseca(c2)) {
            System.out.println("I cerchi c1 e c2 si intersecano.");
        } else {
            System.out.println("I cerchi c1 e c2 non si intersecano.");
        }
    }

}
