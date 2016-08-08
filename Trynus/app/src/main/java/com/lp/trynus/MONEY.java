package com.lp.trynus;

import java.util.Vector;

/**
 * Created by root on 5/2/16.
 */
public class MONEY {

    // Definisco 3 vector, chi, quamnto , motivazione, in base agli indici riconosco tripletta.
    private Vector <String>  chi;
    private Vector <Integer> quanto;
    private Vector <String>  motivazione;

    public MONEY (){}

    public void insertSpesa (String chi, String motivazione, int Quanto){

        this.chi.add(chi);
        this.motivazione.add(motivazione);
        this.quanto.add(Quanto);

    }

    public void calcola(){
        //Calcola chi deve a chi quanto.
    }



}
