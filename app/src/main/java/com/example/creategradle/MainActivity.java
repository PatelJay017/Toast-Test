package com.example.creategradle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.test.RssFeedProvider;

public class MainActivity extends AppCompatActivity {
    RssFeedProvider RssFeedProvider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RssFeedProvider = new RssFeedProvider();

        RssFeedProvider.Toast(MainActivity.this, "hello Jay");
    }
}
