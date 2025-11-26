/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bragantialessandropunto2;
import java.util.Random;
import java.util.Scanner;

public class Test {
    private Punto p1;
    private Punto p2;
    private Cerchio c;

    public void avviaTest() {
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        // Generazione casuale delle coordinate
        int xP = r.nextInt(20) + 1;
        int yP = r.nextInt(20) + 1;
        int xQ = r.nextInt(20) + 1;
        int yQ = r.nextInt(20) + 1;
        int raggio=r.nextInt(7)+1;

        // Creazione oggetti
        p1 = new Punto(xP, yP);
        p2 = new Punto(xQ, yQ);
        c=new Cerchio(p1.getX(),p1.getY(),raggio);
        //output
        System.out.println("Distanza di p1 dall'origine: " + p1.distanzaOrigine());
        System.out.println("Distanza tra p1 e p2: " + p1.distanzaAltroPunto(p2));
        System.out.println("distanza di cerchio c dall'origine: "+c.calcolaDistanzaOrigineCerchio());
        //controllo se il punto creato è già dentro al quadrato
        
        String risposta = "s";//forzo l'entrata nel ciclo
        
        // Ciclo finché l’utente vuole continuare e il punto non è dentro
        while (risposta.equals("s")) {
            System.out.println("Vuoi spostare il punto? (s/n): ");
            risposta = input.nextLine();

            if (risposta.equals("s")) {
                // Spostamento casuale in direzione casuale
                int xS = r.nextInt(5) - 2;  // genera valori -2, -1, 0, 1, 2
                int yS = r.nextInt(5) - 2;
                p1.spostamento(xS, yS);
                System.out.println("Nuova posizione del punto: " + p1);   
                System.out.println("distanza di cerchio c dall'origine: "+c.calcolaDistanzaOrigineCerchio());

            }
        }
    }
}
