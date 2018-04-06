package com.example.aldy.papado;

/**
 * Created by DBSS014 on 4/6/2018.
 */

public class PenyediaProfil {
    private String alamat, namaVenue, namaPemilik, jambuka, jamtutup, notelp;

    public PenyediaProfil(String alamat, String namaVenue, String namaPemilik, String jambuka, String jamtutup, String notelp) {
        this.alamat = alamat;
        this.namaVenue = namaVenue;
        this.namaPemilik = namaPemilik;
        this.jambuka = jambuka;
        this.jamtutup = jamtutup;
        this.notelp = notelp;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNamaVenue() {
        return namaVenue;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public String getJambuka() {
        return jambuka;
    }

    public String getJamtutup() {
        return jamtutup;
    }

    public String getNotelp() {
        return notelp;
    }
}
