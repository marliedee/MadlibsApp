package org.pursuit.story_app_hw_dantes_marly;

import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class LastActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        ConstraintLayout cl = findViewById(R.id.eightLayout);
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        cl.setBackgroundColor(color);

//        EditText edText1 = (EditText) findViewById(R.id.firstEdit);
//
//        edText1.setInputType(InputType.TYPE_CLASS_TEXT);
//
//        String str = edText1.getText().toString();

        Button button = findViewById(R.id.button8);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentEight = new Intent(getApplicationContext(), LastActivity.class);
                startActivity(intentEight);
            }


        });



    }
}
