package org.pursuit.story_app_hw_dantes_marly;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Random;


public class FourthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        EditText EXTRA_MESSAGE4 = findViewById(R.id.fourthEdit);
        final String FOUR = EXTRA_MESSAGE4.getText().toString();

        ConstraintLayout cl = findViewById(R.id.fourthLayout);
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        cl.setBackgroundColor(color);

        Button button = findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentFour = new Intent(FourthActivity.this, FifthActivity.class);;
                intentFour.putExtra("four", FOUR);
                startActivity(intentFour);
            }


        });
    }

}

