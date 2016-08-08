package com.lp.trynus;

import android.media.Image;
import android.provider.MediaStore;

import java.util.Vector;

/**
 * Created by root on 5/2/16.
 */
public class GALLERY {


    private Vector <Image> immagini;
    private Vector <MediaStore.Video> videos;


    public GALLERY (){


    }


    public void insertImage (Image img){

        this.immagini.add(img);

    }

    public void insertVideo (MediaStore.Video video){

        this.videos.add(video);

    }

}
