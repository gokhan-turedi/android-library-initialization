package com.gturedi.init;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.gturedi.awesomelibrary.Ceday;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void test(View view) {
        Toast.makeText(this, Ceday.saySomeThing(), Toast.LENGTH_SHORT).show();
    }

}