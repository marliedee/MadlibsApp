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

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout cl = findViewById(R.id.firstLayout);
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        cl.setBackgroundColor(color);

//        EditText edText1 = findViewById(R.id.firstEdit);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
//                String str = getIntent().getStringExtra(edText1);
//                intent.putExtra(EXTRA_MESSAGE, str);


            }


        });

    }
}

