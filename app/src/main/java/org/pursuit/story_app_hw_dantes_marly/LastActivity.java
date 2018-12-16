package org.pursuit.story_app_hw_dantes_marly;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class LastActivity extends AppCompatActivity {


    static String EXTRA_MESSAGE;
    static String EXTRA_MESSAGE2;
    static String EXTRA_MESSAGE3;
    static String EXTRA_MESSAGE4;
    static String EXTRA_MESSAGE5;
   static String EXTRA_MESSAGE6;
    static String EXTRA_MESSAGE7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);


        ConstraintLayout cl = findViewById(R.id.eightLayout);
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        cl.setBackgroundColor(color);

        final TextView tv = findViewById(R.id.eightEnd);
        String name = "There was once a person named " + EXTRA_MESSAGE + "." + "Who loved the color " + EXTRA_MESSAGE2 + ". Who's favorite place ever was "+ EXTRA_MESSAGE3 + ". There arch nemesis was " + EXTRA_MESSAGE4 + "They wished for " + EXTRA_MESSAGE5 + " more than anything in the world."+ "It was there great weakness! No their greatness weakness was actually " + EXTRA_MESSAGE6 + "." + "All they really wanted was to go to their hometown of " + EXTRA_MESSAGE7+".";
        tv.setText(name);


        Button button = findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentFinal = new Intent(LastActivity.this, LastActivity.class);
                startActivity(intentFinal);


            }


        });



    }
}
