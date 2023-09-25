package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxRambut, checkBoxKumis, checkBoxAlis, checkBoxJanggut;
    private ImageView imageViewRambut, imageViewKumis, imageViewAlis, imageViewJanggut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi CheckBox dan ImageView
        checkBoxRambut = findViewById(R.id.checkBoxRambut);
        checkBoxKumis = findViewById(R.id.checkBoxKumis);
        checkBoxAlis = findViewById(R.id.checkBoxAlis);
        checkBoxJanggut = findViewById(R.id.checkBoxJanggut);

        imageViewRambut = findViewById(R.id.hair);
        imageViewKumis = findViewById(R.id.moustache);
        imageViewAlis = findViewById(R.id.eyebrow);
        imageViewJanggut = findViewById(R.id.beard);

        checkBoxRambut.setChecked(true);
        checkBoxKumis.setChecked(true);
        checkBoxAlis.setChecked(true);
        checkBoxJanggut.setChecked(true);

        // Mengatur listener untuk CheckBox
        checkBoxRambut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleImageViewVisibility(imageViewRambut, checkBoxRambut.isChecked());
            }
        });

        checkBoxKumis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleImageViewVisibility(imageViewKumis, checkBoxKumis.isChecked());
            }
        });

        checkBoxAlis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleImageViewVisibility(imageViewAlis, checkBoxAlis.isChecked());
            }
        });

        checkBoxJanggut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleImageViewVisibility(imageViewJanggut, checkBoxJanggut.isChecked());
            }
        });
    }

    // Method untuk menampilkan atau menyembunyikan ImageView berdasarkan status CheckBox
    private void toggleImageViewVisibility(ImageView imageView, boolean isVisible) {
        if (isVisible) {
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.INVISIBLE);
        }
    }
}
