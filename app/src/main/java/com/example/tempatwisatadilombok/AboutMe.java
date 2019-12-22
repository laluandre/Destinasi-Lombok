package com.example.tempatwisatadilombok;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class AboutMe extends AppCompatActivity {
    private String title = "Destinasi Lombok";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
