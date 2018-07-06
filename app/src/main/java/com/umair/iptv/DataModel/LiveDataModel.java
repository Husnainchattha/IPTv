package com.umair.iptv.DataModel;

import java.io.Serializable;

public class LiveDataModel implements Serializable {
    public int imag;
    public String chanelname;

    public LiveDataModel(int imag, String chanelname) {
        this.imag = imag;
        this.chanelname = chanelname;
    }

    public int getImag() {
        return imag;
    }

    public void setImag(int imag) {
        this.imag = imag;
    }

    public String getChanelname() {
        return chanelname;
    }

    public void setChanelname(String chanelname) {
        this.chanelname = chanelname;
    }
}
