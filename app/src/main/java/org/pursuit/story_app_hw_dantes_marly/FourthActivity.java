package org.pursuit.story_app_hw_dantes_marly;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.FitWindowsFrameLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Random;



public class FourthActivity extends AppCompatActivity {
    static String FOUR;
    static String EXTRA_MESSAGE;
    static String EXTRA_MESSAGE2;
    static String EXTRA_MESSAGE3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        EXTRA_MESSAGE = getIntent().getStringExtra(MainActivity.NAME);
        EXTRA_MESSAGE2 = getIntent().getStringExtra(SecondActivity.TWO);
        EXTRA_MESSAGE3 = getIntent().getStringExtra(ThirdActivity.THREE);
        final EditText EXTRA_MESSAGE4 = findViewById(R.id.fourthEdit);
        final String FOUR = EXTRA_MESSAGE4.getText().toString();

        ConstraintLayout cl = findViewById(R.id.fourthLayout);
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        cl.setBackgroundColor(color);

        Button button = findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentFour = new Intent(FourthActivity.this, FifthActivity.class);
                intentFour.putExtra(EXTRA_MESSAGE, EXTRA_MESSAGE2);
                intentFour.putExtra(EXTRA_MESSAGE3,FOUR);
                startActivity(intentFour);
            }


        });
    }

}

