package com.app.mue.trial;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by mue on 3/4/16.
 */
public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        addListenerOnButton();
        addListenerOnButton1();
        addListenerOnButton2();
    }
    public void addListenerOnButton() {
        Button button;

        final Context context = this;

        button = (Button) findViewById(R.id.button7);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, home.class);
                startActivity(intent);

            }

        });

    }
    public void addListenerOnButton1() {
        Button button;

        final Context context = this;

        button = (Button) findViewById(R.id.button8);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, models.class);
                startActivity(intent);

            }

        });

    }
    public void addListenerOnButton2() {
        Button button;

        final Context context = this;

        button = (Button) findViewById(R.id.button9);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, cars.class);
                startActivity(intent);

            }

        });

    }
}
