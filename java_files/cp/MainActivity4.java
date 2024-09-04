package com.example.cp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity4 extends AppCompatActivity {
    Button b1,b2,b3,b4;
    String name;
    ImageButton p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        b1 = (Button) findViewById(R.id.b4);
        b2 = (Button) findViewById(R.id.b5);
        b3 = (Button) findViewById(R.id.b6);
        p = (ImageButton) findViewById(R.id.ib);
        b4 = (Button) findViewById(R.id.button);
        Bundle extras = getIntent().getExtras();
        name = extras.getString("val1");
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent zt = new Intent(getApplicationContext(), MainActivity19.class);
                zt.putExtra("val2",name);
                startActivity(zt);
            }
        });
    }
    public void mad(View view)
    {
        Intent m = new Intent(this, MainActivity5.class);
        startActivity(m);
    }
    public void java(View view)
    {
        Intent j = new Intent(this, MainActivity6.class);
        startActivity(j);
    }
    public void python(View view)
    {
        Intent p = new Intent(this, MainActivity7.class);
        startActivity(p);
    }
    public void profile(View view)
    {
        Intent pf = new Intent(this, MainActivity8.class);
        pf.putExtra("val3",name);
        startActivity(pf);
    }

}