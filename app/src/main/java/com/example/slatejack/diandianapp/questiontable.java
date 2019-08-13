package com.example.slatejack.diandianapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class questiontable extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_questiontable );
        button=findViewById( R.id.makesure );
        button.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "反馈成功！", Snackbar.LENGTH_LONG)
                        .setAction("UNDO", null)
                        .show();
            }
        } );
    }
}
