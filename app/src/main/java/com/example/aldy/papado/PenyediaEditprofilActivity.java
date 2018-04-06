package com.example.aldy.papado;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.vansuita.pickimage.bean.PickResult;
import com.vansuita.pickimage.bundle.PickSetup;
import com.vansuita.pickimage.dialog.PickImageDialog;
import com.vansuita.pickimage.listeners.IPickResult;

public class PenyediaEditprofilActivity extends AppCompatActivity implements IPickResult {
    private Button save, editfoto;
    private TextView namavenue, namapenyedia, alamat, notelp, jambuka, jamtutup;
    Bitmap mGallery;
    Uri mUri, dlUri;
    String mPath;

    @Override
    public void onPickResult(PickResult r) {
        if (r.getError() == null) {
            mGallery = r.getBitmap();
            mUri = r.getUri();
            mPath = r.getPath();
            Toast.makeText(this, r.getUri() + "  " + r.getPath(), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, r.getError().getMessage(), Toast.LENGTH_LONG).show();
        }
    }

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

        editfoto = findViewById(R.id.penyedia_edit_foto);
        editfoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //kalau simpan foto
                PickImageDialog.build(new PickSetup()).show(PenyediaEditprofilActivity.this);


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
