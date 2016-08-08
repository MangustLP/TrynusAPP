package com.lp.trynus;

import android.content.res.Resources;
import android.media.Image;

import java.util.Vector;

/**
 * Created by root on 4/25/16.
 * Classe per la gestione dei Dati
 * SINGLETON
 */
public class Data {
    private Vector<GITA> giteSet;
    private static Data instance = null;

    protected Data (){
    }

    public static Data  getIstance(){
        if (instance == null){
            instance = new Data();
        }
        return instance;
    }

    public boolean AGTD(GITA gita){ //Add Gita To Data

        try {
            giteSet.add(gita);
        }catch(Exception exc){
            return false;
        }
        return true;
    }

    public GITA GGFD(String nomeGita) throws NOTFoundException{ //Get Gita From Data

        GITA temp = new GITA(nomeGita,"0","0",null);
        int i = 0;
        try{
            for (i = 0; i<giteSet.size(); i ++){
                if (giteSet.elementAt(i).equals(temp)){ return giteSet.get(i);}
            }

            return null;

        }catch(Exception exc){
            throw new NOTFoundException();
        }

    }

}
