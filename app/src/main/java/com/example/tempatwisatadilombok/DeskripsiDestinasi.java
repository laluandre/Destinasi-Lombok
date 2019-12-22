package com.example.tempatwisatadilombok;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class DeskripsiDestinasi extends AppCompatActivity {
    private String title = "Destinasi Lombok";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_LOCATION = "extra_loc";
    public static final String EXTRA_DESCRIPTION = "extra_desc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_destinasi);
        setActionBarTitle(title);

        TextView ReceivedNama = findViewById(R.id.nama_destinasi);
        ImageView ReceivedFoto = findViewById(R.id.foto);
        TextView ReceivedLoc = findViewById(R.id.loc_destinasi);
        TextView ReceivedDesk = findViewById(R.id.desk_destinasi);

        String nama = getIntent().getStringExtra(EXTRA_NAME);
        Bundle bundle = this.getIntent().getExtras();
        int pic = bundle.getInt("image");
        String lokasi = getIntent().getStringExtra(EXTRA_LOCATION);
        String deskripsi = getIntent().getStringExtra(EXTRA_DESCRIPTION);

        ReceivedNama.setText(nama);
        ReceivedFoto.setImageResource(pic);
        ReceivedLoc.setText(lokasi);
        ReceivedDesk.setText(deskripsi);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
