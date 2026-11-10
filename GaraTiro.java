/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.garatiro;
/**
 *
 * @author bertoli.cristian
 */
public class GaraTiro {

    public static void main(String[] args) {
        /*
        creo il primo arciere
        */
        Arciere a1 = new Arciere("mario");
        /*
        creo il secondo arciere
        */
        Arciere a2 = new Arciere("giacomo");
        /*
        faccio fare 5 tiri al primo arciere e ne calcolo il punteggio finale
        */
        a1.gareggia();
        a1.puntiFinali();
        /*
        faccio fare 5 tiri al secondo arciere e ne calcolo il punteggio finale
        */
        a2.gareggia();
        a2.puntiFinali();
        /*
        stampo l' esito finale della gara
        */
        if (a1.getPunteggioFinale() > a2.getPunteggioFinale()){
            System.out.println();
            System.out.println("ha vinto " + a1.getNome());
        }
        
        else if (a2.getPunteggioFinale() > a1.getPunteggioFinale()){
            System.out.println();
            System.out.println("ha vinto " + a2.getNome());
        }
        
        else {
            System.out.println();
            System.out.println("la gara tra " + a1.getNome() + " e " + a2.getNome() + " e finita in pareggio");
        }
    }
}
