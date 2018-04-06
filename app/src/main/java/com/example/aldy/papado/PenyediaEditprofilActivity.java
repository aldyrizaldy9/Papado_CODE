package com.example.aldy.papado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PenyediaEditprofilActivity extends AppCompatActivity {
    private Button save, editfoto;
    private TextView namavenue, namapenyedia, alamat, notelp, jambuka, jamtutup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyedia_editprofil);
        save = findViewById(R.id.penyedia_save_editprofile);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //kalau save diklik
                Intent intent = new Intent(PenyediaEditprofilActivity.this, PenyediaProfilActivity.class);
                startActivity(intent);
                finish();
            }
        });

        editfoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //kalau simpan foto
            }
        });

        namavenue = findViewById(R.id.penyedia_edit_venue);
        namapenyedia = findViewById(R.id.penyedia_edit_nama);
        alamat = findViewById(R.id.penyedia_edit_alamat);
        notelp = findViewById(R.id.penyedia_edit_notelp);
        jambuka = findViewById(R.id.penyedia_edit_jambuka);
        jamtutup = findViewById(R.id.penyedia_edit_jamtutup);

    }
}
