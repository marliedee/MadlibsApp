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

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ConstraintLayout cl = findViewById(R.id.thirdLayout);
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        cl.setBackgroundColor(color);

        final EditText edText3 = findViewById(R.id.thirdEdit);

        Button button = findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentThree = new Intent(getApplicationContext(), FourthActivity.class);
//                final String str = getIntent().getStringExtra(SecondActivity.EXTRA_MESSAGE2);
//                final String str2 = edText3.getText().toString();
                startActivity(intentThree);
//                intentThree.putExtra(str,str2);
            }


        });
    }

}

