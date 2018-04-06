package com.example.aldy.papado;

/**
 * Created by DBSS014 on 4/6/2018.
 */

public class UserProfil {
    private String namaUser, emailUser, notelpUser;

    public UserProfil(String namaUser, String emailUser, String notelpUser) {
        this.namaUser = namaUser;
        this.emailUser = emailUser;
        this.notelpUser = notelpUser;
    }

    public UserProfil() {
    }

    public String getNamaUser() {
        return namaUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public String getNotelpUser() {
        return notelpUser;
    }
}
