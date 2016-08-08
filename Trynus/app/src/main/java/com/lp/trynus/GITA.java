package com.lp.trynus;

import android.media.Image;

import java.util.Date;

/**
 * Created by root on 3/30/16.
 * Classe Gita
 */
public class GITA {

    private String name;
    private String dataInizio;
    private String dataFine;
    private int type;
    private Image defaultImg;
    private GALLERY gallery;
    private TRIP trip;
    private MONEY gestione_money;

    public GITA (String name, String dataInizio,String dataFine,Image defaultImg){ //Manca Weather,Itinerario,Gallery

        this.name = name;
        this.dataFine = dataFine;
        this.dataInizio = dataInizio;
        this.type = 0;//da Fare in base a DataInizio - DataFine Definisce se la gita è una gita lunga corta o media, ##Da implementare display di diverse grandezze delle gite
        this.defaultImg = defaultImg;
        this.gallery = new GALLERY();
        this.trip = new TRIP();
        this.gestione_money = new MONEY();

    }

    public String getDataInizio() {
        return this.dataInizio;
    }

    public String getDataFine() {
        return this.dataFine;
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public Image getDefaultImg() { return this.defaultImg;}

    public GALLERY getGallery(){ return this.gallery; }

    public TRIP getTrip(){ return this.trip; }

    public MONEY getTotaleSpeso(){ return null;} // mi serve un metodo nella classe MONEY per ritornare il totale speso.

    public void insertImageGallery()throws NOTFoundException{ //inserisco un immagine nella gallery

         //per ora null, debbo implementare la classe gallery.
    }

    public void insertVideoGallery()throws NOTFoundException{ //inserisco un Video nella gallery

          //per ora null, debbo implementare la classe gallery.

    }

    public void insertSpesa() throws Exception{  //metodo per inserire spesa
          //debbo iplementare MONEY
    }

    public boolean equals(Object obj){
        if (!(obj instanceof GITA)) return false;
        if (((GITA) obj).name == this.name ) return true;
        return false;
    }




}
