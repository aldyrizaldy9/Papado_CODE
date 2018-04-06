package com.example.aldy.papado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserEditProfilActivity extends AppCompatActivity {
    private Button save, editfoto;
    private TextView nama,alamat,notelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_edit_profil);

        nama = findViewById(R.id.user_edit_nama);
        notelp = findViewById(R.id.user_edit_notelp);

        save = findViewById(R.id.user_save_editprofile);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserEditProfilActivity.this, UserProfilActivity.class);
                startActivity(intent);
                finish();
            }
        });

        editfoto = findViewById(R.id.user_edit_foto);
        editfoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //kalau edit foto diklik
            }
        });
    }
}
