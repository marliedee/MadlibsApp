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

public class SixthActivity extends AppCompatActivity {
    static String SIX;
    static String EXTRA_MESSAGE;
    static String EXTRA_MESSAGE2;
    static String EXTRA_MESSAGE3;
    static String EXTRA_MESSAGE4;
    static String EXTRA_MESSAGE5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);;

        EXTRA_MESSAGE5 = getIntent().getStringExtra(FifthActivity.FIVE);
        final EditText EXTRA_MESSAGE6 = findViewById(R.id.sixthEdit);
        final String SIX = EXTRA_MESSAGE6.getText().toString();


        ConstraintLayout cl = findViewById(R.id.sixthLayout);
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        cl.setBackgroundColor(color);



        Button button = findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentSix = new Intent(SixthActivity.this, SeventhActivity.class);
                intentSix.putExtra(EXTRA_MESSAGE, EXTRA_MESSAGE2);
                intentSix.putExtra(EXTRA_MESSAGE3, EXTRA_MESSAGE4);
                intentSix.putExtra(EXTRA_MESSAGE5, SIX);
                startActivity(intentSix);
            }


        });
    }

}

