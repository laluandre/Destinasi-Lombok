package com.example.tempatwisatadilombok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String title = "Destinasi Lombok";
    private RecyclerView rvDestination;
    public ArrayList<Destinasi> list = new ArrayList<>();
    MenuItem itemAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);
        rvDestination = findViewById(R.id.destination);
        itemAction = findViewById(R.id.action_about);
        rvDestination.setHasFixedSize(true);
        list.addAll(DataDestinasi.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvDestination.setLayoutManager(new LinearLayoutManager(this));
        ListDestinasiAdapter listDestinasiAdapter = new ListDestinasiAdapter(list);
        rvDestination.setAdapter(listDestinasiAdapter);

        listDestinasiAdapter.setOnItemClickCallback(new ListDestinasiAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Destinasi data) {
                String getNama = data.getNama();
                Bundle bundle = new Bundle();
                bundle.putInt("image",data.getFoto());
                String getLokasi = data.getLokasi();
                String getDeskripsi = data.getDeskripsi();
                Intent senddata = new Intent(MainActivity.this, DeskripsiDestinasi.class);
                senddata.putExtra(DeskripsiDestinasi.EXTRA_NAME, getNama);
                senddata.putExtras(bundle);
                senddata.putExtra(DeskripsiDestinasi.EXTRA_LOCATION, getLokasi);
                senddata.putExtra(DeskripsiDestinasi.EXTRA_DESCRIPTION, getDeskripsi);
                startActivity(senddata);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_about:
                Intent intent = new Intent(this, AboutMe.class);
                startActivity(intent);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
