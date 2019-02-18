package org.pursuit.story_app_hw_dantes_marly;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;
public class ThirdActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        EditText EXTRA_MESSAGE3 = findViewById(R.id.thirdEdit);
        final String THREE = EXTRA_MESSAGE3.getText().toString();


        ConstraintLayout cl = findViewById(R.id.thirdLayout);
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        cl.setBackgroundColor(color);


        Button button = findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentThree = new Intent(ThirdActivity.this, FourthActivity.class);
                intentThree.putExtra("three",THREE);
                startActivity(intentThree);

            }


        });
    }

}

