package com.example.asssingment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void backClick(View view) {
        Intent intent = new Intent(this, sample_page.class);
        startActivity(intent);
    }
    public void supportClick(View view) {
        Intent intent = new Intent(this, sample_page.class);
        startActivity(intent);
    }
    public void editProfileClick(View view) {
        Intent intent = new Intent(this, sample_page.class);
        startActivity(intent);
    }
    public void credGarageClick(View view) {
        Intent intent = new Intent(this, sample_page.class);
        startActivity(intent);
    }
    public void creditScoreClick(View view) {
        Intent intent = new Intent(this, sample_page.class);
        startActivity(intent);
    }
    public void lifetimecashback(View view) {
        Intent intent = new Intent(this, sample_page.class);
        startActivity(intent);
    }
    public void bankBalanceClick(View view) {
        Intent intent = new Intent(this, sample_page.class);
        startActivity(intent);
    }
    public void cashbackClick(View view) {
        Intent intent = new Intent(this, sample_page.class);
        startActivity(intent);
    }
    public void coinsClick(View view) {
        Intent intent = new Intent(this, sample_page.class);
        startActivity(intent);
    }
    public void referClick(View view) {
        Intent intent = new Intent(this, sample_page.class);
        startActivity(intent);
    }
    public void allTransactionsClick(View view) {
        Intent intent = new Intent(this, sample_page.class);
        startActivity(intent);
    }




}