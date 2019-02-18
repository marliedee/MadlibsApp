package org.pursuit.story_app_hw_dantes_marly;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class LastActivity extends AppCompatActivity {
    private String NAME;
    private String TWO;
    private String THREE;
    private String FOUR;
    private String FIVE;
    private String SIX;
    private String SEVEN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        ConstraintLayout cl = findViewById(R.id.eightLayout);
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        cl.setBackgroundColor(color);

        Button button = findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentFinal = new Intent(LastActivity.this, LastActivity.class);
                Intent intent = getIntent();
                NAME = intent.getStringExtra("one");
                Intent intent1 = getIntent();
                TWO = intent1.getStringExtra("two");
                Intent intent2 = getIntent();
                THREE = intent2.getStringExtra("three");
                Intent intent3 = getIntent();
                FOUR = intent3.getStringExtra("four");
                Intent intent4 = getIntent();
                FIVE = intent4.getStringExtra("five");
                Intent intent5 = getIntent();
                SIX = intent5.getStringExtra("six");
                Intent intent6 = getIntent();
                SEVEN = intent6.getStringExtra("seven");
                startActivity(intentFinal);


            }


        });

        final TextView tv = findViewById(R.id.eightEnd);
        final String name = "There was once a person named " + NAME +
                "." + "Who loved the color " + TWO +
                ". Whose favorite place ever was " + THREE +
                ". There arch nemesis was " + FOUR +
                ". They wished for " + FIVE +
                " more than anything in the world. It was there great weakness! No, their greatness weakness was actually "
                + SIX + ". All they really wanted was to go to their hometown of "
                + SEVEN + ".";

        tv.setText(name);


    }
}
