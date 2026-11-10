/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garatiro;
import java.util.Random;

/**
 *
 * @author bertoli.cristian
 */
public class Arciere {
    
    private String nome;
    private int[] tiri = new int[5];
    private int punteggioFinale;

    public Arciere(String nome) {
        this.nome = nome;
        this.punteggioFinale = punteggioFinale;
    }

    /*
    metodo che mi permette di fare 5 tiri con punteggio random compeso tra 0 e 10
    */
    
    public void gareggia() {
        /*
        genera randomizzatore
        */
        Random r = new Random();
        
        for (int i = 0; i < tiri.length; i++) {
            /*
            genera numero random da 0 a 10
            */
            int punteggioRandom = r.nextInt(11);
            /*
            riempie il vettore con i numeri random
            */
            tiri[i] = punteggioRandom;
        }
        
        /*
        stampa il vettore
        */
        for (int i = 0; i < tiri.length; i++) {
            System.out.print("[" + tiri[i] + "]");
        }
    }
    
    /*
    punteggio finale dato dalla somma dei 3 tiri migliori
    */
    
    public void puntiFinali(){
        /*
        metto in ordine crescente i valori dell' array
        */
        for (int i = 0; i < tiri.length; i++){
            for (int j = i+1; j < tiri.length; j++){
                if (tiri[i] > tiri[j]){
                    int temp = tiri[i];
                    tiri[i] = tiri[j];
                    tiri[j] = temp;
                }
            }
        }
        /*
        sommo i 3 punteggi più alti registrati dai tiri dell' arciere
        */
        punteggioFinale = tiri[2] + tiri[3] + tiri[4];
        
        System.out.println();
        /*
        stampo il punteggio finale
        */
        System.out.println("punteggio finale: " + punteggioFinale);
    }
    /*
    ritorno il valore del punteggio finale
    */
    public int getPunteggioFinale(){
        return punteggioFinale;
    }
    /*
    ritorno il nome dell' arciere
    */
    public String getNome(){
        return nome;
    }
}
