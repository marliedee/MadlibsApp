package org.pursuit.story_app_hw_dantes_marly;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Random;

public class SeventhActivity extends AppCompatActivity {

    static String SEVEN;
    static String EXTRA_MESSAGE;
    static String EXTRA_MESSAGE2;
    static String EXTRA_MESSAGE3;
    static String EXTRA_MESSAGE4;
    static String EXTRA_MESSAGE5;
    static String EXTRA_MESSAGE6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        EXTRA_MESSAGE6 = getIntent().getStringExtra(SixthActivity.SIX);

        final EditText EXTRA_MESSAGE7 = findViewById(R.id.seventhEdit);
        String SEVEN = EXTRA_MESSAGE7.getText().toString();

        ConstraintLayout cl = findViewById(R.id.seventhLayout);
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        cl.setBackgroundColor(color);

        Button button = findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentSeven = new Intent(SeventhActivity.this, LastActivity.class);
                intentSeven.putExtra(EXTRA_MESSAGE, EXTRA_MESSAGE2);
                intentSeven.putExtra(EXTRA_MESSAGE3, EXTRA_MESSAGE4);
                intentSeven.putExtra(EXTRA_MESSAGE5, EXTRA_MESSAGE6);
                startActivity(intentSeven);
            }


        });
    }

}

